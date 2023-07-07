package com.project;

public class Main {

    public static void main(String[] args) {
        int[] list= {55, 55, 55};
        System.out.println(isPalindrome(list));
    }

    public static boolean isPalindrome(int[] list){
        return isPalindrome(list, 1, list.length-1);
    }
    private static boolean isPalindrome(int[] list, int i, int j) {
        if (i < j) {
            if (list[i] != list[j])
                return false;
            return isPalindrome(list, i+1, j-1);
        }
        return true;
    }
}
