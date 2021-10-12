package com.encore.java.error;

public class Test4 {
	public static void main(String[] args) {
		CellPhone c = new CellPhone();
		try {
			c.charge(30);
			c.charge(-30);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}

class CellPhone{
	int battery;
	
	public void charge(int time) throws NagativeNumberException {
		if (time < 0) {
			time = 0;
//			try {
				throw new NagativeNumberException(); // 강제 오류 발생
//			} catch (NagativeNumberException e) {
//				e.printStackTrace();
//			}
			
		}
		
		battery += time;
		System.out.println("배터리량: "+battery);
	}
}
