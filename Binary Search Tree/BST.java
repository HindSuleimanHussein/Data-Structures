

public class BST<T extends Comparable<T>> {

    BSTNode<T> root;


    public void traverseInOrder() {
        traverseInOrder(root);
    }

    private void traverseInOrder(BSTNode node) {
        if (node != null) {
            if (node.getLeft() != null)
                traverseInOrder(node.getLeft());
            System.out.print(node + " ");
            if (node.getRight() != null)
                traverseInOrder(node.getRight());
        }
    }

    public void traversePost() {
        traversePost(root);
    }

    private void traversePost(BSTNode node) {
        if (node != null) {
            if (node.getLeft() != null)
                traversePost(node.getLeft());
            if (node.getRight() != null)
                traversePost(node.getRight());
        }

        System.out.print(node + " ");
    }


    public void insert(T data) {
        if (root == null)
            root = new BSTNode<T>(data);
        else
            insert(data, root);
    }

    public void insert(T data, BSTNode node) {
        if (data.compareTo((T) node.getData()) >= 0) {
            if (!node.hasRight())
                node.setRight(new BSTNode(data));
            else
                insert(data, node.getRight());
        } else {
            if (!node.hasLeft())
                node.setLeft(new BSTNode(data));
            else
                insert(data, node.getLeft());

        }
    }

    public int countEven() {
        return countEven(root);
    }

    private int countEven(BSTNode node) {
        if (node == null)
            return 0;
        int leftEven = countEven(node.getLeft());
        int rightEven = countEven(node.getRight());
        if (((int) node.getData()) % 2 == 0) {
            return 1 + leftEven + rightEven;
        }

        return leftEven + rightEven;
    }

    public int size() {
        return size(root);
    }

    private int size(BSTNode<T> node) {
        if (node == null) {
            return 0;
        }

        return 1 + size(node.getLeft()) + size(node.getRight());
    }

    public void traverseInOrderLeaves() {
        traverseInOrderLeaves(root);
    }

    private void traverseInOrderLeaves(BSTNode node) {
        if (node != null) {
            if (node.isLeaf()) {
                System.out.print(node + " ");
            } else {
                traverseInOrderLeaves(node.getLeft());
                traverseInOrderLeaves(node.getRight());
            }

        }
    }

    public int height() {
        return height(root);
    }

    private int height(BSTNode node) {
        if (node == null)
            return 0;
        int left = height(node.getLeft());
        int right = height(node.getRight());
        return 1 + ((left > right) ? left : right);
    }


    public BSTNode find(T data) {
        return find(data, root);
    }

    public BSTNode find(T data, BSTNode node) {
        if (node != null) {
            if (node.getData().compareTo(data) == 0)
                return node;
            else if (node.getData().compareTo(data) > 0 && node.hasLeft())
                return find(data, node.getLeft());
            else if (node.getData().compareTo(data) < 0 && node.hasRight())
                return find(data, node.getRight());
        }
        return null;
    }

    public BSTNode<T> delete(T data) {
        BSTNode current = root;
        BSTNode parent = root;
        boolean isLeftChild = false;

        if(isEmpty())
            return root;


        while (current != null && !current.getData().equals(data)) {
                parent = current;
                if (data.compareTo((T) current.getData()) < 0) {
                    current = current.getLeft();
                    isLeftChild = true;
                } else {
                    current = current.getRight();
                    isLeftChild = false;
                }
            }
            if (current == null)
                return null; // node to be deleted not found


            // case 1: node is a leaf
            if (!current.hasLeft() && !current.hasRight()) {
                if (current == root) // tree has one node
                    root = null;

                else {
                    if (isLeftChild)
                        parent.setLeft(null);

                    else
                        parent.setRight(null);
                }
            } else if (current.hasLeft() && !current.hasRight()) { // current has left child only
                if (current == root) {
                    root = current.getLeft();
                } else if (isLeftChild) {
                    parent.setLeft(current.getLeft());
                } else {
                    parent.setRight(current.getLeft());
                }
            } else if (current.hasRight() && !current.hasRight()) { // current has right child only
                if (current == root) {
                    root = current.getRight();
                } else if (isLeftChild) {
                    parent.setLeft(current.getRight());
                } else {
                    parent.setRight(current.getRight());
                }
            } else {
                BSTNode<T> successor = getSuccessor(current);
                if (current == root)
                    root = successor;
                else if (isLeftChild) {
                    parent.setLeft(successor);
                } else {
                    parent.setRight(successor);
                }
                successor.setLeft(current.getLeft());


            }

        return current;
        }

    private BSTNode<T> getSuccessor(BSTNode node) {
        BSTNode parentOfSuccessor = node;
        BSTNode successor = node;
        BSTNode current = node.getRight();
        while (current != null) {
            parentOfSuccessor = successor;
            successor = current;
            current = current.getLeft();
        }
        if (successor.getData().compareTo(node.getRight().getData())!=0) { // fix successor connections
            parentOfSuccessor.setLeft(successor.getRight());
            successor.setRight(node.getRight());
        }
        return successor;
    }

    public boolean isEmpty() {
        return (root == null);
    }

    public boolean isAVL(){
    	return isAVL(root);

    }

    private boolean isAVL(BSTNode node){
    	if(node!=null){
    		if(Math.abs(height(node.getLeft()) - height(node.getRight()))>1)

    			return false;

    		return isAVL(node.getLeft()) && isAVL(node.getRight());
    	}

    	return true;

    }



}