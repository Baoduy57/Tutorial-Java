package lab4;

public class RunTest {
	public static void main(String[] args) {
		Product pr = new Product();

		Product test = pr.nhapThongTin("Computer", 150, 0.3);
		test.xuatThongTin(test);
		System.out.println("Số tiền thuế là: " + pr.getTaxPrice(test.getPrice(), test.getTax()));
	}
}
