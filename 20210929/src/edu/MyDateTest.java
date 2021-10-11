package edu;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate d = new MyDate();
		// 인스턴스 생성 시 Heap메모리에 적재되고
		// 이 인스턴의 멤버 변수들은 자동으로 기본값으로 저장된다.
		// 즉, 멤버변수의 값을 지정하지 않아도 int -> 0으로 출력됨
//		System.out.println(d.year); // 0
		
//		d.year = 21;
//		d.month = 9;
//		d.day = 29;
		d.info();
		d.setDay(20);
		System.out.println(d.getDay());
	}

}
