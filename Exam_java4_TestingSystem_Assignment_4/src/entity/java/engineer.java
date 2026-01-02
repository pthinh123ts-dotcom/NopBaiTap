package entity.java;

public class engineer extends Staff {
	private String specialized;

	public engineer() {
		super();
	}

	public engineer(String name, int age, gender gender, String address, String specialized) {
		super(name, age, gender, address);
		this.specialized = specialized;
	}

	@Override
	public String toString() {
		return "Engineer:" + super.getName() + " ," + super.getAge() + " ," + specialized;
	}

	public String getSpecialized() {
		return specialized;
	}

	public void setSpecialized(String specialized) {

		this.specialized = specialized;
	}

}