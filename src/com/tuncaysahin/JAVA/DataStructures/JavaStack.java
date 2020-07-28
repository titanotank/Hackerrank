package com.tuncaysahin.JAVA.DataStructures;

import java.util.Scanner;
import java.util.Stack;

public class JavaStack {
    static char[]  open = {'(','{','['};
    static char[]  closed = {')','}',']'};

    public static boolean isOpen(char c){
        for(char a :open){
            if(a == c){
                return true;
            }
        }
        return false;
    }

    public static int index(char c){
        for(int i = 0 ; i < open.length;i++){
            if(c == open[i] || c == closed[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack;
        char[] arr;
        char c;
        while (sc.hasNext()) {
            arr = sc.next().toCharArray();
            //Complete the code
            stack = new Stack<Character>();
            for(int i = 0 ; i < arr.length ; i++){
                c = arr[i];
                if(isOpen(c)){
                    stack.push(c);
                }else{
                    if(stack.size() == 0){
                        stack.push(c);
                    }
                    if(open[index(c)] == stack.peek()){
                        stack.pop();
                    }
                }
            }
            System.out.println(stack.isEmpty());
        }
    }}
