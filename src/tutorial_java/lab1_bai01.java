package tutorial_java;

import java.util.Scanner;

public class lab1_bai01 {
	// Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.
	// In ra màn hình với định dạng:
	// <tên_sinh_viên> có điểm = <điểm>
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập tên sinh viên: ");
		String tenSV = scanner.nextLine();

		System.out.println("Nhập điểm trung bình: ");
		double diemTB = scanner.nextDouble();

		System.out.println("Tên sinh viên là " + tenSV + " có điểm trung bình là " + diemTB);
		scanner.close();
	}
}
