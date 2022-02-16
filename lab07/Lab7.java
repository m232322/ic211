public class Lab7 {
    public static void main(String[] args){
        if (args.length < 2){
            System.out.println("usage: java Lab7 <infilename> <numDays>");
        }
        else{
            // create a random object for use
            Random rand;
            if( args.length == 3 )
                rand = new Random(Long.parseLong(args[2]));
            else{
                rand = new Random(System.currentTimeMillis());
            }

            String path = args[0];
            int numDays = args[1];
            
        }
    }
}
