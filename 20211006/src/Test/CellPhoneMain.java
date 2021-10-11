package Test;

public class CellPhoneMain {
 
	public static void main(String[] args) { 
		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge( 20 );  //20�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50�а� ������ �Ѵ�.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40�а� ��ȭ�� �Ѵ�.
		myPhone.printBattery();
		
	
		myPhone.call( -20 );  //��ȭ�ð��� �߸� �ԷµǾ���.
	
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("���� ���Դϴ�.");
		} else {
			System.out.println("�ٸ� ���Դϴ�.");
		} 
	} 
}

class CellPhone {
	String model;
	double battery;
	
	public CellPhone(String model) {
		this.model = model;
	}
	
	public void call(int time) {
		if (time < 0) {
			System.out.println("��ȭ�ð��Է¿���");
		} else {
			System.out.println("��ȭ �ð� : "+time);
			if (battery < time * 0.5) {
				battery = 0;
			} else {
				battery -= time * 0.5;
			}
		}
	}
	
	public void charge(int time) {
		if (time < 0) {
			System.out.println("�����ð��Է¿���");
		} else {
			System.out.println("���� �ð� : "+time);
			battery = (battery + (time * 3) > 100) ? 100 : battery + (time * 3); 
		}
	}
	
	public void printBattery() {
		System.out.println("���� ���͸� �� : "+battery);
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof CellPhone && this.model.equals(((CellPhone)obj).model)){
			result = true;
		}
		return result;
	}
}
