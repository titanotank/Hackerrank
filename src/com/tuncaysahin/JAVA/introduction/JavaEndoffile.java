package com.tuncaysahin.JAVA.introduction;

import java.util.Scanner;

public class JavaEndoffile {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int i = 0;
        while(scan.hasNext()){
            System.out.println(++i + " " +scan.nextLine());
        }

    }

}
