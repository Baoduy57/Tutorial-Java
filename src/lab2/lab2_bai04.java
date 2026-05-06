package lab2;

import java.util.Scanner;

public class lab2_bai04 {
	public static void main(String[] args) {
		System.out.println(">>      LỰA CHỌN TÍNH NĂNG     <<");
		System.out.println("++ --------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai  |");
		System.out.println("| 3. Tính số tiền điện          |");
		System.out.println("| 4. Kết thúc                   |");
		System.out.println("++ --------------------------- ++");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Lựa chọn của bạn là");
		int choose = scanner.nextInt();

		switch (choose) {
		case 1:
			System.out.println("Cho phương trình ax + b = 0");
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
				scanner.close();
			}
			break;

		case 2:
			System.out.println("Cho phương trình ax^2 + bx + c = 0");
			System.out.println("Nhập số a là ");
			int a1 = scanner.nextInt();
			System.out.println("Nhập số b là ");
			int b1 = scanner.nextInt();
			System.out.println("Nhập số c là ");
			int c1 = scanner.nextInt();

			if (a1 == 0) {
				if (b1 == 0 && c1 == 0) {
					System.out.println("Phương trình có vô số nghiệm");
				} else if (b1 == 0 && c1 != 0) {
					System.out.println("Phương trình vô nghiệm");
				} else {
					float result = (float) -c1 / b1;
					System.out.printf("Nghiệm của phương trình là %.3f", result);
				}
			} else {
				double delta = Math.pow(b1, 2) - 4 * a1 * c1;
				if (delta < 0) {
					System.out.println("Phương trình vô nghiệm");
				} else if (delta == 0) {
					double x = -b1 / (2 * a1);
					System.out.println("Phương trình có nghiệm kép là " + x);
				} else {
					double x1 = (-b1 + Math.sqrt(delta)) / (2 * a1);
					double x2 = (-b1 - Math.sqrt(delta)) / (2 * a1);
					System.out.println("Phương trình có 2 nghiệm phân biệt là " + x1 + " và " + x2);

				}
			}
			break;

		case 3:
			System.out.println("Nhập số điện ");
			int x = scanner.nextInt();

			if (x < 0) {
				System.out.println("Số điện không hợp lệ");
			} else if (x <= 100) {
				int result = x * 1000;
				System.out.println("Số tiền phải trả là " + result);
			} else if (x >= 100) {
				int result = (100 * 1000) + ((x - 100) * 1500);
				System.out.println("Số tiền phải trả là " + result);
			}
			break;

		default:
			System.out.println("Bạn đã lựa chọn thoát chương trình");
			System.exit(0);
		}
	}

}
