package lab2;

import java.util.Scanner;

public class lab2_bai03 {
//	Viết chương trình tính số tiền điện (in kết quả ra console)
//	Yêu cầu: nhập vào số điện, sau đấy tính số tiền dựa vào quy luật sau:
//	- Nếu số điện sử dụng từ 0 tới 100, giá mỗi số điện là 1000
//	- Từ số điện 101 (tức là > 100), giá mỗi số điện là 1500

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Nhập số điện ");
		int x = scanner.nextInt();

		if (x < 0) {
			System.out.println("Số điện không hợp lệ");
		} else if (x <= 100) {
			int result = x * 1000;
			System.out.println("Số tiền phải trả là " + result);
		} else {
			int result = (100 * 1000) + ((x - 100) * 1500);
			System.out.println("Số tiền phải trả là " + result);
		}
		scanner.close();
	}
}
