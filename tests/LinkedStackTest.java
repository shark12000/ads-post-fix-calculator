import org.junit.jupiter.api.Test;
import java.util.EmptyStackException;
import static org.junit.jupiter.api.Assertions.*;


class LinkedStackTest {

    @Test
    void isEmpty() {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        assertTrue(linkedStack.isEmpty());
        linkedStack.push(5);
        assertFalse(linkedStack.isEmpty());
        linkedStack.pop();
        assertTrue(linkedStack.isEmpty());
    }

    @Test
    void push() {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        linkedStack.push(5);
        assertFalse(linkedStack.isEmpty());
    }

    @Test
    void pop() {
        LinkedStack<Integer> linkedStack = new LinkedStack<>();
        linkedStack.push(5);
        assertFalse(linkedStack.isEmpty());
        linkedStack.pop();
        assertTrue(linkedStack.isEmpty());
    }

    @Test
    void testEmptyStackException() {
        assertThrows(EmptyStackException.class, () -> {
            LinkedStack<Integer> linkedStack = new LinkedStack<>();
            linkedStack.pop();
        });
    }
}