package exam_java2.vti.program;

import java.time.LocalDate;

import entity.Account;
import entity.Department;
import entity.Group;
import entity.Positon;
import entity.Positon.PositionName;

public class program1 {
	public static void main(String[] args) {

		// tạo department
		Department Dep1 = new Department();
		Dep1.id = 1;
		Dep1.name = "sale";

		Department Dep2 = new Department();
		Dep2.id = 2;
		Dep2.name = "maketing";

		Department Dep3 = new Department();
		Dep3.id = 3;
		Dep3.name = "boss";

		// tạo positon

		Positon pos1 = new Positon();
		pos1.id = 1;
		pos1.name = PositionName.Dev;

		Positon pos2 = new Positon();
		pos2.id = 2;
		pos2.name = PositionName.PM;

		Positon pos3 = new Positon();
		pos3.id = 3;
		pos3.name = PositionName.Dev;

		Positon pos4 = new Positon();
		pos4.id = 4;
		pos4.name = PositionName.Scrum_Master;

		// Tạo group

		Group group1 = new Group();
		group1.id = 1;
		group1.name = "t1";
		group1.createDate = LocalDate.now();

		Group group2 = new Group();
		group2.id = 2;
		group2.name = "GenG";
		group2.createDate = LocalDate.now();

		Group group3 = new Group();
		group3.id = 1;
		group3.name = "KT";
		group3.createDate = LocalDate.of(2024, 7, 14);

		// tạo account

		Account Acc1 = new Account();
		Acc1.id = 1;
		Acc1.email = "thinh1@gmail.com";
		Acc1.username = "thinh";
		Acc1.Fullname = "pham van thinh";
		Acc1.department = Dep1;
		Acc1.position = pos1;
		Acc1.creatDate = LocalDate.now();
		Group[] groupAcc1 = { group1, group2 };
		Acc1.groups = groupAcc1;

		Account Acc2 = new Account();
		Acc2.id = 2;
		Acc2.email = "thinh2@gmail.com";
		Acc2.username = "thinh2";
		Acc2.Fullname = "pham van thinh2";
		Acc2.department = Dep2;
		Acc2.position = pos2;
		Acc2.creatDate = LocalDate.now();
		Group[] groupAcc2 = { group2 };
		Acc2.groups = groupAcc2;

		// tạo Group Account
		group1.accounts = new Account[] { Acc1 };
		group2.accounts = new Account[] { Acc2 };

		// Question1
		System.out.println("---Question1---");
		if (Acc2.department == null) {
			System.out.println("nhân viên này chưa có phòng ban");
		} else {
			System.out.println("nhân viên này có phòng ban là :" + Acc2.department.name);

		}
		// question 2
		System.out.println("---Question2---");
		if (Acc2.groups == null) {
			System.out.println("nhân viên này chưa có group nào cả");

		} else {
			int countGroups = Acc2.groups.length;
			if (countGroups == 1 || countGroups == 2) {
				System.out.println("group của nhân viên này là  java fresher,C#");
			}

			if (countGroups == 3) {
				System.out.println("nhân viên này là người hóng chuyện");
			}

			if (countGroups == 4) {
				System.out.println("nhân viên này là người quan trọng");
			}
		}

		// question 3
		System.out.println("---Question3---");

		System.out.println(Acc2.department == null ? "nhân viên này chưa có phòng ban."
				: "phòng ban của nhân viên này là:" + Acc2.department.name);

		// question 4
		System.out.println("---Question4---");
		System.out.println(
				Acc1.position.name.toString() == "dev" ? "đây là developer" : "người này không phải là developer"

		);

		// question 5
		System.out.println("---Question5---");
		if (group1.accounts == null) {
			System.out.println("group chưa có thành viên tham gia");
		} else {
			int CountAccInGroup = group1.accounts.length;
			switch (CountAccInGroup) {
			case 1:
				System.out.println("nhóm có 1 thành viên");
				break;
			case 2:
				System.out.println("nhóm có 2 thành viên");
				break;
			case 3:
				System.out.println("nhóm có 3 thành viên");
				break;

			default:
				System.out.println("nhóm có nhiều thành viên");
				break;
			}
		}

		// question 6
		System.out.println("---Question6---");
		if (Acc2.groups == null) {
			System.out.println("nhân viên này chưa có group");
		} else {
			switch (Acc2.groups.length) {
			case 1:
				System.out.println("group này chưa có nhân viên nào cả");
				break;
			case 2:
				System.out.println("group của nhân viên này là  java fresher,C#");
				break;
			case 3:
				System.out.println("nhân viên này là người hóng chuyện");
				break;

			default:
				System.out.println("nhân viên này là người quan trọng");
				break;
			}
		}

		// question 7
		System.out.println("---Question7---");
		String positionName = Acc1.position.name.toString();
		switch (positionName) {
		case "dev": {
			System.out.println("đây là developer");
			break;
		}
		default:
			System.out.println("đây không phải dev");
			break;
		}

		// FOREACH
		// question 8
		System.out.println("---Question8---");
		Account[] accArray = { Acc1, Acc2 };
		for (Account account : accArray) {
			System.out
					.println("accountID: " + account.id + ", email: " + account.email + ", name: " + account.username);
		}

		// question 9
		System.out.println("---Question9---");
		Department[] depArray = { Dep1, Dep2, Dep3 };
		for (Department department : depArray) {
			System.out.println("DepID :" + department.id + ", Name : " + department.name);
		}

		// Question 10
		System.out.println("---Question10---");
		Account[] accArray1 = { Acc1, Acc2 };
		for (int i = 0; i < accArray1.length; i++) {
			System.out.println("Thông tin phòng ban thứ " + (i + 1) + "Là : ");
			System.out.println("Email : " + accArray1[i].email);
			System.out.println(" FullName : " + accArray1[i].Fullname);
			System.out.println("Phòng ban : " + accArray1[i].department.name);
		}

		// Question 11
		System.out.println("---Question11---");
		Department[] depArray1 = { Dep1, Dep2, Dep3 };
		for (int i = 0; i < depArray1.length; i++) {
			System.out.println("Thông tin Department thứ " + (i + 1) + "Là : ");
			System.out.println("Id: " + depArray1[i].id);
			System.out.println("Name: " + depArray1[i].name);

		}
		// Question 12
		System.out.println("---Question12---");
		Department[] depArray2 = { Dep1, Dep2, Dep3 };
		for (int i = 0; i < depArray2.length; i++) {
			System.out.println("Thông tin Department thứ " + (i + 1) + "Là : ");
			System.out.println("Id: " + depArray2[i].id);
			System.out.println("Name: " + depArray2[i].name);

		}
		// Question 13
		System.out.println("---Question13---");
		Account[] accArray2 = { Acc1, Acc2 };
		for (int i = 0; i < accArray2.length; i++) {
			if (i != 1) {

				System.out.println("Thông tin phòng ban thứ " + (i + 1) + "Là : ");
				System.out.println("Email : " + accArray2[i].email);
				System.out.println(" FullName : " + accArray2[i].Fullname);
				System.out.println("Phòng ban : " + accArray2[i].department.name);
			}
		}
		// Question 14
		System.out.println("---Question14---");
		Account[] accArray3 = { Acc1, Acc2 };
		for (int i = 0; i < accArray3.length; i++) {
			if (accArray3[i].id < 4) {

				System.out.println("Thông tin phòng ban thứ " + (i + 1) + "Là : ");
				System.out.println("Email : " + accArray3[i].email);
				System.out.println(" FullName : " + accArray3[i].Fullname);
				System.out.println("Phòng ban : " + accArray3[i].department.name);
			}
		}

	}
}