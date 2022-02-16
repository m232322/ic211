/**
 * Simulates a queue for a linked list
 * @author Green, Collin
 */
public class Queue {
    Node head;
    Node tail;

    /**
     * Provided code for Node
     */
    private class Node {
        public String data;
        public Node next;
        public Node(String d, Node n) {
            data = d;
            next = n;
        }
    }
    
    /**
     * adds s to the back of the queue
     * @param s to be added to the queue
     */
    public void enqueue(String s) {
        Node n = new Node(s, null);
        if(this.empty()){
            this.head = n;
            this.tail = n;
        }
        else{
            this.tail.next = n;
            this.tail = tail.next;
        }
        
    }

    /**
     * removes and returns string at the front of the queue
     * @return String at the head of the queue
     */
    public String dequeue() {
        Node n = head;
        head = head.next;
        return n.data;
    }

    /**
     * returns true if the queue is empty
     * @return boolean for emptiness
     */
    public boolean empty() {
        if(head == null){
            return true;
        }
        return false;
    }
}

  