package edu;

public class Car {
	static int count; // static ������ �ڵ� �⺻��
	String model;
	String color;
	int maxSpeed;
	
	public Car() { // �⺻ ������. 
		this("����", "white", 250);
	}
	
	public Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void test() {
		int speed = 10;
		System.out.println(speed);
	}
}
