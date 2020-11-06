package com.company;

public class Queue<E> {
    private final ListFunctions<E> linkedlist;
    public Queue (ListFunctions<E> source){
        linkedlist = source;
    }

    public void enqueue(E e) {
    linkedlist.add(0,e);
    }

    public E dequeue() {
        int dequeueIndex = (linkedlist.size()-1);
        E value = linkedlist.get(dequeueIndex);
        linkedlist.remove(dequeueIndex);
        return value;
    }

    public E quePeek() {
        int dequeueIndex = (linkedlist.size()-1);
        return linkedlist.get(dequeueIndex);
    }
}
