package com.project;

public class HNode <Hind extends Comparable<Hind>>{
    public static final char DELETED='D';
        public static final char EMPTY='E';
        public static final char FULL='F';
        private Hind data;
        private char flag=EMPTY;

        public HNode(Hind data) {
            this.data = data;
            flag=FULL;
        }
        public Hind getData() {
            return data;
        }
        public void setData(Hind data) {
            this.data = data;
        }

        public boolean isFull(){
            return flag==FULL;
        }

        public boolean isEmpty(){
            return flag==EMPTY;
        }

        public boolean isDeleted(){
            return flag==DELETED;
        }


        public char getFlag() {
            return flag;
        }
        public void setFlag(char flag) {
            this.flag = flag;
        }
        @Override
        public String toString() {
            return "[data=" + data + "-" + flag + "]";
        }






}
