package org.example.algorithm;

public class LLMain {
    public static void main(String[] args) {
        LL linkedList = new LL();
        linkedList.insertAtFirst(17);
        linkedList.insertAtFirst(18);
        linkedList.insertAtFirst(19);
        linkedList.insertAtLast(20);
        linkedList.insertAtLast(21);
        linkedList.displayAll();
        linkedList.deleteFirst();
        linkedList.displayAll();
    }
}
