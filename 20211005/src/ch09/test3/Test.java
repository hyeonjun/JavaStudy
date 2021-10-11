package ch09.test3;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * SamsungTV tv = new SamsungTV(); tv.powerOn(); tv.volumUp(); tv.volumDown();
		 * tv.powerOff();
		 */
		
		LgTV tv = new LgTV();
		tv.turnOn();
		tv.soundUp();
		tv.soundDown();
		tv.turnOff();
	}

}
