package Array_Lists;

public class MyLinkedList<T> {
    private Node<T> head = null;
    private int size = 0;

    public void AddFront(T data) {
        Node<T> newnNode = new Node<T>(data);
        if(head == null){
            head = newnNode;
        } else {
            newnNode.next = head;
            head = newnNode;
        }
        size++;
    }

    /**
     * Adds a new node to the end of the LinkedList
     */
    public void Append(T data) {
        Node<T> currentNode = head;

        while (currentNode.next != null) {
         currentNode = currentNode.next;   
        }

        //once we have our current last node
        Node<T> newNode = new Node<T>(data); // create new node and ensure it's null
        currentNode.next = newNode; // set the next of the old last node equal to the new node
        size++;
    }

    // 1
    public void Insert(int index) {
        Node<T> currentNode = head;
        int currentIndex = 0;

        for(int i = 0; i < index; i++) {

        }
    }

    @Override
    public String toString() {
        Node<T> currentNode = head;
        String returString = "";

        while(currentNode != null){
            returString += currentNode.data.toString();
            currentNode = currentNode.next;
        }

        return returString;
    }

    public int GetSize() {
        return size;
    }
}
