package com.mobigen.bank;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {

	private HashMap<String, Account> accs = new HashMap<String, Account>();
	public static Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("[은행]");
		System.out.println("1. 계좌개설");
		System.out.println("2. 입금");
		System.out.println("3. 출금");
		System.out.println("4. 계좌조회");
		System.out.println("5. 전체 계좌 조회");
		System.out.println("0. 종료");
		System.out.print("선택 : ");
		
		int sel = sc.nextInt();
		return sel;
	}

	public void createAccount() {
		// 계좌번호 입력
		// 고객 이름 입력
		// 입금액 입력
		
		// 계좌번호 중복 방지
		
		// 계좌 생성
	}

	public void deposit() {
		// 계좌번호 입력
		// 입금액 입력
	}

	public void withdraw() {
		// 계좌번호 입력
		// 출금액 입력
	}

	public void accountInfo() {
		System.out.println("[계좌 조회]");
		System.out.println("계좌번호: ");
		String id = sc.next();
		
		if(accs.containsKey(id) == false){
			System.out.println("잘못된 계좌번호 입니다.");
			return;
		}
		
		System.out.println(accs.get(id));
	}

	public void allAccountInfo() {
		// 모든 계좌 출력
	}
}
