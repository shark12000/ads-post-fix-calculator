public class LinkedList<T> implements List<T> {
    private Node<T> head;
    private int size = 0;

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void addToFront(T data) {
        Node<T> newNode = new Node<T>(data);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    @Override
    public T removeFirst() throws EmptyListException {
        if(isEmpty()) {
            throw new EmptyListException("List is empty");
        }

        Node<T> temp = head;
        head = head.getNext();
        temp.setNext(null);
        size--;

        return temp.getData();
    }
}
