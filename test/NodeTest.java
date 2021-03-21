import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {

    @Test
    void setData() {
        int data = 5;
        int data2 = 10;
        Node<Integer> node = new Node<Integer>(data);
        assertEquals(node.getData(), data);
        assertNotEquals(node.getData(), data2);
        node.setData(data2);
        assertEquals(node.getData(), data2);
        assertNotEquals(node.getData(), data);
    }

    @Test
    void getData() {
        int data = 5;
        Node<Integer> node = new Node<Integer>(data);
        assertEquals(node.getData(), data);
    }

    @Test
    void setNext() {
        int data = 5;
        Node<Integer> node = new Node<Integer>(data);
        int data2 = 10;
        Node<Integer> node2 = new Node<Integer>(data2);
        assertNull(node.getNext());
        node.setNext(node2);
        assertNotNull(node.getNext());
    }

    @Test
    void getNext() {
        int data = 5;
        Node<Integer> node = new Node<Integer>(data);
        int data2 = 10;
        Node<Integer> node2 = new Node<Integer>(data2);
        assertNull(node.getNext());
        node.setNext(node2);
        assertNotNull(node.getNext());
    }
}