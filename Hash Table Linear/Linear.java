package com.project;

public class Linear <Hind extends Comparable<Hind>> {
    HNode[] hash;
    int capacity;
    int key, m;

    public Linear(int capacity) {
        m = capacity;
        hash= new HNode[m];
    }

    public void insert(Hind data){
        key=Math.abs(data.hashCode());
        int h0=key%m;
        int index=Math.abs(h0), i=0;
        while(hash[index]!=null && !hash[index].isEmpty()){
            i++;
            index=(h0+i)%m;
        }

        hash[index]=new HNode(data);
    }

    public Hind find(Hind data){
        key=data.hashCode()%m;
        int h0=key%m;
        int index=h0, i=0;
        while(hash[index]!=null && !hash[index].isEmpty()){
            if(hash[index].getData().equals(data)){
                return (Hind) hash[index].getData();
            }
            i++;
            index=(h0+i)%m;
        }
        return null;
    }


    public Hind delete(Hind data){
        key=data.hashCode()%m;
        int h0=key%m;
        int index=h0, i=0;
        while(hash[index]!=null && !hash[index].isEmpty()){
            if(hash[index].getData().equals(data)){
                hash[index].setFlag(HNode.DELETED);
                return (Hind) hash[index].getData();
            }
            i++;
            index=(h0+i)%m;
        }
        return null;
    }



    @Override
    public String toString() {
        String s="index\tdata\n";
        for(int i=0; i<hash.length; i++){
            s+=i+"\t" + hash[i] + "\n";
        }

        return s;
    }




}