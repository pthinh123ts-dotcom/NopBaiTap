package entity;

import java.time.LocalDate;

public class Group {
	public static void main(String[] args) {

	}

	public int id;
	public String name;
	public Account creator;
	public LocalDate createDate;
	public Account[] accounts;
}
