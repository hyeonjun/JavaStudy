package Test;

public class SchoolTest {
	public static void main(String[] args) {
		Student s =new Student("ȫ�浿",20,2008123);
		Teacher t =new Teacher("�̼���",50,"Java");
		Employee e=new Employee("������",40,"������");
		
		s.print();
		t.print();
		e.print();
	}
}

class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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
	
	public void print() {
		System.out.print("�̸�: "+name+"\t����: "+age+" ");
	}
	
}

class Student extends Person{
	private int id;
	
	public Student(String name, int age, int id) {
		super(name, age);
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public void print() {
		super.print();
		System.out.println("ID: "+id);
	}
}

class Teacher extends Person{
	private String subject;
	
	public Teacher(String name, int age, String subject) {
		super(name, age);
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void print() {
		super.print();
		System.out.println("����: "+subject);
	}
}

class Employee extends Person{
	private String dept;
	
	public Employee(String name, int age, String dept){
		super(name, age);
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void print() {
		super.print();
		System.out.println("�μ�: "+dept);
	}
	
}

	
