package tutorial_java;

import java.util.Scanner;

public class lab1_bai02 {
//	Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
//	Tính toán và in ra console:
//	- chu vi hình chữ nhật
//	- diện tích hình chữ nhật
//	- cạnh nhỏ nhất của hình chữ nhật

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập chiều dài hình chữ nhật");
		double chieu_dai = scanner.nextDouble();

		System.out.println("Nhập chiều rộng hình chũ nhật");
		double chieu_rong = scanner.nextDouble();

		if (chieu_dai < chieu_rong) {
			return;
		} else if (chieu_dai <= 0 || chieu_rong <= 0) {
			return;
		}

		System.out.println("Chu vi hình chữ nhật là " + (chieu_dai + chieu_rong) * 2);
		System.out.println("Diện tích hình chữ nhật là " + chieu_dai * chieu_rong);
		System.out.println("Cạnh nhỏ nhất hình chữ nhật là " + Math.min(chieu_dai, chieu_rong));
		scanner.close();
	}

}
