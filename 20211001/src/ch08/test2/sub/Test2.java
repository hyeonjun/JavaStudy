package ch08.test2.sub;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C a = new C(77, 88, 99);
		System.out.println(a.i+", "+a.j+", "+a.k);
		
		B b = new B(80, 90);
		System.out.println(b.i+" "+b.j);
		
	}

}

class A{
	int i = 10;
	public A(int i) {
		this.i = i;
		System.out.println("A 持失切");
	}
}

class B extends A{
	int j = 20;
	public B(int i, int j) {
		super(i);
		this.j = j;
		System.out.println("B 持失切");
	}
}

class C extends B{
	int k = 30;
	public C(int i, int j, int k) {
		super(i, j);
		this.k = k;
		System.out.println("C 持失切");
		
	}
}