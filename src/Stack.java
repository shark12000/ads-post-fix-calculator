public interface Stack<T> {
    public boolean isEmpty();
    public void push(T elm);
    public T pop() throws EmptyListException;
}
