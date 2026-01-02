package exam_java2.question;

import java.time.LocalDate;

import exam_java.enitity.Account;
import exam_java.enitity.department;
import exam_java.enitity.group;
import exam_java.enitity.position;
import exam_java.enitity.position.positionName;

public class question1 {
	public static void main(String[] args) {
		// tạo department
		department Dep1 = new department();
		Dep1.id = 1;
		Dep1.name = "sale";

		department Dep2 = new department();
		Dep2.id = 2;
		Dep2.name = "maketing";

		department Dep3 = new department();
		Dep3.id = 3;
		Dep3.name = "boss";

		// tạo positon
		position pos1 = new position();
		pos1.id = 1;
		pos1.name = positionName.Dev;

		position pos2 = new position();
		pos2.id = 2;
		pos2.name = positionName.PM;

		position pos3 = new position();
		pos3.id = 3;
		pos3.name = positionName.Dev;

		position pos4 = new position();
		pos4.id = 4;
		pos4.name = positionName.Scrum_Master;

		// Tạo group

		group group1 = new group();
		group1.id = 1;
		group1.name = "t1";
		group1.createDate = LocalDate.now();

		group group2 = new group();
		group2.id = 2;
		group2.name = "GenG";
		group2.createDate = LocalDate.now();

		group group3 = new group();
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
		group[] groupAcc1 = { group1, group2 };
		Acc1.groups = groupAcc1;

		Account Acc2 = new Account();
		Acc2.id = 2;
		Acc2.email = "thinh2@gmail.com";
		Acc2.username = "thinh2";
		Acc2.Fullname = "pham van thinh2";
		Acc2.department = Dep2;
		Acc2.position = pos2;
		Acc2.creatDate = LocalDate.now();
		group[] groupAcc2 = { group2 };
		Acc2.groups = groupAcc2;

		// tạo Group Account
		group1.accounts = new Account[] { Acc1 };
		group2.accounts = new Account[] { Acc2 };

		// Question1
		System.out.println("----------------------------");
		if (Acc2.department == null) {
			System.out.println("nhân viên này chưa có phòng ban");
		} else {
			System.out.println("nhân viên này có phòng ban là :" + Acc2.department.name);

		}
// question 2
		System.out.println("----------------------------");
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
		System.out.println("----------------------------");
		System.out.println(Acc2.department == null ? "nhân viên này chưa có phòng ban."
				: "phòng ban của nhân viên này là:" + Acc2.department.name);

		// question 4
		System.out.println("----------------------------");
		System.out.println(
				Acc1.position.name.toString() == "dev" ? "đây là developer" : "người này không phải là developer"

		);

		// question 5
		System.out.println("----------------------------");
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
		System.out.println("----------------------------");
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
		System.out.println("----------------------------");
		String positionName = Acc1.position.toString();
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
		System.out.println("----------------------------");
		Account[] accArray = { Acc1, Acc2 };
		for (Account account : accArray) {
			System.out
					.println("accountID: " + account.id + ", email: " + account.email + ", name: " + account.username);
		}

		// question 9

	}
}
