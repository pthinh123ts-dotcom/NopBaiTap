package exam_java.enitity;

import java.time.LocalDate;
import java.util.Arrays;

public class account {
	public int id;
	public String email;
	public String username;
	public String Fullname;
	public String department;
	public String position;
	public LocalDate creatDate;
	public group[] groups;

	@Override
	public String toString() {
		return "account [id=" + id + ", email=" + email + ", username=" + username + ", Fullname=" + Fullname
				+ ", department=" + department + ", position=" + position + ", creatDate=" + creatDate + ", groups="
				+ Arrays.toString(groups) + "]";
	}

}
