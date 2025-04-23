package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		System.out.print("숫자: ");
		int max = sc.nextInt();
		
		for(int i = 1; i <5; i++) {
			System.out.print("숫자: ");
			int num = sc.nextInt();
			
			if(num > max) {
				max = num;
			}
		}
		
		System.out.println("최대값은" + max + "입니다.");
		sc.close();
	}

}
