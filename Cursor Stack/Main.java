package com.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File stack = new File("/Users/hindsuleiman/CursorArray/src/com/project/Node.java");
        String str = "";
        if (stack.exists()) {
            Scanner sc = new Scanner(stack);
            while (sc.hasNext()) {
                String s = sc.nextLine();
                str += filter(s);
            }

            System.out.println(str);
            System.out.println(checkBalance(str));
            System.out.println(checkBalanceIf(str));

        } else {
            System.out.println("File Does Not Exist");
        }

    }

    private static String filter(String s) {
        String sl = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '}' || c == '[' || c == ']' || c == '(' || c == ')')
                sl += c;
        }
        return sl;

    }

    public static boolean checkBalance(String s) {
        LinkedStack<Character> stack = new LinkedStack<>(30);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c + "") {
                case "(":
                case "{":
                case "[":

                    stack.push(c);
                    break;

                case ")":
                case "}":
                case "]":
                    if (stack.isEmpty())
                        return false;
                    char o = stack.pop();
                    if (!((c == '}' && o == '{') || (c == ']' && o == '[') || (c == ')' && o == '(')))
                        return false;
            }
        }
        return (stack.isEmpty()) ? true : false;
    }

    public static boolean checkBalanceIf(String s) {
        LinkedStack<Character> stack = new LinkedStack<>(30);
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);

            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty())
                    return false;
                char o = stack.pop();
                if (!((c == '}' && o == '{') || (c == ']' && o == '[') || (c == ')' && o == '(')))
                    return false;
            }
        }
        return (stack.isEmpty()) ? true : false;
    }
}