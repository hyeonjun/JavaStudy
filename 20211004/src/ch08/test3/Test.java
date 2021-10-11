package ch08.test3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
		c.info();
	}

}

class A extends Object {
	final int MAXVALUE = 100;
	final int i = 10;
//	public final void info() { // final 클래스, 메소드는 상속 불가능
//		System.out.println("A");
//	}
	public void info() {
		System.out.println("A");
		
	}
	protected void test() {
		// TODO Auto-generated method stub
		
	}
}

class B extends A{
	int j;
	@Override
	public void info() {
		super.info();
		System.out.println("B");
	}
	@Override
	protected void test() {
		
	}
}

class C extends B{
	int k;
	@Override
	public void info() {
		super.info();
		System.out.println("C"); 
	}
	
	@Override
	public void test() {
		
	}
	 
}
