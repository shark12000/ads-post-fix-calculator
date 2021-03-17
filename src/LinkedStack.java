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
    public T pop()  {
        if(isEmpty()) {
            throw new EmptyStackException();
        }

        T object = null;
        try {
          object = list.removeFirst();
        } catch (EmptyListException emptyListException) {
            emptyListException.getMessage();
        }
        return object;
    }
}
