package edu;

public class Car1 {
	static int count; // static 변수는 자동 기본값
	String model;
	String color;
	int maxSpeed;
	
	public Car1() { // 기본 생성자. 
		this("현대", "white", 250);
	}
	
	public Car1(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void test() {
		int speed = 10;
		System.out.println(speed);
	}
}
