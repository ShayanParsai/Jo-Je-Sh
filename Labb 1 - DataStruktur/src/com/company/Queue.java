package com.company;

public class Queue<E> {

    private final LinkedList<E> linkedlist;

    public Queue() {
        linkedlist = new LinkedList<>();
    }
    public Queue (LinkedList<E> source){
        linkedlist = source;
    }

    public void enqueue(E e) {
        if (linkedlist.size() > 0) {
            linkedlist.add(0,e);
        }else {
            linkedlist.add(e);
        }
    }

    public E dequeue() {
        int dequeueIndex = (linkedlist.size()-1);
        E value = linkedlist.get(dequeueIndex);
        linkedlist.remove(dequeueIndex);
        return value;
    }

    public E peek() {
        int peekIndex = (linkedlist.size()-1);
        return linkedlist.get(peekIndex);
    }
}