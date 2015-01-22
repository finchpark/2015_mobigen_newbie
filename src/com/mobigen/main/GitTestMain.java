package com.mobigen.main;

import com.mobigen.bank.Bank;

public class GitTestMain {

	public static void main(String[] args) {
		Bank bank = new Bank();
		
		int selNum = 0;
		
		while(true){
			selNum = bank.menu();
			
			if(selNum == 0){
				break;
			}
			
			switch(selNum){
			case 1:
				bank.createAccount();
				break;
				
			case 2:
				bank.deposit();
				break;
				
			case 3:
				bank.withdraw();
				break;
				
			case 4:
				bank.accountInfo();
				break;
				
			case 5:
				bank.allAccountInfo();
				break;
				
			default:
				System.out.println("잘못 입력 하셨습니다.");
				break;
			}
		}
	}
}
