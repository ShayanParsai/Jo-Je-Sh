package com.company;

public class ListFunctions <E> {

    private static class Node <E> {
        E value;
        Node<E> next;

        Node(E value) {
            this.value = value;
        }
    }

    private Node<E> head;

    public void add(E value) {
        if (head == null) {
            head = new Node<>(value);
        } else {
            Node<E> current = head;
            while(current.next !=null) {
                current = current.next;
            }
            current.next = new Node<>(value);
        }
    }

    public void add(int index, E value) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            Node<E> temp = head;
            head = new Node<>(value);
            head.next = temp;
            return;
        }
        int i = 0;
        Node<E> current = head;
        Node<E> next = head.next;
        while(i < index-1) {
            current = current.next;
            next = current.next;
            i++;
        }
        Node<E> newNode = new Node<>(value);
        current.next = newNode;
        newNode.next = next;
    }

    public void remove(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        if (index == 0) {
            head = head.next;
            return;
        }
        int i = 0;
        Node<E> previous = null;
        Node<E> current = head;
        while(i < index) {
            previous = current;
            current = current.next;
            i++;
        }
        previous.next = current.next;
    }

    public E get(int index) {
        if (index < 0 || index >= size())
            throw new IndexOutOfBoundsException();

        int i = 0;
        Node<E> current = head;
        while (i < index){
            current = current.next;
            i++;
        }
        return current.value;
    }

    public boolean contains(E value) {
        boolean doesContain = false;
        Node<E> current = head;
        while (current != null) {
            if (value.equals(current.value)){
                doesContain = true;
                break;
            }
            current = current.next;
        }
        return doesContain;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        Node<E> current = head;
        int tempValue = 0;
        while(current.next !=null) {
            current = current.next;
            tempValue ++;
        }
        return tempValue + 1;
    }

    public boolean empty() {
        return head == null;
    }

    // ========== Stack functions =============== //

    public void push(int i) {

    }

    public void pop() {

    }

    public void stackPeek() {

    }

    // ========== Que functions =============== //

    public void enqueue(int i) {

    }

    public void dequeue() {

    }

    public void quePeek() {

    }
}