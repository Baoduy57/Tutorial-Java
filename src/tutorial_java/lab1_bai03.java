package tutorial_java;

import java.util.Scanner;

public class lab1_bai03 {
//	Viết chương trình nhập vào bàn phím cạnh của một khối lập phương.
//	Tính và xuất ra thể tích của hình lập phương.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập cạnh của hình lập phương");
		double canh = scanner.nextDouble();

		if (canh <= 0) {
			return;
		}

		System.out.println("Thể tích của hình lập phương là " + Math.pow(canh, 3));
		scanner.close();
	}
}
