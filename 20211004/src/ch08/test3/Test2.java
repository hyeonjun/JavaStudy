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


abstract class Employee{ // 추상 클래스, new 생성 불가능. 이 클래스를 상속받은 클래스에서 추상 메소드를 상속한 클래스를 new 생성하면 메모리에 올라감
	String name;
	int salary;
	
	public abstract void calcSalry(); // abstact = 일부러 바디를 만들지 않음, 이 클래스를 상속하는 클래스는 모두 이 메소드를 상속해야한다.
	public abstract void calcBonus();
}

class Saleman extends Employee{
	@Override
	public void calcSalry() {
		System.out.println("Saleman 급여 = 기본금 + 판매 수당");
	}
	
	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Saleman 급여 = 기본금 * 12 * 6");
	}
}

abstract class Manager extends Employee{ // 상속받는 메소드도 abstract를 사용하면 부모 클래스의 메소드를 오버라이드하지 않아도 된다.
	@Override
	public void calcSalry() {
		System.out.println("Manager 급여 = 기본금 + 팀 성과 수당");
	}
	
	@Override
	public abstract void calcBonus();
}

class Consultant extends Employee{
	@Override
	public void calcSalry() {
		System.out.println("Consultant 급여 = 기본금 + 컨설팅 특별 수당");
	}
	
	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Consultant 급여 = 기본금 * 12 * 4");
	}
}

class Director extends Manager{
	@Override
	public void calcBonus() {
		// TODO Auto-generated method stub
		System.out.println("Director 급여 = 기본금 * 12 * 6");
	}
}
