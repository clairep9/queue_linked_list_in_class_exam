package org.example;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class QueueMethodTest {

    private QueueMethod func;

    @Before
    public void setUp() {
        func = new QueueMethod();
        func.queueDemo(); // Initialize the queue before each test
    }

    @Test
    public void testAddFruitsToQueue() {
        assertEquals(4, func.getQueueSize());
        assertEquals("apple", func.peekAtHeadOfQueue());
        func.addFruitToQueue("grape");
        assertEquals(5, func.getQueueSize());
        assertEquals("apple", func.peekAtHeadOfQueue());
    }

    @Test
    public void testAddDuplicateFruitToQueue() {
        func.addFruitToQueue("lemon");
        assertEquals(5, func.getQueueSize());
        assertEquals("apple", func.peekAtHeadOfQueue());
    }

    @Test
    public void testRemoveFruitFromQueue() {
        String removedFruit = func.removeFruitFromQueue();
        assertEquals("apple", removedFruit);
        assertEquals(3, func.getQueueSize());
        assertEquals("lemon", func.peekAtHeadOfQueue());
    }

    @Test
    public void testPeekAtHeadOfQueue() {
        assertEquals("apple", func.peekAtHeadOfQueue());
        assertEquals(4, func.getQueueSize()); // Peek should not change the size
    }

    @Test
    public void testGetQueueSize() {
        assertEquals(4, func.getQueueSize());
    }

    @Test
    public void testQueueOrder() {
        assertEquals("apple", func.removeFruitFromQueue());
        assertEquals("lemon", func.removeFruitFromQueue());
        assertEquals("banana", func.removeFruitFromQueue());
        assertEquals("orange", func.removeFruitFromQueue());
        assertEquals(0, func.getQueueSize());
    }
}

