package edu;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car1 c1 = new Car1(); // �⺻ �������� Car�� private�� ���� ���ѵǾ������� ��� �Ұ���
		Car1 c2 = new Car1("������", "red", 500);
		c1.model = "���";
		c1.test();
		
		System.out.println(Car1.count);
		
	}

}
