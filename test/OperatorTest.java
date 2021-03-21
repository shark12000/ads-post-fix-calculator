import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatorTest {

    @Test
    void getOperation() {
        Operator operator = new Operator(Operation.DIVISION);
        assertEquals(operator.getOperation(), Operation.DIVISION);
    }
}