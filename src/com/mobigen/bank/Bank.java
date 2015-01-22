package com.mobigen.bank;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {
	
	private HashMap<String, Account> accs = new HashMap<String, Account>();
	public static Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("[BANK]");
		System.out.println("1. CREATE ACCOUNT");
		System.out.println("2. DEPOSIT");
		System.out.println("3. WITHDRAW");
		System.out.println("4. ACCOUNT INFO");
		System.out.println("5. ALL ACCOUNT INFO");
		System.out.println("0. EXIT");
		System.out.print("SELECT: ");
		
		int sel = sc.nextInt();
		return sel;
	}

	public void createAccount() {
		// Input Account Number
		// Input Customer Name
		// Input Deposit Money
		
		// Check Duplicate Account
		
		// Create Account
	}

	public void deposit() {
		// Input Account Number
		// Input Deposit Money
	}

	public void withdraw() {
		// Input Account Number
		// Input Withdraw Money
	}

	public void accountInfo() {
		System.out.println("[CHECK ACCOUNT]");
		System.out.println("ACCOUNT NO: ");
		String id = sc.next();
		
		if(accs.containsKey(id) == false){
			System.out.println("WRONG ACCOUNT NUMBER");
			return;
		}
		
		System.out.println(accs.get(id));
	}

	public void allAccountInfo() {
		// Print All Account Info
	}
}
