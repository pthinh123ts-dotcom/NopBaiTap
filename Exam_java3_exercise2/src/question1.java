import java.time.LocalDate;

import exam_java.enitity.account;

public class question1 {
	public static void main(String[] args) {

		account acc1 = new account();
		acc1.id = 1;
		acc1.email = "thinh1@gmail.com";
		acc1.username = "thinh";
		acc1.Fullname = "pham thinh";
		acc1.department = "dep1";
		acc1.position = "pos1";
		acc1.creatDate = LocalDate.now();

		account account2 = new account();
		account2.id = 2;
		account2.email = "thinh2@gmail.com";
		account2.username = "thinh2";
		account2.Fullname = " pvt2";
		account2.department = "dep2";
		account2.position = "pos2";
		account2.creatDate = LocalDate.of(2025, 9, 11);

		System.out.println(" khởi tạo mảng gồm 5 phần tử sử dụng for");

		account[] accArray = new account[5];
		for (int i = 0; i < accArray.length; i++) {
			account account = new account();

			account.email = "email" + i;
			account.username = "username" + i;
			account.Fullname = "fullname" + i;
			account.creatDate = LocalDate.now();
			accArray[i] = account;
			System.out.println(account.toString());

		}

	}
}
