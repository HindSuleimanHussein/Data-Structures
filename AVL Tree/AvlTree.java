package com.project;
import java.util.ArrayList;

    public class AvlTree<T extends Comparable<T>>{
        AvlNode<T> root;

        public AvlTree() {
        }

        public void insert(T key) {
            root = insert(root, key);
        }

        private AvlNode<T> insert(AvlNode<T> root, T key) {
            if (root == null) {
                return new AvlNode<T>(key);
            }
            if (key.compareTo(root.getData()) < 0) {
                root.setLeft(insert(root.getLeft(), key));
            } else {
                root.setRight(insert(root.getRight(), key));
            }
            return rebalance(root);
        }

        private AvlNode rebalance(AvlNode root){
            if (root == null) {
                return root;
            }
            int balance = getBalance(root);
            if (balance > 1) {
                if (getBalance(root.getLeft()) > 0) {
                    root = rotateRight(root);
                } else {
                    root = rotateLeftRight(root);
                }
            } else if (balance < -1) {
                if (getBalance(root.getRight()) < 0) {
                    root = rotateLeft(root);
                } else {
                    root = rotateRightLeft(root);
                }
            }
            return root;
        }

        private int getBalance(AvlNode<T> root) {
            if (root == null) {
                return 0;
            }
            return getHeight(root.getLeft()) - getHeight(root.getRight());
        }

        private int getHeight(AvlNode<T> curr) {
            if (curr == null)
                return 0;
            if (curr.isLeaf())
                return 1;
            else
                return Math.max(1 + getHeight(curr.getLeft()), 1 + getHeight(curr.getRight()));
        }

        public AvlNode<T> rotateRight(AvlNode<T> node) {
            AvlNode<T> nodeC = node.getLeft();
            node.setLeft(nodeC.getRight());
            nodeC.setRight(node);
            return nodeC;
        }

        public AvlNode<T> rotateLeft(AvlNode<T> node) {
            AvlNode<T> nodeC = node.getRight();
            node.setRight(nodeC.getLeft());
            nodeC.setLeft(node);
            return nodeC;
        }

        public AvlNode<T> rotateRightLeft(AvlNode<T> node) {
            AvlNode<T> nodeC = node.getRight();
            node.setRight(rotateRight(nodeC));
            return rotateLeft(node);
        }

        public AvlNode<T> rotateLeftRight(AvlNode<T> node) {
            AvlNode<T> nodeC = node.getLeft();
            node.setLeft(rotateLeft(nodeC));
            return rotateRight(node);
        }

        public boolean isEmpty() {
            return root==null;
        }

        public void traverseInOrder() {
            traverseInOrder(root);
        }

        private void traverseInOrder(AvlNode<T> node) {
            if (node != null) {
                if (node.getLeft() != null)
                    traverseInOrder(node.getLeft());
                System.out.print(node + " ");
                if (node.getRight() != null)
                    traverseInOrder(node.getRight());
            }
        }

        public AvlNode delete(T data) {
            AvlNode temp = deleteSuper(data);
            if(temp!= null){
                AvlNode rootNode = root;
                root = rebalance(rootNode);
            }
            return temp;
        }

        private AvlNode<T> deleteSuper(T data) {
            AvlNode current = root;
            AvlNode parent = root;
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
                return null;


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
                AvlNode<T> successor = getSuccessor(current);
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

        private AvlNode<T> getSuccessor(AvlNode node) {
            AvlNode parentOfSuccessor = node;
            AvlNode successor = node;
            AvlNode current = node.getRight();
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

        public AvlNode find(T data) {
            return find(data, root);
        }

        public AvlNode find(T data, AvlNode node) {
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


        public ArrayList<Integer> levelOrder() {
            return levelOrder(root);
        }

        public ArrayList<Integer> levelOrder(AvlNode node) {
            Queue<AvlNode> queue = new Queue<>();
            ArrayList<Integer>ans=new ArrayList<>();
            queue.enqueue(node);
            while(!queue.isEmpty()){
                node=queue.dequeue();
                if(node.getLeft()!=null){
                    queue.enqueue(node.getLeft());
                }
                if(node.getRight()!=null){
                    queue.enqueue(node.getRight());
                }
                ans.add((Integer) node.getData());
            }
            return ans;
        }

        public void printHeight(){
            int h=getHeight(root);
            System.out.println(h);
        }




}