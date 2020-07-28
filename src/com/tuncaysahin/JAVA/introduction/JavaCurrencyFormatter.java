package com.tuncaysahin.JAVA.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat formatUs = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat formatIn = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
        NumberFormat formatChi = NumberFormat.getCurrencyInstance(Locale.SIMPLIFIED_CHINESE);
        NumberFormat formatFr = NumberFormat.getCurrencyInstance(Locale.FRANCE);

        String us = formatUs.format(payment);
        String india = formatIn.format(payment);
        String china = formatChi.format(payment);
        String france = formatFr.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }

}
