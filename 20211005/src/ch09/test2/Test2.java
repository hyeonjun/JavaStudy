package ch09.test2;

public class Test2 {

}

interface Flyer{ // ������� - public static final, �޼ҵ� - abstract
	public void takeOff();
	public void land();
	public void fly();
}

interface Vehicle2{
	
}

class Airplane implements Flyer, Vehicle2{ // �������̽��� ������ ��ӹ��� �� ������, �������̽��� ��� �޼ҵ带 ����ؾ��Ѵ�
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