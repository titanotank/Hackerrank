package com.tuncaysahin.JAVA.DataStructures;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String []argh)
    {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        Map<String,String> phoneBook = new HashMap<String,String>();

        while(n-->0){
            phoneBook.put(scan.nextLine(),scan.nextLine());
        }

        while(scan.hasNextLine()){
            String query = scan.nextLine();
            String queryResult = phoneBook.get(query);
            if(queryResult == null){
                System.out.println("Not found");
            }else{
                System.out.println(query + "=" +queryResult);
            }
        }

    }

}
