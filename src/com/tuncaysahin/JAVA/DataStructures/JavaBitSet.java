package com.tuncaysahin.JAVA.DataStructures;

import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        int m  = scan.nextInt();
        String op;
        int a,b;
        while( m-- > 0 ){
            op = scan.next();
            a = scan.nextInt();
            b = scan.nextInt();

            if(op.equals("AND")){
                if(a == 1){
                    b1.and(b2);
                }else{
                    b2.and(b1);
                }
            }else if(op.equals("OR")){
                if(a == 1){
                    b1.or(b2);
                }else{
                    b2.or(b1);
                }
            }else if(op.equals("XOR")){
                if(a == 1){
                    b1.xor(b2);
                }else{
                    b2.xor(b1);
                }
            }else if(op.equals("SET")){
                if(a == 1){
                    b1.set(b,true);
                }else{
                    b2.set(b,true);
                }
            }else if(op.equals("FLIP")){
                if(a == 1){
                    b1.flip(b);
                }else{
                    b2.flip(b);
                }
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

    }

}
