package com.coding.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백준 1001번 문제 A-B
 */
public class B1001 {

	/*
	 * Scanner, BufferedReader를 사용해서 풀어보자`
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		//scannerUse();
		burredUse();
		
	}
	
	public static void scannerUse() {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a-b);
		sc.close();
	}
	
	public static void burredUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		System.out.println(a - b);
	}
}
