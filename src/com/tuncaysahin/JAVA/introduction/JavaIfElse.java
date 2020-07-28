package com.tuncaysahin.JAVA.introduction;

import java.util.Scanner;

public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        if(N%2 == 0 && (N < 6 || N > 20)){
            System.out.println("Not Weird");
        }else{
            System.out.println("Weird");
        }

        // 2. Option
        /*if(N%2 == 1 || (N >= 6 && N <= 20)){
            System.out.println("Weird");
        }else{
            System.out.println("Not Weird");
        }
        */

        scanner.close();
    }

}
