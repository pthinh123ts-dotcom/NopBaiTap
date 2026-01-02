package entity;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {
	public static void main(String[] args) {

	}

	public int id;
	public String email;
	public String username;
	public String Fullname;
	public Department department;
	public Positon position;
	public LocalDate creatDate;
	public Group[] groups;

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", Fullname=" + Fullname
				+ ", department=" + department + ", position=" + position + ", creatDate=" + creatDate + ", groups="
				+ Arrays.toString(groups) + "]";

	}
}
