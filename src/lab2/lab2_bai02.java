package lab2;

import java.util.Scanner;

public class lab2_bai02 {
//	Cho phương trình: ax^2 + bx + c = 0
//	Viết chương trình nhập vào 3 số nguyên a, b, c. Tính toán nghiệm của phương trình trên

	public static void giaiPhuongTrinhBacNhat(int a, int b) {
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số nghiệm");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô nghiệm");
		} else {
			float result = (float) -b / a;
			System.out.printf("Nghiệm của phương trình là %.3f", result);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số a là ");
		int a = scanner.nextInt();
		System.out.println("Nhập số b là ");
		int b = scanner.nextInt();
		System.out.println("Nhập số c là ");
		int c = scanner.nextInt();

		if (a == 0) {
			giaiPhuongTrinhBacNhat(b, c);
		} else {
			double delta = Math.pow(b, 2) - 4 * a * c;
			if (delta < 0) {
				System.out.println("Phương trình vô nghiệm");
			} else if (delta == 0) {
				float x = (float) -b / (2 * a);
				System.out.printf("Phương trình có nghiệm kép là %.3f", x);
			} else {
				double x1 = (-b + Math.sqrt(delta)) / (2 * a);
				double x2 = (-b - Math.sqrt(delta)) / (2 * a);
				System.out.printf("Phương trình có 2 nghiệm phân biệt là x1 = %.3f, x2 = %.3f", x1, x2);

			}
		}
		scanner.close();
	}
}
