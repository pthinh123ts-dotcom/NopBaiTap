package Frontend;

import java.time.LocalDate;

import entity.java.account;
import entity.java.postion;

public class program {

	public static void main(String[] args) {

		// question2

		// a)
		account acc1 = new account();

		// b)

		account acc2 = new account(1, "thinh@gmail.com", "thinh", "pham", "pham thinh");

		// c)
		postion Pos3 = new postion();
		account acc3 = new account(2, "thinh1@gmail.com", "thinh", "pham", "pham thinh", Pos3, LocalDate.now());

		// d)
		postion pos4 = new postion();
		account acc4 = new account(3, "tranvanc@gmail.com", "vanc", "Tran", "Van C", pos4, LocalDate.of(2023, 11, 20));
		System.out.println("--- Java question2---");
		System.out.println(acc1);
		System.out.println(acc2);
		System.out.println(acc3);
		System.out.println(acc4);

		// question 3

	}

}
