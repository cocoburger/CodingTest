package com.coding.iftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 백준 14681 사분면 고르기
 */
public class B14681 {

	public static void main(String[] args) {
		scannerUse();
	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		sc.close();
		
		if(a > 0 && b > 0) {
			System.out.println(1);
		}else if(a > 0 && b < 0) {
			System.out.println(4);
		}else if(a < 0 && b > 0) {
			System.out.println(2);
		}else if(a < 0 && b < 0) {
			System.out.println(3);
		}
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//BufferedReader로 text(String)를 입력받고 Integer.parseInt을 사용해 
		//int형으로 형변환
		int x = Integer.parseInt( br.readLine());
		int y = Integer.parseInt(br.readLine());
		
		/*
		 * 1 = x, y 둘 다 양수
		 * 2 = x 음수, y 양수
		 * 3 = x,y 둘 다 음수
		 * 4 = x는 양수, y는 음수
		 * && and를 사용해 두개의 조건이 true이면 해당 값을 출력할 수 있게 작성 
		 */
		if(x > 0 && y > 0) {
			System.out.println(1);
		}else if(x > 0 && y < 0) {
			System.out.println(4);
		}else if(x < 0 && y > 0) {
			System.out.println(2);
		}else if(x < 0 && y < 0) {
			System.out.println(3);
		}
		
	}
}
