package edu;

public class MyDate {
	private int year; //���� Ŭ���� �������� ��밡��
	private int month;
	private int day;
	
	public void setDay(int day) {
		if (day > 32) {
			System.out.println("�߸��� �Է°��Դϴ�.");
		} else {
			this.day = day;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void info() {
		System.out.println(year+"/"+month+"/"+day);
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}
}
