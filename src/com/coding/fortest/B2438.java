package com.coding.fortest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 백준 2438 별찍기 - 1문제
 */
public class B2438 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//scannerUse();
		//bufferedUse();
		stringbuilderUse();
	}

	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		sc.close();
		
		//row
		for (int i = 1; i <= a; i++) {
			//column
			for (int j = 1; j <= 10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<N; i++) {
			for(int j =0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void stringbuilderUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i<N; i++) {
			for(int j = 0; j<=i; j++) {
				sb.append("*");
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
