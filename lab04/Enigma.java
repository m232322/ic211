import java.util.Scanner;

/**
 * Models the Enigma machine
 * @author Green, Collin
 */
public class Enigma {
    private Rotor inner;
    private Rotor middle;
    private Rotor outer;

    /**
     * Constructor class for an Enigma object
     * @param in number specification for the inside rotor
     * @param mid number specification for the middle rotor
     * @param out number specification for the outside rotor
     * @param key 3-letter key to sync the machine to
     */
    public Enigma(int in, int mid, int out, String key){
        Rotor r1 = new Rotor("#GNUAHOVBIPWCJQXDKRYELSZFMT");
        Rotor r2 = new Rotor("#EJOTYCHMRWAFKPUZDINSXBGLQV");
        Rotor r3 = new Rotor("#BDFHJLNPRTVXZACEGIKMOQSUWY");
        Rotor r4 = new Rotor("#NWDKHGXZVRIFJBLMAOPSCYUTQE");
        Rotor r5 = new Rotor("#TGOWHLIFMCSZYRVXQABUPEJKND");

        /**
         * Choose rotors based on input 
         */
        Rotor[] R = {r1, r2, r3, r4, r5};
        this.inner = R[in-1];
        this.middle = R[mid-1];
        this.outer = R[out-1];

        /**
         * Synce rotors to encoding key
         */
        this.inner.rotate(key.charAt(0));
        this.middle.rotate(key.charAt(1));
        this.outer.rotate(key.charAt(2));
    }

    /**
     * Encrypt a message
     * @param encode message to be encrypted
     * @return encrypted message
     */
    public String encrypt(String encode){
        int in_count = 0;
        int mid_count = 0;

        String encoded = "";
        for(int i = 0; i < encode.length(); i++){
            /**
             * Get updated strings for rotors
             */
            String inner_full = this.inner.getFull();
            String middle_full = this.middle.getFull();
            String outer_full = this.outer.getFull();

            /**
             * Find char on inner rotor,
             * Find char on outer rotor with same index,
             * Find same char on middle rotor,
             * Find char on outer rotor with same index
             */
            char in = encode.charAt(i);
            int inner_index = inner_full.indexOf(in);
            char outer_char = outer_full.charAt(inner_index);
            int mid_index = middle_full.indexOf(outer_char);
            char out = outer_full.charAt(mid_index);

            encoded = encoded + out;
            
            /**
             * Rotate rotors in lockstep depending on count
             */
            this.inner.rotate(1);
            in_count += 1;
            if(in_count == 27){
                in_count = 0;
                this.middle.rotate(1);
                mid_count += 1;
            }
            if(mid_count == 27){
                mid_count = 0;
                this.outer.rotate(1);
            }
        }
        return encoded;
    }

    /**
     * Decrypt a message
     * @param decode message to decrypt
     * @return decrypted message
     */
    public String decrypt(String decode){
        int in_count = 0;
        int mid_count = 0;

        String decoded = "";

        for(int i = 0; i < decode.length(); i++){
            /**
             * Get updated strings for rotors
             */
            String inner_full = this.inner.getFull();
            String middle_full = this.middle.getFull();
            String outer_full = this.outer.getFull();

            /**
             * Find char on outer rotor
             * Find char on middle rotor with same index
             * Find same char on outer rotor
             * Find char with same index on inner rotor
             */
            char in = decode.charAt(i);
            int out_index = outer_full.indexOf(in);
            char mid = middle_full.charAt(out_index);
            int out_index_2 = outer_full.indexOf(mid);
            char out = inner_full.charAt(out_index_2);

            decoded = decoded + out;

            /**
             * Rotate rotors in lockstep depending on count
             */
            this.inner.rotate(1);
            in_count += 1;
            if(in_count == 27){
                in_count = 0;
                this.middle.rotate(1);
                mid_count += 1;
            }
            if(mid_count == 27){
                mid_count = 0;
                this.outer.rotate(1);
            }
        }
        return decoded;
    }
}
