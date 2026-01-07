package com.vti.backend;
import java.util.InputMismatchException;
import java.util.Scanner;

public class program {
	public static void main(String[] args) {
		// viết phương thức người dùng nhập vào số nguyên
		System.out.println("mời bạn nhập tuổi của bạn");
		int Age = inputAge();

		System.out.println("Tuổi của bạn là: " + Age);
	}

// viết hàm inputAge
	public static int inputAge() {
		Scanner scanner = new Scanner(System.in);
		while (true) {

			try {
				int Age = scanner.nextInt();

				if (Age >= 0) {
					return Age;
				} else {

					System.out.println("Bạn phải nhập vào một số nguyên dương");
					System.out.println("Mời bạn nhập lại:");
				}

			} catch (InputMismatchException e) {
				System.out.println("không đúng định dạng số");
				e.printStackTrace();
				scanner.nextLine();
				System.out.println("Nhập lại");
			}

		}

	}

}
