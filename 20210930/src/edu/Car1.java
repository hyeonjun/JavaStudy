package edu;

public class Car1 {
	static int count; // static ������ �ڵ� �⺻��
	String model;
	String color;
	int maxSpeed;
	
	public Car1() { // �⺻ ������. 
		this("����", "white", 250);
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
