package com.vti.entity;

public class News implements INews {
	private int id;
	private String title;
	private String publishDate;
	private String author;
	private String content;
	private Float averageRate;
	private int[] rate;
	public static int COUNT = 0;

	public News(int id, String title, String publishDate, String author, String content, Float averageRate,
			int[] rate) {
		super();
		this.id = id;
		this.title = title;
		this.publishDate = publishDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
		this.rate = rate;
	}

	public News(String title2, String publishDate2, String author2, String content2, int[] rates) {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Float getAverageRate() {
		return averageRate;
	}

	public void setAverageRate(Float averageRate) {
		this.averageRate = averageRate;
	}

	public int[] getRate() {
		return rate;
	}

	public void setRate(int[] rate) {
		this.rate = rate;
	}

	public static int getCOUNT() {
		return COUNT;
	}

	public static void setCOUNT(int cOUNT) {
		COUNT = cOUNT;
	}

	@Override
	public void display() {
		System.out.println("News [title=" + title + ", publishDate=" + publishDate + ", author=" + author + "]");

	}

	@Override
	public float calculate() {
		averageRate = (float) ((rate[0] + rate[1] + rate[2]) / 3);
		return averageRate;
	}

}
