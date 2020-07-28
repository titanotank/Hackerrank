package com.tuncaysahin.JAVA.BigNumber;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        BigInteger i1 = new BigInteger(scan.nextLine());
        BigInteger i2 = new BigInteger(scan.nextLine());

        System.out.println(i1.add(i2) + "\n" + i1.multiply(i2));

    }

}
