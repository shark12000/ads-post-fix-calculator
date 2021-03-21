import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorVisitorTest {

    @Test
    void getResult() throws MalformedExpressionException {
        CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
        Operand operand1 = new Operand(4);
        Operand operand2 = new Operand(5);
        calculatorVisitor.visit(operand1);
        calculatorVisitor.visit(operand2);
        calculatorVisitor.visit(new Operator(Operation.PLUS));
        assertEquals(calculatorVisitor.getResult(), 9);
    }

    @Test
    void getMalformedException() {
        assertThrows(MalformedExpressionException.class, () -> {
        CalculatorVisitor calculatorVisitor = new CalculatorVisitor();
        calculatorVisitor.getResult();
    }); }
}