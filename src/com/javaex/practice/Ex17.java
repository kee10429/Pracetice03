package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int line=1; line<=num; line++) {
			for(int i=1; i<=line; i++) {
				System.out.print("*");
			} System.out.println();
			
			
		} sc.close();
	}
}
