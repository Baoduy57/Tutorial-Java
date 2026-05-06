package lab2;

import java.util.Scanner;

public class lab2_bai01 {
//	Cho phương trình ax + b = 0
//	Viết chương trình nhập vào 2 số nguyên a và b. Tính toán nghiệm của phương trình trên

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số a là ");
		int a = scanner.nextInt();
		System.out.println("Nhập số b là ");
		int b = scanner.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float result = (float) -b / a;
			System.out.printf("Nghiệm của phương trình là %.3f", result);
		}
		scanner.close();
	}
}
