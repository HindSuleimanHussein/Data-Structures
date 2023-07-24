package com.project;

public class DLinkedList<T extends Comparable<T>>{
    DNode head;

    public void insertAtHead(T data){
        DNode<T> newNode = new DNode(data);
        if(head!=null){
            DNode<T> headPrev = head.getPrev();
            newNode.setNext(head);
            newNode.setPrev(headPrev);
            head.setPrev(newNode);
            headPrev.setNext(head.getPrev());

        }
        else {
            newNode.setPrev(newNode);
            newNode.setNext(newNode.getPrev());
        }
        head=newNode;
    }

    public void insertBegin(int value) {
        if (head == null) {
            DNode new_node = new DNode();
            new_node.data = value;
            new_node.next = new_node.prev = new_node;
            head = new_node;
            return;
        }
        // Pointer points to last Node
        DNode last = head.prev;

        DNode new_node = new DNode();
        new_node.data = value; // Inserting the data

        // setting up previous and next of new node
        new_node.next = head;
        new_node.prev = last;

        // Update next and previous pointers of start
        // and last.
        last.next = (head).prev = new_node;

        // Update start pointer
        head = new_node;
    }

    public void delete(T data) {
        DNode current = head;
        if (head != null) {
            do {
                if (current.getData().equals(data)) {
                    if (current == head) {
                        head = head.getNext();
                        head.setPrev(current.getPrev());
                        current.getPrev().setNext(head);
                    } else {
                        current.getPrev().setNext(current.getNext());
                        current.getNext().setPrev(current.getPrev());
                    }
                    return;
                }
                current = current.getNext();
            } while (current != head);
        }
    }



    public DNode getNext(){
        return head.getPrev();
    }

    public void insertAtLast(T data){
        DNode<T> newNode = new DNode(data);
        DNode<T> current =head;
        while(current!=null && current.getNext()!=null){
            current=current.getNext();
        }
        if(current==null){
            head=newNode;
        }
        else{
            newNode.setPrev(current);
            current.setNext(newNode);
        }
    }

    public boolean find(T search) {
        DNode temp = head;
        if(temp == null)
            return false;
        else {
            while(temp.getNext() != head) {
                if(temp.getData().equals(search)) {
                    return true;
                }
                temp = temp.getNext();
            }

            if(temp.getData().equals(search)) {
                return true;
            }
        }
        return false;
    }

    void deleteAllNodes() {
        if(this.head != null) {
            DNode temp, current;
            current = head.getNext();
            while(current != this.head) {
                temp = current.getNext();
                current = temp;
            }
            head = null;
        }
    }



    @Override
    public String toString() {
        DNode curr=head;
        if(head==null){
            return null;
        }
        String s="head-->";
        while(curr.getNext()!=head){
            s+=curr + "-->";
            curr=curr.getNext();
        }
        s+=curr+"-->";
        return s+"Null";
    }






}