package org.example.algorithm;

import java.util.List;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void displayAll() {
        System.out.print(" START ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print(" END ");
    }

    public void insertAtLast(int val) {
        if (tail == null) {
            insertAtFirst(val);
        } else {
            Node node = new Node(val);
            tail.next = node;
            tail = node;
        }
        size += 1;
    }

    public void insertAtIndex(int val, int index) {
        if (index == 0) {
            insertAtFirst(val);
        }
        if (index == size) {
            insertAtLast(val);
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
            System.out.println("temp.value " + temp.value);
        }
        temp.next = new Node(val, temp.next);
        size += 1;
    }

    public void deleteFirst() {
        if(head.next!=null){
            head=head.next;
        }else {
            head=null;
        }
    }
    public void deleteLast(){
        Node temp = head;
        while(temp!=null){
            temp=temp.next;
        }
        temp=null;
        size-=1;
    }

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node node) {
            this.value = value;
            this.next = node;
        }
    }
}