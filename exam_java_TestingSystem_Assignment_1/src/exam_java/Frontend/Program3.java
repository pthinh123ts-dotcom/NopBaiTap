package exam_java.Frontend;

import java.time.LocalDate;

import exam_java.enitity.Account;

public class Program3 {

	public static void main(String[] args) {

		Account acc1 = new Account();
		acc1.id = 1;
		acc1.email = "thinh1@gmail.com";
		acc1.username = "thinh";
		acc1.Fullname = "pham thinh";
		acc1.department = dep1;
		acc1.position = position1;
		acc1.creatDate = LocalDate.now();

		Account account2 = new Account();
		account2.id = 2;
		account2.email = "thinh2@gmail.com";
		account2.username = "thinh2";
		account2.Fullname = " pvt2";
		account2.department = "dep2";
		account2.position = "pos2";
		account2.creatDate = LocalDate.of(2025, 9, 11);

		System.out.println(acc1.toString());
		System.out.println(account2.toString());

	}

}
