package com.javaex.practice;

public class Ex05 {
	public static void main(String[] args) {
		
		 int i=1;
		 boolean flag = true;
		 
		 while(flag) {
			 if(i>=5) {
				 flag = false;
			 }
			 System.out.println(i);
			 i=i+1;
		 }
	}
}


/*
1
2
3
4
5

---> while()안에 들어간 것이 반복되는 조건식인데, 이곳에선 이 자리를 flag(true)로 정의했다. 즉, flag가 
true인 이상 계속해서 반복된다는 의미가 된다.
i는 1부터 시작되는데 i가 1~4일때까지는 flag를 유지하게 되는데, 5부터는 종료된다.

따라서 i값인 1,2,3,4,5만 도출되게 된다/


 






*/