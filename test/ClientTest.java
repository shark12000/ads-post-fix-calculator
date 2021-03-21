import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    void evaluateExpression() throws MalformedExpressionException {
        Client client = new Client();
        ArrayList<Token> tokenArrayList = new ArrayList<>(Arrays.asList(
                new Operand(5),
                new Operand(2),
                new Operator(Operation.MULTIPLICATION)
        ));
        assertEquals(client.evaluateExpression(tokenArrayList), 10);
    }
}