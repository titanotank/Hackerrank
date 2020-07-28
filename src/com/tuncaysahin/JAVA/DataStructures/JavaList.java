package com.tuncaysahin.JAVA.DataStructures;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class JavaList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new LinkedList<Integer>();
        while(n-->0){
            list.add(scan.nextInt());
        }

        int q = scan.nextInt();
        while(q-->0){
            if(scan.next().equals("Insert")){
                list.add(Integer.parseInt(scan.next()),Integer.parseInt(scan.next()));
            }else{
                list.remove(Integer.parseInt(scan.next()));
            }

        }

        for(int i = 0; i < list.size();i++){
            System.out.print(list.get(i) + " ");
        }

    }

}
