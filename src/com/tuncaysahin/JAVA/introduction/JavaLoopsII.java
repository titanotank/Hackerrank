package com.tuncaysahin.JAVA.introduction;

import java.util.Scanner;

public class JavaLoopsII {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int k = 0; k < n ; k++){
                a += b;
                System.out.print(a + " ");
                b *= 2;
            }
            System.out.println();
        }
        in.close();
    }

}
