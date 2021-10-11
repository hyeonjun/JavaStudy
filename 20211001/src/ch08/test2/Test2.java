package ch08.test2;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new C();
	}

}

class A{
	int i = 10;
	public A() {
		System.out.println("A 积己磊");
	}
}

class B extends A{
	int j = 20;
	public B() {
		super(); // 何葛 积己磊 龋免
		System.out.println("B 积己磊");
	}
}

class C extends B{
	int k = 30;
	public C() {
		super(); // 何葛 积己磊 龋免
		System.out.println("C 积己磊");
	}
}