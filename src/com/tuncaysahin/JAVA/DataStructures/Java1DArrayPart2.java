package com.tuncaysahin.JAVA.DataStructures;

import java.util.Scanner;

public class Java1DArrayPart2 {

    public static boolean canWin(int leap, int[] game) {

        return jump(leap,game,0);

    }

    public static boolean jump(int step,int[] ar,int i){
        if( i < 0 || ar[i] == 1) return false;

        if( i == ar.length-1 || i + step >= ar.length ) return true;

        ar[i] = 1;

        return jump(step,ar,i-1) || jump(step,ar,i+1) || jump(step,ar,i+step);

    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        int[] arr = new int[0];
        int leap = 0;
        while (q-- > 0) {
            int n = scan.nextInt();
            leap = scan.nextInt();
            arr = new int[n];
            for(int i = 0 ; i < n ; i++){
                arr[i] = scan.nextInt();
            }

            System.out.println(canWin(leap,arr) ? "YES" : "NO");

        }
        scan.close();
    }

}
