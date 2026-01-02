package entity.java;

import java.time.LocalDate;

public class account {
	public int id;
	public String email;
	public String username;
	public String firstName;
	public String lastName;
	public String fullName;
	public postion position;
	public LocalDate createDate;

	// a)
	public account() {
	}

	// b)
	public account(int id, String email, String username, String firstName, String lastName) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
	}

	// c)
	public account(int id, String email, String username, String firstName, String lastName, postion position) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = LocalDate.now();
	}

	// d)
	public account(int id, String email, String username, String firstName, String lastName, postion position,
			LocalDate createDate) {
		this.id = id;
		this.email = email;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fullName = firstName + " " + lastName;
		this.position = position;
		this.createDate = createDate;

	}

	@Override
	public String toString() {
		return "account [id=" + id + ", email=" + email + ", username=" + username + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", fullName=" + fullName + ", position=" + position + ", createDate="
				+ createDate + "]";
	}

	public account(String username) {
		this.username = username;
	}
}