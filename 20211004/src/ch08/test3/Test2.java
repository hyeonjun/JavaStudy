package ch08.test3;

public class Test2 {
	public static void main(String[] args) {
		// Manager m  new Manager();
		Saleman s = new Saleman();
		Consultant c = new Consultant();
		Director d = new Director();
		
		s.calcSalry();
		s.calcBonus();
		
		c.calcSalry();
		c.calcBonus();
		
		d.calcSalry();
		d.calcBonus();
	}
}


abstract class Employee{ // �߻� Ŭ����, new ���� �Ұ���. �� Ŭ������ ��ӹ��� Ŭ�������� �߻� �޼ҵ带 ����� Ŭ������ new �����ϸ� �޸𸮿� �ö�
	String name;
	int salary;
	
	public abstract void calcSalry(); // abstact = �Ϻη� �ٵ� ������ ����, �� Ŭ������ ����ϴ� Ŭ������ ��� �� �޼ҵ带 ����ؾ��Ѵ�.
	public abstract void calcBonus();
}

class Saleman extends Employee{
	@Override
	public void calcSalry() {
		System.out.println("Saleman �޿� = �⺻�� + �Ǹ� ����");
	}
	
	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Saleman �޿� = �⺻�� * 12 * 6");
	}
}

abstract class Manager extends Employee{ // ��ӹ޴� �޼ҵ嵵 abstract�� ����ϸ� �θ� Ŭ������ �޼ҵ带 �������̵����� �ʾƵ� �ȴ�.
	@Override
	public void calcSalry() {
		System.out.println("Manager �޿� = �⺻�� + �� ���� ����");
	}
	
	@Override
	public abstract void calcBonus();
}

class Consultant extends Employee{
	@Override
	public void calcSalry() {
		System.out.println("Consultant �޿� = �⺻�� + ������ Ư�� ����");
	}
	
	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Consultant �޿� = �⺻�� * 12 * 4");
	}
}

class Director extends Manager{
	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Director �޿� = �⺻�� * 12 * 6");
	}
}
