package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    int money, month;
	double rate;
	Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập lãi suất 1 năm: ");
        rate = scanner.nextDouble();
        System.out.println("Nhập số tiền: ");
        money = scanner.nextInt();
        System.out.println("Nhập số tháng vay: ");
        month = scanner.nextInt();
        for (int i = 1; i <= month; i++){
            double interest = money * rate/100/12;
            money += interest;
        }
        System.out.println("Tiền lãi sau " + month + " tháng là " + money + " VND");
    }
}
