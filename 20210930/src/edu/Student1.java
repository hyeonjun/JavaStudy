package edu;

public class Student1 {
	String stdId;
	String name;
	String major;
	
	public Student1() {
		this("00000000");
	}
	
	public Student1(String stdId) {
		this(stdId, "Anonymous");
	}
	
	public Student1(String stdId, String name) {
		this(stdId, name, "미정");
	}
	
	public Student1(String stdId, String name, String major) {
		this.stdId = stdId;
		this.name = name;
		this.major = major;
	}
	
	public void getInfo() {
		System.out.println(stdId+" / "+name+" / "+major);
	}
	
	public static void main(String[] args) {
		// 입력값 없는 경우 학번="00000000", 이름="Anonymous",  전공="미정"
		Student1 s1 = new Student1();
		s1.getInfo();
		Student1 s2 = new Student1("2014958119");
		s2.getInfo();
		Student1 s3 = new Student1("2014958120", "홍길동");
		s3.getInfo();
		Student1 s4 = new Student1("2014958121", "이순신", "컴퓨터공학");
		s4.getInfo();
	}
}
