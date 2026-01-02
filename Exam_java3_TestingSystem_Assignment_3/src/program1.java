import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {

		// question1
		System.out.println("-----QUESTION1-----");
		float luong1;
		float luong2;

		luong1 = (float) 5240.5;
		luong2 = (float) 10970.055;
		System.out.println("luong cua account 1 : " + luong1 + ",lương của account 2 : " + luong2);
		int roundluong1 = (int) luong1;
		int roundluong2 = (int) luong2;
		System.out.println("luong cua account 1 : " + roundluong1 + ",lương của account 2 : " + roundluong2);

		// question 2
		System.out.println("-----QUESTION2-----");
		int Min = 0;
		int Max = 99999;
		int a = (int) (Math.random() * Max) + Min;
		while (a < 10000) {
			a = a * 10;
		}
		System.out.println(" số ngẫu nhiên là : " + a);

		// question3
		System.out.println("-----QUESTION3-----");

		String b = String.valueOf(a);
		System.out.println("Hai số cuối là : " + b.substring(3));

		// question4
		System.out.println("-----QUESTION4-----");
		int c, d;
		Scanner scanner = new Scanner(System.in);
		System.out.println(" nhập số đầu tiên =");
		c = scanner.nextInt();
		System.out.println(" nhập số thứ hai = ");
		d = scanner.nextInt();
		if (d == 0) {
			System.out.println("vui lòng nhập số khác 0!!");
		}
		while (d == 0) {
			scanner.close();
		}
		System.out.println("thương : " + (float) c / (float) d);

	}
}