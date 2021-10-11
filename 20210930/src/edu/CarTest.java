package edu;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(); // 기본 생성자인 Car가 private로 접근 제한되어있으면 사용 불가능
		Car c2 = new Car("포르쉐", "red", 500);
		c1.model = "기아";
		c1.test();
		
		System.out.println(Car.count);
		
	}

}
