package com.javaex.practice;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int correct = 45;//(int)(Math.random()*100)+1;
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			System.out.print(">>");
			int num = sc.nextInt();
			
			if(correct<num) {
				System.out.println("더 낮게");
			} else if(correct>num) {
				System.out.println("더 높게");
			} else if(correct==num){
				System.out.println("맞았습니다");
				break;
			} 
		}
		
	}

}
