package com.tuncaysahin.JAVA.introduction;

import java.util.Scanner;

public class JavaLoopsI {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i = 0; i <10; i++ ){
            System.out.println(N + " x " + (i+1) + " = " + (N*(i+1)));
        }

        scanner.close();
    }

}
