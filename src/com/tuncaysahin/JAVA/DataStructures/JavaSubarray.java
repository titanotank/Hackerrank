package com.tuncaysahin.JAVA.DataStructures;

import java.util.Scanner;

public class JavaSubarray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];

        for(int i = 0; i < n;i++){
            a[i] = scan.nextInt();
        }

        int negative = 0;
        int sum = 0;

        for(int i = 0; i < n ; i++){
            sum = 0;
            for( int j = i ; j < n ; j++){
                sum += a[j];
                if(sum < 0){
                    negative++;
                }
            }
        }

        System.out.println(negative);

    }

}
