package com.tuncaysahin.JAVA.Strings;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternSyntaxChecker {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());

        while(testCases-- > 0){
            String regex = scan.nextLine();

            try{
                Pattern p = Pattern.compile(regex);
                System.out.println("Valid");

            }catch(Exception e){
                System.out.println("Invalid");
            }

        }

    }

}
