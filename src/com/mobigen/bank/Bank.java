package com.mobigen.bank;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {

//chlrhkddms
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
		System.out.println("\n[CREATE ACCOUNT] : hi");
		System.out.println("ACCOUNT NO: ");
		String id = sc.next();
		System.out.println("USER NAME: ");
		String name = sc.next();
		int money = 0;
		
		// Check Duplicate Account
		
		// Create Account
		// Put Account Information into HashMap
	}

	public void deposit() {
		System.out.println("\n[CREATE ACCOUNT]");
		System.out.println("ACCOUNT NO: ");
		String id = sc.next();
		System.out.println("DEPOSIT MONEY: ");
		int money = sc.nextInt();

		// Check Duplicate Account
		
		// Account.deposit()
	}

	public void withdraw() {
		System.out.println("\n[CREATE ACCOUNT]");
		System.out.println("ACCOUNT NO: ");
		String id = sc.next();
		System.out.println("WITHDRAW MONEY: ");
		int money = sc.nextInt();
		
		// Check Duplicate Account
		
		// Account.withdraw()
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
