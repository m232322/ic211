public class RecogPDF extends RecogASCII{
    /**
     * Returns the name of the category this tests for.
     */
    public String getName() {
        return "PDF";
    }
    
      /**
       * Processes the next bye of the file.
       */
    public void feed(int nextByte) {
       if (getState() == 2) { // 2 : unknown
          if ((header[i] >= 0) && (nextByte != header[i])) {
            setState(0);       // 0 : not match
          }
        }
        i++;
    
        if ((i >= header.length) && (getState() != 0)) {
            setState(1); // 1 : match
        }
    }
    
      /**
       * Returns true if the file (as processed so far) is an
       * ASCII file.
       */
    boolean decision() {
        return state != 0;
    }
    
      /**
       * The recognizer's states are 0, 1 and 2.
       * 2 means status of file unknown, 0 means definitely not a
       * a match (e.g. not an ASCII file), and 1 means definitely
       * a match.  This method returs the current state of the
       * recognizer.
       */
    public int getState() {
        return state;
    }
    
      /**
       * Sets the recognizer's state (see above).
       */
    public void setState(int v) {
        state = v;
    }
    
    private int state = 2; // 2 : unknown, 1 : match, 0 : not match
    private int i = 0;
    private static int[] header = {0x25, 0x50, 0x44, 0x46}; //%PDF
}
