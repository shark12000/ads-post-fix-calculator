public class Operator extends Token {
    private Operation operation;

    public void accept(CalculatorVisitor visitor) {
        visitor.visit(this);
    }

    public Operation getOperation() {
        return operation;
    }
}
