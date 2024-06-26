package org.example.algorithm;

import java.util.List;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }
//    Insert at first
    public void insertAtFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
//    Display all
    public void displayAll() {
        System.out.print(" START ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print(" END ");
    }

//    Insert at last
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

//    Insert at index
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

//    Delete first
    public void deleteFirst() {
        if (head.next != null) {
            head = head.next;
        } else {
            head = null;
            tail = null;
        }
        size--;
    }

//    Delete last
    public void deleteLast() {
        if (size <= 1) {
            deleteFirst();
        } else {
            tail = getNode(size - 2);
            tail.next = null;
        }
    }

//    Delete at index
    public void deleteNodeAtIndex(int index) {
        if (index == 0) {
            deleteFirst();
        } else if (index == size - 1) {
            deleteLast();
        } else {
            Node temp = getNode(index - 1);
            temp.next = temp.next.next;
        }
    }

//    Get node by value
    public Node getNodeByValue(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

//    Get node
    public Node getNode(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

//    Insert by recursion
//    public void insertByRecursion(){
//
//    }
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
