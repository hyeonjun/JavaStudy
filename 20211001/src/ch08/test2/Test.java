package ch08.test2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("홍길동", 20, "컴퓨터공학과");
		s.getInfo();
		
		Employee e = new Employee("이순신", 53, "학생처");
		e.getInfo();
		
		Professor p = new Professor("유관순", 35, "인공지능");
		p.getInfo();
	}

}

class Person{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void getInfo() {
		System.out.print(name+": "+age+": ");
	}
}

class Student extends Person {
	String major;
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	public void getInfo() { // 메소드 오버라이딩 = 상속받는 메소드의 바디를 재정의하는 것
		super.getInfo();
		System.out.println(major);
//		System.out.println(name+": "+age+": "+major);
	}
}

class Employee extends Person {
	String dept;
	
	public Employee(String name, int age, String dept) {
		super(name, age);
		this.dept = dept;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println(dept);
//		System.out.println(name+": "+age+": "+dept);
	}
}

class Professor extends Person {
	String subject;
	
	public Professor(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println(subject);
//		System.out.println(name+": "+age+": "+subject);
	}
}
