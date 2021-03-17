public class EmptyListException extends Exception{

    public EmptyListException(String message) {
        super(message);
    }

    public String getMessage() {
        return "List is empty";
    }
}
