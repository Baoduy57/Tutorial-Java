package lab5;

import java.util.Scanner;

public class bai2 {
//	Nhập username và password từ bàn phím. Nếu username = "duydeptrai" và password > 6 ký tự thì hợp lệ
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập username: ");
		String username = sc.nextLine();
		System.out.print("Nhập password: ");
		String password = sc.nextLine();

		if (username.equals("duydeptrai") && password.length() > 6) {
			System.out.println("Input valid");
		} else {
			System.out.println("username hoặc password không đúng");
		}

		sc.close();
	}
}
