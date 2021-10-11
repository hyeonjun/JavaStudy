package edu;

public class Account {
	static int count;
	String accNo;
	int balance;
	
	public Account(String accNo) {
		this.accNo = accNo;
		this.balance = 0;
		Account.count++;
	}
	
	public void depoit(int money) {
		this.balance += money;
	}
	
	public void withdraw(int money) {
		this.balance -= money;
	}
	
	public static void getAccountCnt() {
		System.out.println(Account.count);
	}
}
