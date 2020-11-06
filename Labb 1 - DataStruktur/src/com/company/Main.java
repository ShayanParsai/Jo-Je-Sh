package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        Queue<Integer> que = new Queue<>(list); // opererar i vår nuvarande länkade lista
        Queue<Integer> createQue = new Queue<>(); // Skapar en ny kö

        Stack<Integer> stack = new Stack<>(list); // opererar i vår nuvarande länkade lista
        Stack<Integer> createStack = new Stack<>(); // Skapar en ny stack

        Scanner sc = new Scanner(System.in);
        Main main = new Main();

        boolean loop = true;

        for (int i = 0; i < 10; i++){
           list.add(i);
        }

        System.out.println("\nLinked list handler\nThe list starts with 10 nodes, with the values 0-9\n");

        while (loop){
            main.printMenu();
            int menuChoice = sc.nextInt();

            switch (menuChoice) {
                case 1 -> {
                    System.out.print("\n");
                    for (int i = 0; i < list.size(); i++) {
                        System.out.print(list.get(i) + " -> ");
                    }
                    System.out.print("\n\n");
                }
                case 2 -> {
                    System.out.print("\nValue: ");
                    int value = sc.nextInt();
                    list.add(value);
                    System.out.print("\n");
                }
                case 3 -> {
                    System.out.print("\nValue: ");
                    int addValue = sc.nextInt();
                    System.out.print("\nIndex: ");
                    int index = sc.nextInt();
                    list.add(index,addValue);
                    System.out.print("\n");
                }
                case 4 -> {
                    System.out.print("\nIndex: ");
                    int removeIndex = sc.nextInt();
                    list.remove(removeIndex);
                    System.out.print("\n");
                }
                case 5 -> {
                    System.out.print("\nIndex: ");
                    int getIndex = sc.nextInt();
                    System.out.println("\nThat value is: " + list.get(getIndex) + "\n");
                }
                case 6 -> System.out.println("\nThe size of the list is: " + list.size() + "\n");
                case 7 -> {
                    System.out.print("\nValue: ");
                    int containsValue = sc.nextInt();
                    System.out.println("\nDoes the list contain that value: " + list.contains(containsValue) + "\n");
                }
                case 8 -> System.out.println("\nIs the list empty: " + list.empty() + "\n");
                case 9 -> {
                    System.out.print("\nValue: ");
                    int enqueueValue = sc.nextInt();
                    que.enqueue(enqueueValue);
                    System.out.print("\n");
                }
                case 10 -> System.out.println("\n" + que.dequeue() + " Was dequeued\n");
                case 11 -> System.out.println("\nYou peek and find: " + que.peek() + "\n");
                case 12 -> {
                    System.out.print("\nValue: ");
                    int pushValue = sc.nextInt();
                    stack.push(pushValue);
                    System.out.print("\n");
                }
                case 13 -> System.out.println("\n" + stack.pop() + " Was dequeued\n");
                case 14 -> System.out.println("\nYou peek and find: " + stack.peek() + "\n");
                case 15 -> loop = false;
                default -> System.out.println("\nPlease enter a number between 1-12\n");
            }
        }
    }

    private void printMenu(){
        System.out.print("""
         ------------------------------
                  Linked List
         (1) Print out the list
         (2) Add to the top of the list
         (3) Add to the list and specify index
         (4) Remove the node at specific index
         (5) Get the value of specific index
         (6) Print the size of the list
         (7) Check if the list contains a specific value
         (8) Check if the list is empty
         ------------------------------
                     QUEUE
         (9) Enqueue an element into index 0
         (10) Dequeue the element on the last index
         (11) Peek the element on the last index
         ------------------------------
                     STACK 
         (12) Push an element onto the top of the list
         (13) Pop an element from the top of the list
         (14) Peek at the top element
         (15) Exit
         Choice: """);
    }
}
