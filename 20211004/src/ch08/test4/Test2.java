package ch08.test4;

public class Test2 {
	public static void test(Object obj) { // �ֻ��� ��ü�� Object�� ��� �ּҰ����� ���� �� ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new C();
		A a = new C();
		Object c = new C();
		
//		C c = new A(); //�Ұ���
		
		test(b);
		
		Saleman s = new Saleman();
		test(s);
		a.i = 11;
		b.j = 22;
		((C)b).k = 33;
		
	}

}

class A {
	int i = 10;
}
class B extends A{
	int j = 20;
}
class C extends B {
	int k = 30;
}
