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
		this(stdId, name, "����");
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
		// �Է°� ���� ��� �й�="00000000", �̸�="Anonymous",  ����="����"
		Student1 s1 = new Student1();
		s1.getInfo();
		Student1 s2 = new Student1("2014958119");
		s2.getInfo();
		Student1 s3 = new Student1("2014958120", "ȫ�浿");
		s3.getInfo();
		Student1 s4 = new Student1("2014958121", "�̼���", "��ǻ�Ͱ���");
		s4.getInfo();
	}
}
