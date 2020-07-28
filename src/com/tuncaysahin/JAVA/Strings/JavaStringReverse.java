package com.tuncaysahin.JAVA.Strings;

import java.util.Scanner;

public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean result = true;

        char[] s = scan.nextLine().toCharArray();

        for(int i = 0; i < s.length/2; i++){
            if(s[i] != s[s.length-i-1]){
                result = false;
                break;
            }
        }

        System.out.println(result ? "Yes" : "No");


    }

}
