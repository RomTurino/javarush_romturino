package level14;

import java.util.ArrayList;

public class StringLinkedList {
    private Node first = new Node();
    private Node last = new Node();


    public StringLinkedList() {
        first.next = last;
        last.prev = first;
    }

    public void printAll() {
        Node currentElement = first.next;
        while ((currentElement != null) && (currentElement != last)) {
            System.out.println(currentElement.value);
            currentElement = currentElement.next;
        }
    }

    public void add(String value) {
        Node newNode = new Node();
        newNode.value = value;

        Node prevLast = last.prev;
        prevLast.next = newNode;
        newNode.prev = prevLast;
        newNode.next = last;


        last.prev = newNode;
    }

    public String get(int index){
        Node currentElement = first.next;
        for (int i = 0; i < index; i++) {
            currentElement = currentElement.next;
            if (currentElement == null) {
                return null;
            }
        }
        return currentElement.value;
    }

    public static class Node {
        private Node prev;
        private String value;
        private Node next;
    }


}
