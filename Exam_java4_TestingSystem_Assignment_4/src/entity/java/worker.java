package entity.java;

public class worker extends Staff {
	private int rank;

	public worker() {
		super();
	}

	public worker(String name, int age, gender gender, String address) {
		super(name, age, gender, address);
	}

	@Override
	public String toString() {
		return "Worker [rank=" + rank + "]";
	}

}
