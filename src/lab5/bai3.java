package lab5;

import java.util.ArrayList;

public class bai3 {
//	Ứng dụng quản lý sinh viên
//	- Tạo class Student với thuộc tính name, id
//	- Tại hàm main, tạo 5 students với tên khác nhau (sử dụng constructor)
//	Yêu cầu: tìm và xuất ra:
//		- các student có tên bắt đầu là "Nguyễn"
	public static void main(String[] args) {
		Student st1 = new Student("id1", "Thái Bảo Duy");
		Student st2 = new Student("id2", "Nguyễn Văn Thịnh");
		Student st3 = new Student("id3", "La Đại Lộc");
		Student st4 = new Student("id4", "Nguyễn Văn A");
		Student st5 = new Student("id5", "Lê Anh Nguyễn Vũ");

		ArrayList<Student> arr = new ArrayList<>();
		arr.add(st1);
		arr.add(st2);
		arr.add(st3);
		arr.add(st4);
		arr.add(st5);

		System.out.println("Danh sách các student: " + arr);

		System.out.println(" Các student có tên bắt đầu là \"Nguyễn\"");
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i).getName().startsWith("Nguyễn")) {
				System.out.println(arr.get(i));
			}
		}
	}
}
