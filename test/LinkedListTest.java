import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @Test
    void isEmpty() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        assertEquals(linkedList.size(), 0);
        assertNotEquals(linkedList.size(), 1);
        assertNotEquals(linkedList.size(), 289);
    }

    @Test
    void size() {
        LinkedList<Integer> linkedList = new LinkedList<>();
        assertEquals(linkedList.size(), 0);
        assertNotEquals(linkedList.size(), 289);
    }

    @Test
    void addToFront() throws EmptyListException {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addToFront(555);
        assertEquals(linkedList.size(), 1);
        assertEquals((int) linkedList.removeFirst(), 555);
    }

    @Test
    void removeFirst() throws EmptyListException {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addToFront(5);
        linkedList.addToFront(6);
        linkedList.addToFront(7);
        assertEquals((int) linkedList.removeFirst(), 7);
        assertEquals(linkedList.size(), 2);
    }

    @Test
    void testExpectedException() throws EmptyListException {
        assertThrows(EmptyListException.class, () -> {
            LinkedList<Integer> linkedList = new LinkedList<>();
            linkedList.removeFirst();
        });
    }
}