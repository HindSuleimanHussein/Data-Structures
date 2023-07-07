public class Driver {

    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();

        tree.insert(55);
        tree.insert(50);
        tree.insert(45);
        tree.insert(40);
        tree.insert(60);
        tree.insert(65);
       tree.insert(70);


        System.out.print("tree in order: ");
        tree.traverseInOrder();

        System.out.println();
        System.out.println("Deleting: " + tree.delete(90));

        System.out.print("tree in order: ");
        tree.traverseInOrder();



        System.out.println();

        System.out.print("tree in post: ");
        tree.traversePost();


        System.out.println();
        System.out.println("number of even: "+ tree.countEven());
        System.out.println("size: "+ tree.size());

        System.out.print("The Leaves in order: ");
        tree.traverseInOrderLeaves();
        System.out.println();
        System.out.println("height: " + tree.height());

        if(tree.find(55)!=null){
            System.out.println(tree.find(55) + "is avalible");
        }

        else
            System.out.println("not avalible");



        System.out.println("The Tree is AVL: " + tree.isAVL());
    }

}