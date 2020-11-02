package com.company;

public class Main {

    public static void main(String[] args) {
        ListFunctions<Integer> list = new ListFunctions<>();

        // ====================================== //

        for (int i = 0; i < 10; i++){
            list.add(i);
        }

        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " -> ");
        }

        System.out.println("\nif the list contains 5 = " + list.contains(5));
        System.out.println("the size of the list = " + list.size());
        System.out.println("is the list empty = " + list.empty());

    }
}
