package edu;

/* ���� ������
 * private : ���� Ŭ����
 * default : ���� ��Ű��
 * protected : ���� ��Ű�� or ���
 * public : ���� ���� ����
 * */

public class Armor {
	// ������� : Ŭ������ Ư���� ��Ÿ���� ��, Ŭ������ ����� ����
	String name; 
	int height;
	int weight;
	String color;
	boolean isFly;
	
	int takeOff() {
		int temp = 10;
		System.out.println("������ �����Ѵ�");
		System.out.println("�ӵ��� ���δ�");
		System.out.println("�����Ѵ�");
		boolean a = false;
		return temp;
	}
	
	int sum(int a, int b) {
		return a+b;
	}
	
	void land() {
		System.out.println("�ӵ� ����");
		return; // �޼ҵ� ���� ����
			
	}
		
	void shootLaser() {
		
	}
	
	void launchMissile() {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
