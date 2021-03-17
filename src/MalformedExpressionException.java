public class MalformedExpressionException  extends Exception{
    public MalformedExpressionException(String message) {
        super(message);
    }

    public String getMessage() {
        return "Malformed expression exception";
    }
}
