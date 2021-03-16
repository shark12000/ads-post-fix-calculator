public class CalculatorVisitor implements Visitor, Calculator{

    LinkedStack<Token> tokenStack = new LinkedStack<>();

    @Override
    public void visit(Operand operand) {

    }

    @Override
    public void visit(Operator operator) {

    }

    @Override
    public int getResult() {
        return 0;
    }

    private void pushOperand(Operand operand) {

    }

    private void performOperation(Operator operator) {

    }
}
