package edu;

public class AccountTest {
	
	static {
		System.out.println("hello");
		System.out.println("good");
	} // 프로그램 시작 전 전처리 작업

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc1 = new Account("001");
		Account acc2 = new Account("002");
		Account acc3 = new Account("003");
		System.out.println(Account.count);
		
		
		acc1.depoit(10000);
		acc1.withdraw(2000);
		System.out.println(acc1.balance);
		
		Account.getAccountCnt();
		
		// 메소드를 static으로 만들었기 때문에 new 생성자로 인스턴스를 생성하지 않고 메소드를 바로 부를 수 있음 
		int result = Calc.add(10, 20);
		System.out.println(result);
	}

}
