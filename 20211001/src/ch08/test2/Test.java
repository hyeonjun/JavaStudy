package ch08.test2;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("ȫ�浿", 20, "��ǻ�Ͱ��а�");
		s.getInfo();
		
		Employee e = new Employee("�̼���", 53, "�л�ó");
		e.getInfo();
		
		Professor p = new Professor("������", 35, "�ΰ�����");
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
	
	public void getInfo() { // �޼ҵ� �������̵� = ��ӹ޴� �޼ҵ��� �ٵ� �������ϴ� ��
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
