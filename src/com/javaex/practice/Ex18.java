package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력하세요: ");
        int num = sc.nextInt();

        // 줄어드는 별 출력
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄 바꿈
        }

        // 늘어나는 별 출력
        for (int i = 2; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // 줄 바꿈
        }

        sc.close();
    }
}
