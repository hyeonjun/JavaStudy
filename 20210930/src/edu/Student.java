package edu;

public class Student {
	String stdId;
	String name;
	String major;
	
	public Student() {
		this("00000000");
	}
	
	public Student(String stdId) {
		this(stdId, "Anonymous");
	}
	
	public Student(String stdId, String name) {
		this(stdId, name, "����");
	}
	
	public Student(String stdId, String name, String major) {
		this.stdId = stdId;
		this.name = name;
		this.major = major;
	}
	
	public void getInfo() {
		System.out.println(stdId+" / "+name+" / "+major);
	}
	
	public static void main(String[] args) {
		// �Է°� ���� ��� �й�="00000000", �̸�="Anonymous",  ����="����"
		Student s1 = new Student();
		s1.getInfo();
		Student s2 = new Student("2014958119");
		s2.getInfo();
		Student s3 = new Student("2014958120", "ȫ�浿");
		s3.getInfo();
		Student s4 = new Student("2014958121", "�̼���", "��ǻ�Ͱ���");
		s4.getInfo();
	}
}
