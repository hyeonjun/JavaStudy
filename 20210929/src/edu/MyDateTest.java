package edu;

public class MyDateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDate d = new MyDate();
		// �ν��Ͻ� ���� �� Heap�޸𸮿� ����ǰ�
		// �� �ν����� ��� �������� �ڵ����� �⺻������ ����ȴ�.
		// ��, ��������� ���� �������� �ʾƵ� int -> 0���� ��µ�
//		System.out.println(d.year); // 0
		
//		d.year = 21;
//		d.month = 9;
//		d.day = 29;
		d.info();
		d.setDay(20);
		System.out.println(d.getDay());
	}

}
