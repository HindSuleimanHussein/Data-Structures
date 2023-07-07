package com.project;

public class Main {
    public static void main(String[] args) {
        AvlTree<Integer> tree = new AvlTree<>();
        tree.insert(75);
        tree.insert(55);
        tree.insert(60);
        tree.insert(88);
        tree.insert(17);
        tree.insert(65);
        tree.insert(66);
        tree.traverseInOrder();
        tree.delete(88);
        System.out.println(tree.levelOrder());
        System.out.println("with root:" + tree.levelOrder(tree.root));
        tree.printHeight();
        System.out.println();
        tree.traverseInOrder();
        System.out.println();
        if(tree.find(88)==null){
            System.out.println("The number is nonexistent");
        }
        else{
            System.out.println("The number " + tree.find(88) + " exists");
        }

        System.out.println(tree.levelOrder(tree.root));
        System.out.print("height: ");
        tree.printHeight();







    }
}
