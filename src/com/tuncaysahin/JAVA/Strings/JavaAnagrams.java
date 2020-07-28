package com.tuncaysahin.JAVA.Strings;

import java.util.Scanner;

public class JavaAnagrams {

    static boolean isAnagram(String a, String b) {

        if(a.length() != b.length() || a.equals("") || b.equals("")){
            return false;
        }

        a = a.toLowerCase();
        b = b.toLowerCase();

        char c = ' ';
        int index = 0;
        for(int i = 0 ; i < a.length() ; i++){
            c = a.charAt(i);
            index = b.indexOf(c);
            if(index != -1){
                b = b.substring(0,index)  +""+ b.substring(index+1);
            }else{
                return false;
            }

        }

        return b.equals("");

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}
