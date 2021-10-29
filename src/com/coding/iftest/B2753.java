package com.coding.iftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 백준 2753문제 윤년문제
 */
public class B2753 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		bufferedUse();
		scannerUse();
	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		//100의 배수가 아닐 때 또는 400의 배수일 때가 윤년이다
		//4로 나눴을 때 나머지가 0이고 400으로 나눴을 때 나머지가 0이면 윤년
		//100으로 나눴을 때 나머지가 0이면 평년
		//둘 다 아닌 경우도 윤년
		if(a % 4 == 0) {
			if(a % 400 == 0) {
				System.out.println("1");
			}else if(a % 100 == 0) {
				System.out.println("0");
			}else {
				System.out.println("1");
			}
		//나머지가 0이 아닌경우 평년
		}else {
			System.out.println(0);
		}
		sc.close();
	}
	
	/*
	 * bufferedReader를 사용한 방법
	 */
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		System.out.println((a%4==0)?((a%400==0)?"1":(a%100==0)?"0":"1"):"0");
		
	}
}
