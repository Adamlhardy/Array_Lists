package Array_Lists;

public class MyLinkedList<T> {
    Node<T> head = null;

    public void AddFront(T data) {
        Node<T> newnNode = new Node<T>(data);
        if(head == null){
            head = newnNode;
        } else {
            newnNode.next = head;
            head = newnNode;
        }
    }

    @Override
    public String toString() {
        Node<T> currentNode = head;
        String returString = "";

        while(currentNode != null){
            returString += currentNode.data.toString();
        }

        return returString;
    }
}
