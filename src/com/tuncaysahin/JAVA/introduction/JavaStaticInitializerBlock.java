package com.tuncaysahin.JAVA.introduction;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

    private static Scanner scan = new Scanner(System.in);
    private static int B = scan.nextInt();
    private static int H = scan.nextInt();
    private static boolean flag = false;
    static{
        if(B > 0 && H > 0){
            flag = true;
        }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    // Otomatik Gelen Kod

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}
