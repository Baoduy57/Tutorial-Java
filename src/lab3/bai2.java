package lab3;

import java.util.Scanner;

public class bai2 {
//	Viết bảng cửu chương của 1 số nguyên bất kỳ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập 1 số nguyên bất kì ");
		int value = sc.nextInt();

		System.out.printf("Bảng cửu chương của số %d \n", value);
		for (int i = 1; i <= 10; i++) {
			System.out.printf("%d x %d = %d \n", value, i, value * i);
		}
		sc.close();
	}
}
