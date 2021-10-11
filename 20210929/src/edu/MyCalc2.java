package edu;

public class MyCalc2 {
	public void add(int... v) { // 배열 객체, 매개변수 가변길이 메서드
		System.out.println(v.length);
		int sum = 0;
		for (int i:v)
			sum += i;
		System.out.println(sum);
		
	}
	
	public void info(String name, int... score) {
		System.out.print(name+":");
		for (int s:score)
			System.out.print(s+" ");
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		MyCalc2 c = new MyCalc2();
		c.add(10, 20);
		c.add(10, 20, 30);
		c.add(10, 20, 30, 40);
		c.add(10, 20, 30, 40, 50);
		
		
		c.info("홍길동", 90,85,80);
		
	}


}
