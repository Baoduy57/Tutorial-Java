package lab3;

import java.util.Arrays;
import java.util.Scanner;

public class bai3 {
//	Viết chương trình nhập vào 1 mảng số nguyên bất kỳ:
//		- Sắp xếp và xuất mảng vừa nhập ra màn hình
//		- Xuất phần tử có giá trị nhỏ nhất
//		- Xuất phần tử có giá trị lớn nhất
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of size of array");
		int size = sc.nextInt();
		int[] a = new int[size];
		System.out.println("Enter the array element");
		for (int i = 0; i < size; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Các phần tử ban đầu a = " + Arrays.toString(a));
//		for (int i = 0; i < a.length - 1; i++) {
//			for (int j = i + 1; j < a.length; j++) {
//				if (a[i] > a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		Arrays.sort(a);
//		System.out.println("Các phần tử được sắp xếp theo thứ tự tăng dần a = " + Arrays.toString(a));
//		System.out.println("max = " + a[a.length - 1]);
//		System.out.println("min = " + a[0]);

		int max = a[0];
		for (int i = 0; i < a.length; i++) {
//			if (max < a[i])
//				max = a[i];
			max = Math.max(max, a[i]);
		}
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println("max = " + max);
		System.out.println("min = " + min);

		sc.close();
	}
}
