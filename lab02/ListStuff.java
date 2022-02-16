import java.util.*;

/**
 * Performs basic list operations with Linked Lists and arrays
 * @author Green, Collin
 */
public class ListStuff {
    /**
     * Adds a String to the front of a Linked List
     * @param s String to be added to the front of the list
     * @param Nold Linked list to add s to the front of
     * @return Linked list with string s at the front of it
     */
    public static StringNode addToFront(String s, StringNode Nold) {
        StringNode n = new StringNode();
        n.data = s;
        if (Nold != null){
            n.next = Nold;
        }

        return n;
    }
    /**
     * Converts a linked list into a String[] array
     * @param N Linked list to be converted to an array
     * @return Array containing the same ordered values as linked list
     */
    public static String[] listToArray(StringNode N) {
        //Create empty array, copy array and make it 1 element longer, add data from list into array
        String[] list = null;
        for(StringNode p = N; p != null; p = p.next){
            String data = p.data;
            String[] newList = Arrays.copyOf(list, list.length + 1);
            newList[list.length] = data;
            list = newList;
        }
        return list;
    }
}
