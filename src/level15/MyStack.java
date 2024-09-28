package level15;

import java.util.LinkedList;
import java.util.List;

public class MyStack {
    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.addFirst(s);
    }

    public String pop() {
        return storage.removeFirst();
    }

    public String peek() {
        return storage.getFirst();
    }

    public boolean empty(){
        return storage.isEmpty();
    }

    public int search(String s){
        return storage.indexOf(s);
    }

}
