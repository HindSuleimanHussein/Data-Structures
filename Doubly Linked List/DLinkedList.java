package com.project;

public class DLinkedList<T extends Comparable<T>>{
    DNode head;

    public void insertAtHead(T data){
        DNode<T> newNode = new DNode(data);
        if(head!=null){
            head.setPrev(newNode);
            newNode.setNext(head);
        }
        head=newNode;
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

    public boolean find(T data){
        DNode curr = head;
        while(curr!=null){
            if(curr.getData().compareTo(data)==0){
                return true;
            }

            else{
                curr=curr.getNext();
            }
        }
        return false;
    }

    public boolean findRecursion(T data){
        if(head==null){
            System.out.println("No Data");
        }
        return findRecursionPriv(data, head);
    }

    private boolean findRecursionPriv(T data, DNode<T> current){

        if(current!=null){
            if(current.getData().compareTo(data)==0)
                return true;
            else
                return findRecursionPriv(data, current.getNext());
        }
        return false;
    }

    public void insertSorted(T data){
        DNode<T> newNode = new DNode<>(data);
        DNode current=head;

        // insert the node if empty
        if (current == null)
            head = newNode;

            // if the node is to be inserted at the beginning
        else if (current.getData().compareTo(newNode.getData())>=0)
        {
            newNode.setNext(current);
            newNode.getNext().setPrev(newNode);
            head = newNode;
        }

        else
        {
            // locate the node after which the new node is to be inserted
            while (current.getNext() != null && current.getNext().getData().compareTo(newNode.getData())<0)
                current = current.getNext();

            newNode.setNext(current.getNext());

            // if the new node is not inserted at the end of the list
            if (current.getNext() != null)
                newNode.getNext().setPrev(newNode);

            // insert the new Node at the end of the list
            current.setNext(newNode);
            newNode.setPrev(current);

        }
    }



    @Override
    public String toString() {
        DNode curr=head;
        String s="head-->";
        while(curr!=null){
            s+=curr + "-->";
            curr=curr.getNext();
        }
        return s+"Null";
    }





}