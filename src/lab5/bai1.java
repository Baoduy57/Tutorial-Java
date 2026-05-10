package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class bai1 {
//	Nhập danh sách số thực với số lượng tùy ý từ bàn phím. Xuất ra danh sách vừa
//	nhập và tính tổng của nó
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Double> a = new ArrayList<Double>();
		while (true) {
			System.out.print("Nhập số thực bất kỳ: ");
			double x = sc.nextDouble();
			sc.nextLine();
			a.add(x);

			System.out.print("Bạn có muốn tiếp tục nhập mảng không Y or N: ");
			String option = sc.nextLine();
			if (option.equals("N") || option.equals("n")) {
				break;
			}
		}
		System.out.println("Danh sách của mảng vừa nhập: " + a);

		double sum = 0;
		for (int i = 0; i < a.size(); i++) {
			sum += a.get(i);
		}
		System.out.println("Tổng của mảng là: " + sum);

		sc.close();
	}
}
