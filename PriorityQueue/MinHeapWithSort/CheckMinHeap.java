package com.project;

public class CheckMinHeap {

    public static void main(String[] args) {
        MinHeap<Integer> minnie= new MinHeap<>(5);
        minnie.add(55);
        minnie.add(25);
        minnie.add(32);
        minnie.add(87);
        minnie.add(18);
        System.out.println(minnie);

        minnie.removeMin();
        System.out.println(minnie);

        System.out.println("The minimum right now is: " + minnie.getMin());
        System.out.println("The size right now is: " + minnie.getSize());
        System.out.println("Is the minheap empty: " + minnie.isEmpty());
        System.out.println("Clearing the minheap now");
        minnie.clear();

        MinHeap<Integer> min = new MinHeap<>(1);
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
