package com.mobigen.bank;

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
	
	@Override
	public String toString() {		
		return "계좌번호: " + id + ", 이름: " + name + ", 잔액: " + balance;
	}
}
