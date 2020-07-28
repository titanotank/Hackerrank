package com.tuncaysahin.JAVA.DataStructures;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaArraylist {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();

        for(int i = 0 ; i < n ; i++){

            String[] ar = scan.nextLine().split(" ");
            ArrayList<Integer> subList = new ArrayList<Integer>();
            for(int j = 1 ; j <= Integer.parseInt(ar[0]) ; j++){
                subList.add(Integer.parseInt(ar[j]));
            }
            list.add(subList);
        }


        int q = Integer.parseInt(scan.nextLine());
        int x,y = 0;
        while(q-->0){
            x = scan.nextInt();
            y = scan.nextInt();

            if(list.size() >= x && list.get(x-1).size() >= y ){
                System.out.println(list.get(x-1).get(y-1));
            }else{
                System.out.println("ERROR!");
            }

        }

    }

}
