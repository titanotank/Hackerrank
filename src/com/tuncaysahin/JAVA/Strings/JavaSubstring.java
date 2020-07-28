package com.tuncaysahin.JAVA.Strings;

import java.util.Scanner;

public class JavaSubstring {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String A = scan.nextLine();
        int start = scan.nextInt();
        int end = scan.nextInt();

        System.out.println(A.substring(start,end));


    }

}
