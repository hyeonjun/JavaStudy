package ch08.test4;

public class Test {
//	public static void calcTax(Saleman e) { // 각 직원의 세금을 계산
//		System.out.println("직원의 세금 계산");
//	}
//	
//	
//	public static void calcTax(Consultant e) { // 각 직원의 세금을 계산
//		System.out.println("직원의 세금 계산");
//	}
//	
//	public static void calcTax(Manager e) { // 각 직원의 세금을 계산
//		System.out.println("직원의 세금 계산");
//	}
	
	public static void calcTax(Employee e) { // 부모타입으로 선언
		System.out.println("직원의 소득세 계산");
		
		// instanceof : 타입 확인
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
		
		calcTax(s); // Test.calcTax(); 도 가능
		calcTax(c); // 세 메소드 전부 Employee를 상속받고있다.
		calcTax(m); // => 다형성
		
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


