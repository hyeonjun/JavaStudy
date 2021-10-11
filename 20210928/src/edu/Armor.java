package edu;

/* 접근 제한자
 * private : 동일 클래스
 * default : 동일 패키지
 * protected : 동일 패키지 or 상속
 * public : 접근 제한 없음
 * */

public class Armor {
	// 멤버변수 : 클래스의 특성을 나타내는 값, 클래스의 멤버로 선언
	String name; 
	int height;
	int weight;
	String color;
	boolean isFly;
	
	int takeOff() {
		int temp = 10;
		System.out.println("엔진을 구동한다");
		System.out.println("속도를 높인다");
		System.out.println("비행한다");
		boolean a = false;
		return temp;
	}
	
	int sum(int a, int b) {
		return a+b;
	}
	
	void land() {
		System.out.println("속도 줄임");
		return; // 메소드 실행 종료
			
	}
		
	void shootLaser() {
		
	}
	
	void launchMissile() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
