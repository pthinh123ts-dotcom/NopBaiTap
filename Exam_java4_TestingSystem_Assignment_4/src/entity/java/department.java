package entity.java;

public class department {

	private int id;
	private String name;

	public department(String name) {
		this.id = 0;
		this.name = name;
	}

	private static void question1() {
		department dep = new department(null);
		department dep1 = new department("dep1");
	}
}