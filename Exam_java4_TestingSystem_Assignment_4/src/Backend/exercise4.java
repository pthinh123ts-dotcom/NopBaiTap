package Backend;

import entity.java.student;

public class exercise4 {

	public void printStudent() {
		student st1 = new student("thinh1", "H1");
		st1.plusScore(1f);
		student st2 = new student("thinh2", "H2");
		st2.plusScore(5f);
		student st3 = new student("thinh3", "H3");
		st3.plusScore(9f);
		student st4 = new student("thinh4", "H4");
		st4.plusScore(8f);

		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
		System.out.println(st4);
	}

}
