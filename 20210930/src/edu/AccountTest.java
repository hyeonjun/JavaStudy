package edu;

public class AccountTest {
	
	static {
		System.out.println("hello");
		System.out.println("good");
	} // ���α׷� ���� �� ��ó�� �۾�

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
		
		// �޼ҵ带 static���� ������� ������ new �����ڷ� �ν��Ͻ��� �������� �ʰ� �޼ҵ带 �ٷ� �θ� �� ���� 
		int result = Calc.add(10, 20);
		System.out.println(result);
	}

}
