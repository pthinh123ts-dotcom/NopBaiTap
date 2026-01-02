package entity;

import java.util.Arrays;

public class Department {
	public static void main(String[] args) {

	}

	public int id;
	public String name;
	public Account[] accounts;

	@Override
	public String toString() {
		return "department [id=" + id + ", name=" + name + ", accounts=" + Arrays.toString(accounts) + "]";
	}
}
