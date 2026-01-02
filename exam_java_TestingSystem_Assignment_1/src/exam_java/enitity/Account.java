package exam_java.enitity;

import java.time.LocalDate;
import java.util.Arrays;

public class Account {

	public int id;
	public String email;
	public String username;
	public String Fullname;
	public department department;
	public position position;
	public LocalDate creatDate;
	public group[] groups;

	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", username=" + username + ", Fullname=" + Fullname
				+ ", department=" + department + ", position=" + position + ", creatDate=" + creatDate + ", groups="
				+ Arrays.toString(groups) + "]";
	}

}
