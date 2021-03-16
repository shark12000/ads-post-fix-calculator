import java.util.EmptyStackException;

public class LinkedStack<T> implements Stack<T>{

    private final LinkedList<T> list = new LinkedList<>();

    @Override
    public boolean isEmpty() {
        return list.size() == 0;
    }

    @Override
    public void push(T elm) {
        list.addToFront(elm);
    }

    @Override
    public T pop() throws EmptyListException {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        return list.removeFirst();
    }
}
