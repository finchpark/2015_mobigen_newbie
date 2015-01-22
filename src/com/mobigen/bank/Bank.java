package com.mobigen.bank;

import java.util.HashMap;
import java.util.Scanner;

public class Bank {
    chlrhkddms
	private HashMap<String, Account> accs = new HashMap<String, Account>();
	public static Scanner sc = new Scanner(System.in);
	
	public int menu() {
		System.out.println("[���뻾]");
		System.out.println("1. 怨꾩쥖媛쒖꽕");
		System.out.println("2. �엯湲�");
		System.out.println("3. 異쒓툑");
		System.out.println("4. 怨꾩쥖議고쉶");
		System.out.println("5. �쟾泥� 怨꾩쥖 議고쉶");
		System.out.println("0. 醫낅즺");
		System.out.print("�꽑�깮 : ");
		
		int sel = sc.nextInt();
		return sel;
	}

	public void createAccount() {
		// 怨꾩쥖踰덊샇 �엯�젰
		// 怨좉컼 �씠由� �엯�젰
		// �엯湲덉븸 �엯�젰
		
		// 怨꾩쥖踰덊샇 以묐났 諛⑹�
		
		// 怨꾩쥖 �깮�꽦
	}

	public void deposit() {
		// 怨꾩쥖踰덊샇 �엯�젰
		// �엯湲덉븸 �엯�젰
	}

	public void withdraw() {
		// 怨꾩쥖踰덊샇 �엯�젰
		// 異쒓툑�븸 �엯�젰
	}

	public void accountInfo() {
		System.out.println("[怨꾩쥖 議고쉶]");
		System.out.println("怨꾩쥖踰덊샇: ");
		String id = sc.next();
		
		if(accs.containsKey(id) == false){
			System.out.println("�옒紐삳맂 怨꾩쥖踰덊샇 �엯�땲�떎.");
			return;
		}
		
		System.out.println(accs.get(id));
	}

	public void allAccountInfo() {
		// 紐⑤뱺 怨꾩쥖 異쒕젰
	}
}
