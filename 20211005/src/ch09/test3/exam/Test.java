package ch09.test3.exam;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		LgTV tv = new LgTV();
//		SamsungTV tv = new SamsungTV();
//		TV tv = new SamsungTV();
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
		
		BeanFactory factory = new BeanFactory();
//		TV tv = (TV)factory.getBean("samsung");
//		TV tv = (TV)factory.getBean("lg");
//		tv.turnOn();
//		tv.soundUp();
//		tv.soundDown();
//		tv.turnOff();
		
		
		TV tv = (TV)factory.getBean(args[0]); // ���� �� �Է� ���� ���� ���޹���
		
	}

}
