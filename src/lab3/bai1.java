package lab3;

import java.util.Scanner;

public class bai1 {
//	Viết chương trình nhập vào 1 số nguyên từ bàn phím. Hiển thị kết quả số đấy là số
//	nguyên tố hay không ?
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập số nguyên bất kì ");
		int value = sc.nextInt();
		boolean isPrime = true;

		if (value < 2) {
			isPrime = false;
		} else {
			for (int i = 2; i < value; i++) {
				if (value % i == 0) {
					System.out.println("Ước khác là " + i);
					isPrime = false;
					break;
				}
			}
		}

		if (isPrime) {
			System.out.printf("%d là số nguyên tố ", value);
		} else {
			System.out.printf("%d không là số nguyên tố ", value);
		}
		sc.close();
	}
}
