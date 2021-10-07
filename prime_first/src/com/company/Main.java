package com.company;

import java.util.Scanner;

public class Main {
    public static boolean isPrimeNumber(int n) {
        if (n < 2) {
            return false;
        }
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số lượng cần in ra");
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 0; count <= number; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
                count ++;
            }
        }
    }
}
