package com.tuncaysahin.JAVA.Strings;

import java.util.Scanner;

public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String A = scan.nextLine();
        String B = scan.nextLine();

        System.out.println(A.length()+B.length());

        System.out.println((A.compareTo(B)) > 0 ? "Yes" : "No");

        System.out.println(A.substring(0,1).toUpperCase()+A.substring(1) + " "
                + B.substring(0,1).toUpperCase() + B.substring(1)
        );

    }

}
