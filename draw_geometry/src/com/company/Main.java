package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    int choice = 1;
	    Scanner scanner = new Scanner(System.in);
	    while (choice != 0) {
            System.out.println("1. Vẽ hình chữ nhật.");
            System.out.println("2. Vẽ tam giác vuông.");
            System.out.println("3. Vẽ tam giác cân.");
            System.out.println("0. Kết thúc chương trình.");
            System.out.println("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập chiều dài: ");
                    int dai = scanner.nextInt();
                    System.out.println("Nhập chiều rộng: ");
                    int rong = scanner.nextInt();
                    for (int i = 0; i < rong; i++) {
                        for (int j = 0; j < dai; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                case 2:
                    System.out.println("Nhập chiều rộng: ");
                    int chieuDai = scanner.nextInt();
                    for (int i = 0; i <= chieuDai; i++) {
                        for (int j = 0; j < i; j++) {
                            System.out.print("*");
                        }
                        System.out.println("");
                    }
                case 3:
                    System.out.println("Nhập chiều dài cạnh bên (số lẻ): ");
                    int doDai = scanner.nextInt();
                    if (doDai < 2) {
                        System.out.println("Vui lòng nhập số lớn hơn 1");
                    } else {
                        for (int i = 1; i <= doDai; i++) {
                            for (int j = 1; j < doDai*2; j++) {
                                if (i == doDai || j == (doDai + 1) - i || j == i + (doDai - 1)) {
                                    System.out.print("*");
                                } else {
                                    System.out.print(" ");
                                }
                            }
                            System.out.println("");
                        }
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Không có tùy chọn!");
            }
        }
    }
}
