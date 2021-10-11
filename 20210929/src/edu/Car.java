package edu;

public class Car {
	String model;
	int speed;
	
	public void speedUp(int speed) {
		this.speed += speed;
	}
	public void speedDown(int speed) {
		this.speed -= speed;
		
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.model = "BMW320";
		c.speed = 90;
		c.speedUp(10);
		System.out.println(c.speed); // 100
		c.speedDown(5);
		System.out.println(c.speed); // 95
	}
}
