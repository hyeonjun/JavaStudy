package ch09.test2;


public class Test {
	public static void main(String[] args) {
		
	}
}

interface Vehicle{ // �� Ŭ�������� ������ �ִ� ��� ������ �޼ҵ�� ��� abstract�� ������ ������ ����.
	double load = 1000.0;
	double maxLoad = 5000.0;
	
	public double calcFuelEfficiency();
	
	public double calcTripDistance();
}

class Truck implements Vehicle{ // interface�� ����� ���� extends�� �ƴ� implements�� ��ӹ޴´�
	@Override
	public double calcFuelEfficiency() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public double calcTripDistance() {
		// TODO Auto-generated method stub
		return 0;
	}
}
