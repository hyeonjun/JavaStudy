package ch09.test3.exam;

public class LgTV implements TV{
	@Override
	public void turnOn() {
		System.out.println("Lg TV -- ���� �Ҵ�");
	}
	@Override
	public void turnOff() {
		System.out.println("Lg TV -- ���� ����");
	}
	@Override
	public void soundUp() {
		System.out.println("Lg TV -- �Ҹ� �ø���");
	}
	@Override
	public void soundDown() {
		System.out.println("Lg TV -- �Ҹ� ������");
	}
}
