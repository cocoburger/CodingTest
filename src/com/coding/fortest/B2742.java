package com.coding.fortest;

import java.util.Scanner;

/*
 * 백준 2742 N기찍 문제
 */
public class B2742 {

	public static void main(String[] args) {
		scannerUse();
	}
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		while(N > 0) {
			System.out.println(N);
			N--;
		}
	}
}
