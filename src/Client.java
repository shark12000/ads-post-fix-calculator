import java.util.ArrayList;
import java.util.Arrays;

public class Client {
    private final CalculatorVisitor calculatorVisitor = new CalculatorVisitor();


    public int evaluateExpression(ArrayList<Token> tokenList) {
        for (Token token: tokenList) {
           token.accept(calculatorVisitor);
        }

        return calculatorVisitor.getResult();
    }

    public static void main(String[] args) {
        Client client = new Client();

        ArrayList<Token> tokenArrayList = new ArrayList<>(Arrays.asList(
                new Operand(5),
                new Operand(2),
                new Operator(Operation.MULTIPLICATION)
        ));
        System.out.println("result: " + client.evaluateExpression(tokenArrayList));
    }
}
