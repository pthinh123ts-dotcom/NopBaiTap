package exam_java.Frontend;

import exam_java.enitity.position;

public class program2 {

	public static void main(String[] args) {

		position position1 = new position();
		position1.id = 1;
		position1.name = position.positionName.Dev;

		position position2 = new position();
		position2.id = 2;
		position2.name = position.positionName.Test;

		position position3 = new position();
		position3.id = 3;
		position3.name = position.positionName.Scrum_Master;

		position position4 = new position();
		position4.id = 4;
		position4.name = position.positionName.PM;

		System.out.println("thông tin phòng ban , id:" + position1.id + " , phòng ban:" + position1.name);

	}

}
