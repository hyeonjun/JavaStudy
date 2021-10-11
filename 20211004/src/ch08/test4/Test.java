package ch08.test4;

public class Test {
//	public static void calcTax(Saleman e) { // �� ������ ������ ���
//		System.out.println("������ ���� ���");
//	}
//	
//	
//	public static void calcTax(Consultant e) { // �� ������ ������ ���
//		System.out.println("������ ���� ���");
//	}
//	
//	public static void calcTax(Manager e) { // �� ������ ������ ���
//		System.out.println("������ ���� ���");
//	}
	
	public static void calcTax(Employee e) { // �θ�Ÿ������ ����
		System.out.println("������ �ҵ漼 ���");
		
		// instanceof : Ÿ�� Ȯ��
		if (e instanceof Saleman) {
//			Saleman se = (Saleman) e;
			System.out.println("Saleman");
			Saleman s = (Saleman)e;
			((Saleman) e).annual_sales = 0;
		} else if (e instanceof Consultant) {
			System.out.println("Consultant");
			Consultant c = (Consultant)e;
			((Consultant) e).num_project = 0;
		} else if (e instanceof Manager) {
			Manager m = (Manager)e;
			System.out.println("Manager");
			((Manager) e).num_team = 0;
		}
		
	}
	
	public static void main(String[] args) {
		Saleman s  = new Saleman();
		Consultant c = new Consultant();
		Manager m = new Manager();
		
		calcTax(s); // Test.calcTax(); �� ����
		calcTax(c); // �� �޼ҵ� ���� Employee�� ��ӹް��ִ�.
		calcTax(m); // => ������
		
	}
}

class Employee{
	String name;
	int salary;
}

class Saleman extends Employee {
	int annual_sales;
}

class Consultant extends Employee {
	int num_project;
}

class Manager extends Employee {
	int num_team;
}

class Director extends Manager {
	
}


