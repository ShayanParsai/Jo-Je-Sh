package com.company;

public class Stack<E> {

    private final LinkedList<E> linkedlist;

    public Stack() {
        linkedlist = new LinkedList<>();
    }
    public Stack(LinkedList<E> source){
        linkedlist = source;
    }

    public void push(E i) {
        linkedlist.add(i);
    }

    public E pop() {
        int popIndex = (linkedlist.size()-1);
        E value = linkedlist.get(popIndex);
        linkedlist.remove(popIndex);
        return value;
    }

    public E peek() {
        int peekIndex = (linkedlist.size()-1);
        return linkedlist.get(peekIndex);
    }
}
