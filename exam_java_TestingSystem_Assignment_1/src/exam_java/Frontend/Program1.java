package exam_java.Frontend;

import exam_java.enitity.department;

public class Program1 {

	public static void main(String[] args) {

		// Bài tập 1 : Department
		department department1 = new department();
		department1.id = 1;
		department1.name = "sale";

		System.out.println("thông tin phòng ban 1 , id:" + department1.id + " , name:" + department1.name);

		department department2 = new department();
		department2.id = 2;
		department2.name = "maketing";

		System.out.println("thông tin phòng ban 2 , id:" + department2.id + " , name:" + department2.name);

		department department3 = new department();
		department3.id = 3;
		department3.name = "bảo vệ";

		department department4 = new department();
		department4.id = 4;
		department4.name = "giám đóc";

		// Bài tập 2 : Posistion

	}

}
