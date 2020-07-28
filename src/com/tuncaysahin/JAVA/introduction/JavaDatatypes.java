package com.tuncaysahin.JAVA.introduction;

import java.util.Scanner;

public class JavaDatatypes {

    public static void main(String []args)
    {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        for(int i = 0 ; i < q ; i++){
            try{
                long l = scan.nextLong();
                System.out.println(l + " can be fitted in:");

                if(l <= Byte.MAX_VALUE && l >= Byte.MIN_VALUE){
                    System.out.println("* byte");
                }

                if(l <= Short.MAX_VALUE && l >= Short.MIN_VALUE){
                    System.out.println("* short");
                }

                if(l <= Integer.MAX_VALUE && l >= Integer.MIN_VALUE){
                    System.out.println("* int");
                }

                if(l <= Long.MAX_VALUE && l >= Long.MIN_VALUE){
                    System.out.println("* long");
                }

            }catch(Exception e){
                System.out.println(scan.next() + " can't be fitted anywhere.");
            }
        }


    }

}
