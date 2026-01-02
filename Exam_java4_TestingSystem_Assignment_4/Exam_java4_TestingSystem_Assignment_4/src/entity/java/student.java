package entity.java;

public class student {

	private int id;
	private String name;
	private String hometown;
	private Float score;

// b
	public student(String name, String hometown) {
		this.name = name;
		this.hometown = hometown;
		this.score = (float) 0;
	}

//c
	public void setScore(Float score) {
		this.score = score;
	}

//d
	public void plusScore(Float score) {
		this.score = this.score + score;
	}

	@Override
	public String toString() {
		String rank = null;
		if (this.score < 4.0) {
			rank = "yếu";
		} else if (this.score < 6.0) {
			rank = "trung bình";
		} else if (this.score < 8.0) {
			rank = "khá";
		} else {
			rank = "giỏi";
		}

		return "student [id=" + id + ", name=" + name + ", hometown=" + hometown + ", score=" + score + "rank" + rank
				+ "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHometown() {
		return hometown;
	}

	public void setHometown(String hometown) {
		this.hometown = hometown;
	}

	public Float getScore() {
		return score;
	}

}