package com.mobigen.bank;
///////////////하이 나이
public class Account {
	
	private String id;
	private String name;
	private int balance;
	
	public Account() {}
	
	public Account(String id, String name, int balance) {
		this.id = id;
		this.name = name;
		this.balance = balance;
	}
	
	public void deposit(int money){
		if(money <= 0){
			System.out.println("돈이없어요");
			System.out.println("DEPOSIT ERROR");
		}
		
		this.balance += money;
	}
	
	public void withdraw(int money){
		if(this.balance < money){
			System.out.println("WITHDRAW ERROR");
		}
		
		this.balance -= money;
	}
	
	@Override
	public String toString() {		
		return "ACCOUNT NO.: " + id + ", NAME: " + name + ", BALANCE: " + balance;
	}
}
