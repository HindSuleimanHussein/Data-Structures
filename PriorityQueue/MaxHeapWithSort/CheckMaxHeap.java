package com.project;

public class CheckMaxHeap {

    public static void main(String[] args) {
        MaxHeap<Integer> minnie= new MaxHeap<>(5);
        minnie.add(55);
        minnie.add(25);
        minnie.add(32);
        minnie.add(87);
        minnie.add(18);
        System.out.println(minnie);

        System.out.println("Removing max: " + minnie.removeMax());
        System.out.println(minnie);

        System.out.println("The maximum right now is: " + minnie.getMax());
        System.out.println("The size right now is: " + minnie.getSize());
        System.out.println("Is the maxheap empty: " + minnie.isEmpty());
        System.out.println("Clearing the maxheap now");
        minnie.clear();
        System.out.println("Is the maxheap empty: " + minnie.isEmpty());

        MaxHeap<Integer> min = new MaxHeap<>(1);
        Integer[] data = new Integer[]{20, 30, 10, 40, 89, 90, 40, 50};
        System.out.println("\nThe numbers");
        for(Integer i: data) {
            System.out.print(i + " ");
        }

        data=min.heapSort(data);
        System.out.println("\nThe numbers sorted");
        for(Integer i: data) {
            System.out.print(i + " ");
        }
    }

}
