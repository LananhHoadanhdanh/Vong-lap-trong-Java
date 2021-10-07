package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int number;
	boolean isPrime = true;
	Scanner scanner = new Scanner(System.in);
	System.out.println("Nhập số cần kiểm tra:");
	number = scanner.nextInt();
	if (number < 2) {
		System.out.println(number + " không phải là số nguyên tố.");
	} else {
		int i = 2;
		while (i <= Math.sqrt(number)) {
			if (number % i == 0) {
				isPrime = false;
				break;
			}
			i++;
		}
	}
	if (isPrime) {
		System.out.println(number + " là số nguyên số.");
	} else {
		System.out.println(number + " không phải là số nguyên tố.");
	}
    }
}
