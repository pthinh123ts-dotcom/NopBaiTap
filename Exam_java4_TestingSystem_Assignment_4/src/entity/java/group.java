package entity.java;

import java.time.LocalDate;

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

	// b) Có các parameter là GroupName, Creator, array Account[]
	// accounts, CreateDate

	public group(int id, String name, account creator, LocalDate createDate, account[] accounts) {
		this.id = id;
		this.name = name;
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
}