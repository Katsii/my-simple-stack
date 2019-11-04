package deqo.mtuf.mysimplestack;

import org.junit.Test;

import static org.junit.Assert.*;


public class MySimpleStackTest {



    @Test
    public void isEmpty() {
        SimpleStack pile = new MySimpleStack();
        SimpleStack pile1 = new MySimpleStack();
        pile1.push(new Item());
        assertTrue(pile.isEmpty());
        assertFalse(pile1.isEmpty());

    }

    @Test
    public void getSize() {
        SimpleStack pile = new MySimpleStack();
        SimpleStack pile1 = new MySimpleStack();
        pile1.push(new Item());
        assertEquals(pile.getSize(),0);
        assertEquals(pile1.getSize(),1);
    }

    @Test
    public void push() {
        SimpleStack pile = new MySimpleStack();
        SimpleStack pile1 = new MySimpleStack();
        pile1.push(new Item());
        assertTrue(pile.isEmpty());
        assertFalse(pile1.isEmpty());
    }

    @Test
    public void peek() {
        SimpleStack pile = new MySimpleStack();
        Item e = new Item();
        pile.push(e);
        assertEquals(pile.peek(),e);
    }

    @Test
    public void pop() {
        SimpleStack pile = new MySimpleStack();
        Item e = new Item();
        pile.push(e);
        assertEquals(pile.pop(),e);
        assertTrue(pile.isEmpty());
    }
}