import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperandTest {

    @Test
    void getValue() {
        Operand operand = new Operand(5);
        assertEquals(operand.getValue(), 5);
        assertNotEquals(operand.getValue(), 6);
        Operand operand2 = new Operand(5);
        assertEquals(operand2.getValue(), operand.getValue());
    }
}