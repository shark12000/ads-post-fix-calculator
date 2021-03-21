import java.util.EmptyStackException;

public class CalculatorVisitor implements Visitor, Calculator{

    private final LinkedStack<Token> tokenStack = new LinkedStack<>();

    @Override
    public void visit(Operand operand) {
        pushOperand(operand);
    }

    @Override
    public void visit(Operator operator) {
        performOperation(operator);
    }

    @Override
    public int getResult() throws MalformedExpressionException {
        try {
            return ((Operand) tokenStack.pop()).getValue();
        } catch (EmptyStackException e) {
            throw new MalformedExpressionException("");
        }
    }

    private void pushOperand(Operand operand) {
        tokenStack.push(operand);
    }

    private void performOperation(Operator operator){
        try {
            Token value1 = tokenStack.pop();
            Token value2 = tokenStack.pop();


            if(value1 instanceof Operator || value2 instanceof Operator) {
                throw new MalformedExpressionException("Impossible to do calculations");
            }

            if(!(value1 instanceof Operand) || !(value2 instanceof Operand)) {
                throw new MalformedExpressionException("Impossible to do calculations without two operands");
            }

            Operand val1 = (Operand) value1;
            Operand val2 = (Operand) value2;

            switch (operator.getOperation()) {
                case PLUS -> {
                    tokenStack.push(new Operand(val1.getValue() + val2.getValue()));
                }
                case MINUS -> {
                    tokenStack.push(new Operand(val1.getValue() - val2.getValue()));
                }
                case MULTIPLICATION -> {
                    tokenStack.push(new Operand(val1.getValue() * val2.getValue()));
                }
                case DIVISION -> {
                    tokenStack.push(new Operand(val1.getValue() / val2.getValue()));
                }
            }
        } catch (MalformedExpressionException e) {
            e.getMessage();
        }

    }
}
