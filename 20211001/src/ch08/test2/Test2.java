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
		System.out.println("A ������");
	}
}

class B extends A{
	int j = 20;
	public B() {
		super(); // �θ� ������ ȣ��
		System.out.println("B ������");
	}
}

class C extends B{
	int k = 30;
	public C() {
		super(); // �θ� ������ ȣ��
		System.out.println("C ������");
	}
}