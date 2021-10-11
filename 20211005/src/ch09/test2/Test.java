package ch09.test2;


public class Test {
	public static void main(String[] args) {
		
	}
}

interface Vehicle{ // 이 클래스에서 가지고 있는 멤버 변수와 메소드는 모두 abstract로 선언한 것으로 간주.
	double load = 1000.0;
	double maxLoad = 5000.0;
	
	public double calcFuelEfficiency();
	
	public double calcTripDistance();
}

class Truck implements Vehicle{ // interface로 선언된 것은 extends가 아닌 implements로 상속받는다
	@Override
	public double calcFuelEfficiency() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double calcTripDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
}
