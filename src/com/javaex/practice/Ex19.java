package com.javaex.practice;

import java.util.Scanner;

public class Ex19 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		while(true) {
		System.out.println("--------------------------------");
		System.out.println("1.예금 : 2.출금 : 3.잔고 : 4.종료");
		System.out.println("--------------------------------");
		
		System.out.println("선택>");
		int pick = sc.nextInt();
		
		if(pick==4) {
			System.out.println("프로그램 종료");
			break;
		}
		
		if(pick==1) {
			System.out.println("예금액>1500");
		}else if(pick==2) {
			System.out.println("출금액>700");
		}else if(pick==3) {
			System.out.println("잔고액>800");
		}else {
			System.out.println("다시 입력해주세요");
		}
		
	   }
	}	
}
