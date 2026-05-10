package lab7;

public class RunTest {
	// Thực hành về tính đa hình và kế thừa(ghi đè)
	public static void main(String[] args) {
		SinhVien svit1 = new SinhVienIT(9.5, 8.8);
		System.out.printf("Sinh viên IT score = %.3f \n", svit1.getDiem());

		SinhVien svck1 = new SinhVienCoKhi(9, 6);
		System.out.printf("Sinh viên Cơ Khí score = %.3f", svck1.getDiem());
	}
}
