package com.coding.fortest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 백준 8393 합 문제
 * 1부터 입력한 n값까지 합을 구하는 문제
 * ex) 5 => 1+2+3+4+5 = 15
 */
public class B8393 {

	public static void main(String[] args) {
		scannerUse();
	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		int sum =0;
		
		for(int i =1; i<=a; i++) {
			//sum = sum + i 
			sum += i;
		}
		System.out.println(sum);
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		int a = Integer.parseInt(br.readLine());
		int sum = 0;
		br.close();
		for(int i = 1; i<=a; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}
}
