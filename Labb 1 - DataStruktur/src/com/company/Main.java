package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        ListFunctions<Integer> list = new ListFunctions<>();
        Scanner sc = new Scanner(System.in);
        boolean loop = false;

        for (int i = 0; i < 10; i++){
            list.add(i);
        }
         Queue<Integer> que = new Queue<>(list);


        que.dequeue();
        que.enqueue(15);
        que.enqueue(42);
        que.dequeue();
        System.out.println(que.quePeek());

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " -> ");
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
                case 9 -> loop = false;
                default -> System.out.println("\nPlease enter a number between 1-9\n");
            }
        }
    }

    private void printMenu(){
        System.out.print("""
         (1) Print out the list
         (2) Add to the top of the list
         (3) Add to the list and specify index
         (4) Remove the node at specific index
         (5) Get the value of specific index
         (6) Print the size of the list
         (7) Check if the list contains a specific value
         (8) Check if the list is empty
         (9) Exit
         Choice: """);
    }
}
