package exam_java.enitity;

import java.util.Arrays;

public class department {

	public int id;
	public String name;
	public Account[] accounts;

	@Override
	public String toString() {
		return "department [id=" + id + ", name=" + name + ", accounts=" + Arrays.toString(accounts) + "]";
	}

}
