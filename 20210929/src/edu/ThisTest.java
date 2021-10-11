package edu;

public class ThisTest {
	int i = 1;
	public void first() {
		int i = 2;
		int j = 3;
		
		this.i = i + j;
		
		second(4); // 같은 인스턴스에 있는 메소드를 부를 때는, this.second(4); 에서 this 생략 가능
	}
	
	public void second(int i) {
		int j = 5;
		this.i = i + j;
	}
	
	public static void main(String[] args) {
		ThisTest exam = new ThisTest();
		exam.first();
		
	}
	
}
