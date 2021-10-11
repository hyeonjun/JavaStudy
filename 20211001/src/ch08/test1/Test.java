package ch08.test1;

public class Test {
	public static void main(String[] args) {
		//Student s = new Student(); // 기본 생성자 존재 x, 사용 불가능
		Student s = new Student("홍길동", 20, "컴퓨터공학과");
		s.getInfo();
		
		Employee e = new Employee("이순신", 53, "학생처");
		e.getInfo();
		
		Professor p = new Professor("유관순", 35, "인공지능");
		p.getInfo();
		
		
	}
}

class Student {
	private String name;
	private int age;
	private String major;
	
	public Student(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
	public void getInfo() {
		System.out.println(name+": "+age+": "+major);
	}
}

class Employee {
	private String name;
	private int age;
	private String dept;
	
	public Employee(String name, int age, String dept) {
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void getInfo() {
		System.out.println(name+": "+age+": "+dept);
	}
}

class Professor {
	private String name;
	private int age;
	private String subject;
	
	public Professor(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void getInfo() {
		System.out.println(name+": "+age+": "+subject);
	}
}