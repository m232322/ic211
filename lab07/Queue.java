/**
 * Simulates queue in a linked list
 * @author Green, Collin
 */
public class Queue {
    private Node head;
    private Node tail;

    /**
     * Provided code for Node
     */
    private class Node {
        public BudgetEvent data;
        public Node next;
        public Node(BudgetEvent d, Node n) {
            data = d;
            next = n;
        }
    }
    
    /**
     * adds Tweet to the back of the queue
     * @param t Tweet to be added to the back
     */
    public void enqueue(BudgetEvent b) {
        Node n = new Node(b, null);
        if(this.empty()){
            this.head = n;
            this.tail = n;
        }
        else{
            this.tail.next = n;
            this.tail = n;
        }
    }

    /**
     * returns true if the queue is empty
     * @return boolean for emptiness
     */
    public boolean empty() {
        if(this.head == null){
            return true;
        }
        return false;
    }

    public void dateSearch(MyDate search){
        String out;
        for(Node p = this.head; p != null; p = p.next){
            System.out.print(search);
            if(p.data.happensToday(search)){
                System.out.print(p.data);
            }
        }
    }
}

  