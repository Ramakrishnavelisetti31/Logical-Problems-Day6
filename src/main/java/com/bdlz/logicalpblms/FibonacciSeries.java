package com.bdlz.logicalpblms;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {

        int a = 0, b = 1, c;
        System.out.println("Enter Number");

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.print(a + " " + b);
        for (int i = 1; i < n; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
}
