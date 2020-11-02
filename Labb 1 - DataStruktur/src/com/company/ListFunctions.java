package com.company;

public class ListFunctions <E> {

    static class Node <E> {
        protected E value;
        protected Node<E> next;
    }

    private Node<E> head;

    public void add(E value) {
        Node<E> newNode = new Node<>();
        newNode.value = value;
        newNode.next = null;
        if (head == null) {
            head = newNode;
        } else {
            Node<E> last = head;
            while(last.next !=null) {
                last = last.next;
            }
            last.next = newNode;
        }
    }

    public void add(int index, E value) {
        Node<E> newNode = new Node<>();
        newNode.value = value;
        newNode.next = null;
        int i = 0;
        Node<E> last = head;
        while(i < index-1) {
            last = last.next;
            i++;
        }
        last.next = newNode;
    }

    public void remove(int i) {

    }

    public E get(int index) {
        int i = 0;
        Node<E> last = head;
        while (i < index){
            last = last.next;
            i++;
        }
        return last.value;
    }

    public boolean contains(E value) {
        boolean doesContain = false;
        Node<E> last = head;
        while (last.next != null) {

            if (value.equals(last.value)){
                doesContain = true;
                break;
            }
            last = last.next;

        } return doesContain;
    }

    public int size() {
        if (head == null) {
            return 0;
        }
        Node<E> last = head;
        int tempValue = 0;
        while(last.next !=null) {
            last = last.next;
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
