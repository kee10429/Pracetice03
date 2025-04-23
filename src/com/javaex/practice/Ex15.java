package com.javaex.practice;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요: ");
		int num = sc.nextInt();
		
		for(int j=1 ; j<=num ; j++ ) {
			if(num%j==0) {
				System.out.println(j);
			}
			
		} 
		
		
	}

}
