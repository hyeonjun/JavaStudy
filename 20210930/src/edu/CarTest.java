package edu;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1 = new Car(); // �⺻ �������� Car�� private�� ���� ���ѵǾ������� ��� �Ұ���
		Car c2 = new Car("������", "red", 500);
		c1.model = "���";
		c1.test();
		
		System.out.println(Car.count);
		
	}

}
