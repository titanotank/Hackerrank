package com.tuncaysahin.JAVA.Strings;

import java.util.Scanner;

public class JavaStringTokens {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();

        String[] tokens = s.split("[ !,?._'@]+");

        System.out.println(s.length() == 0 ? "0" : tokens.length );

        for(String token : tokens){
            System.out.println(token);
        }



    }

}
