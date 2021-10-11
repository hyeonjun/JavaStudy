package ch09.test3.exam;

public class LgTV implements TV{
	@Override
	public void turnOn() {
		System.out.println("Lg TV -- 전원 켠다");
	}
	@Override
	public void turnOff() {
		System.out.println("Lg TV -- 전원 끈다");
	}
	@Override
	public void soundUp() {
		System.out.println("Lg TV -- 소리 올린다");
	}
	@Override
	public void soundDown() {
		System.out.println("Lg TV -- 소리 내린다");
	}
}
