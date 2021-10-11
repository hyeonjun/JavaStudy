package edu;
public class Exam {

	public static void main(String[] args) {
		Person p = new Person();
		p.getInfo();
//		Person p2 = new Person(29,"이정혁",'M');
//		p2.getInfo();
//		
//		System.out.println(p2.is_married);
		
		
//		int v1 = 10;
//
//		A a = new A();
//		a.m1(v1);
//		System.out.println(v1);
//
//		int[] arr = a.m4();
//		for (int n : arr)
//			System.out.println(n + " ");
//
//		Person q = new Person(21,"이정우",'F');
//		a.m5(q);
//		System.out.println(q.name + "/" + q.age);

//		Person p2 = a.m6();
//		System.out.println(p2.name + "/" + p2.age);

	}

}

class A {

	public void m1(int v1) {
		v1++;
	}

	public int[] m4() {
		int[] arr = { 10, 20, 30 };
		return arr;
	}

	public void m5(Person p) {
		p.name = "이정현";
		p.age = 25;
	}

//	public Person m6() {
//		Person p = new Person();
//		p.name = "이순신";
//		p.age = 58;
//		return p;
//	}	
}

class Person {
	String name;
	int age;
	char gender;
	boolean is_married;
	int num_child;
	
	public Person() {
		this(0);//생성자 호출
	}

	public Person(int age) {
		this(age,"무명");
	}

	public Person(int age, String name) {
		this(age,name,'F');
	}
	
	public Person(int age, String name, char gender) {
		this(age, name, gender, false);
	}

	public Person(int age, String name, char gender, boolean is_married) {
		this(age, name, gender, is_married, 0);
	}

	public Person(int age, String name, char gender, boolean is_married,int num_child) {
		this.age =age;
		this.name =name;
		this.gender =gender;
		this.is_married =is_married;
		this.num_child =num_child;
	}
	
	public void getInfo() {
		System.out.println(name+'/'+age+'/'+gender+'/'+is_married+'/'+num_child);
	}
}
