package Test;

public class CellPhoneMain {
 
	public static void main(String[] args) { 
		CellPhone myPhone = new CellPhone("SCH-600");
		
		myPhone.charge( 20 );  //20분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 300 );  //300분간 통화를 한다.
		myPhone.printBattery();
		
		myPhone.charge( 50 );  //50분간 충전을 한다.
		myPhone.printBattery();
		
		myPhone.call( 40 );  //40분간 통화를 한다.
		myPhone.printBattery();
		
	
		myPhone.call( -20 );  //통화시간이 잘못 입력되었다.
	
		
		CellPhone yourPhone = new CellPhone("SCH-600");
		
		if( myPhone.equals(yourPhone) ) {
			System.out.println("동일 모델입니다.");
		} else {
			System.out.println("다른 모델입니다.");
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
			System.out.println("통화시간입력오류");
		} else {
			System.out.println("통화 시간 : "+time);
			if (battery < time * 0.5) {
				battery = 0;
			} else {
				battery -= time * 0.5;
			}
		}
	}
	
	public void charge(int time) {
		if (time < 0) {
			System.out.println("충전시간입력오류");
		} else {
			System.out.println("충전 시간 : "+time);
			battery = (battery + (time * 3) > 100) ? 100 : battery + (time * 3); 
		}
	}
	
	public void printBattery() {
		System.out.println("남은 배터리 양 : "+battery);
	}
	
	public boolean equals(Object obj) {
		boolean result = false;
		if (obj instanceof CellPhone && this.model.equals(((CellPhone)obj).model)){
			result = true;
		}
		return result;
	}
}
