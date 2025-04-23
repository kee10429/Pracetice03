package com.javaex.practice;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 입력하세요: ");
		int num = sc.nextInt();
		int count = num/5;
		
		System.out.println("5의배수의 개수: " + count);
		
		int sum = 0;
		for(int i=1;i<=count;i++) {
			sum = sum + i;
		}System.out.println("5의배수 합 : "+ 5*sum );
		
		
			sc.close();
		
	}
}
