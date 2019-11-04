package deqo.mtuf.mysimplestack;

import java.util.EmptyStackException;
import java.util.ArrayList;

public class MySimpleStack implements SimpleStack {

    private ArrayList<Item> liste = new ArrayList<>();

    @Override
    public boolean isEmpty() {
        return liste.isEmpty();
    }

    @Override
    public int getSize() {
        return liste.size();
    }

    @Override
    public void push(Item o) {
        liste.add(o);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return liste.get(liste.size()-1);
    }

    @Override
    public Item pop() throws EmptyStackException {
        Item e;
        e = peek();
        liste.remove(liste.size()-1);
        return e;
    }
}
