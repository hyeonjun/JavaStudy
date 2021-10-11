package edu;

public class ArmorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Armor c = new Armor();
		Armor d = new Armor(); // 인스턴스 생성
		
		c.name = "마크2";
		d.name = "mark16";
		
		System.out.println(c.name);
		System.out.println(d.name);
		
		int temp = c.takeOff();
		d.takeOff();
		System.out.println(c.sum(5,  6));
	}

}
