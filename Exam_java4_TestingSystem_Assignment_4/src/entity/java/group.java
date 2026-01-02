package entity.java;

import java.time.LocalDate;
import java.util.Arrays;

public class group {

	public int id;
	public String name;
	public LocalDate createDate;
	public account creator;
	public account[] accounts;
	public String groupName;

	// không có parameter
	public group() {

	}

	// b) Có các parameter là GroupName, Creator, array Account[], accounts,
	// CreateDate

	public group(String groupName, account creator, LocalDate createDate, account[] accounts) {
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}

	// c) Có các parameter là GroupName, Creator, array String[]usernames ,
	// CreateDate
	// Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tinusername, các
	// thông tin còn lại = null).

	public group(String groupName, account creator, String[] usernames, LocalDate createDate) {
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;

		this.accounts = new account[usernames.length];
		for (int i = 0; i < accounts.length; i++) {
			this.accounts[i] = new account(usernames[i]);
		}

	}

	@Override
	public String toString() {
		return "group [name=" + name + ", createDate=" + createDate + ", creator=" + creator + ", accounts="
				+ Arrays.toString(accounts) + ", groupName=" + groupName + "]";
	}

}