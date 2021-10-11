package ch09.test2;

public class Test2 {

}

interface Flyer{ // 멤버변수 - public static final, 메소드 - abstract
	public void takeOff();
	public void land();
	public void fly();
}

interface Vehicle2{
	
}

class Airplane implements Flyer, Vehicle2{ // 인터페이스는 여러개 상속받을 수 있으며, 인터페이스의 모든 메소드를 상속해야한다
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}

class Bird extends Animal implements Flyer{
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
	public void buildNest() {
		
	}
	
	public void layEggs() {
		
	}
}

class Superman extends Animal implements Flyer{
	@Override
	public void takeOff() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void land() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
	public void leapBuilding() {
		
	}
	
	public void stopBullet() {
		
	}
}


class Animal{
	public void eat() {
		
	}
}