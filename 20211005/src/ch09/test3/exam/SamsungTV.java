package ch09.test3.exam;

public class SamsungTV implements TV{
	@Override
	public void turnOn() {
		System.out.println("Samsung TV -- ���� �Ҵ�");
	}
	@Override
	public void turnOff() {
		System.out.println("Samsung TV -- ���� ����");
	}
	@Override
	public void soundUp() {
		System.out.println("Samsung TV -- �Ҹ� �ø���");
	}
	@Override
	public void soundDown() {
		System.out.println("Samsung TV -- �Ҹ� ������");
	}
}
