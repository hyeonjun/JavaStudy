package ch09.test3;

public class Test2 {
	public static void main(String[] args) {
		A v = new B();
		v.i = 0;
//		v.j = 0;
		v.info();
	}
}

class A{
	int i = 10;
	public void info() {
		System.out.println("A");
	}
}

class B extends A{
	int j = 20;
	public void info() {
		System.out.println("B");
	}
}