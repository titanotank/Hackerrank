package com.tuncaysahin.JAVA.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());
        boolean match = false;
        while(testCases>0){
            String line = in.nextLine();
            match = false;

            //Write your code here
            Matcher m = Pattern.compile("<(.+)>([^<]+)</\\1>").matcher(line);

            while(m.find()){
                System.out.println(m.group(2));
                match = true;
            }

            if(!match){
                System.out.println("None");
            }

            testCases--;
        }
    }

}
