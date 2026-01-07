package com.vti.utils;

import java.util.Scanner;

public class scannerUltils {
	private static Scanner scanner = new Scanner(System.in);

	public static int inputInt() {
		while (true) {
			try {
				String input = scanner.next();
				return Integer.parseInt(input);
			} catch (Exception e) {
				System.out.println("Dữ liệu nhập không đúng");
			}
		}
	}

}
