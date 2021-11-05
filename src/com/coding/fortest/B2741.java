package com.coding.fortest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 백준 2741 N 찍기 문제
 */
public class B2741 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//scannerUse();
		bufferedUse();
	}
	
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		
		int i = 1;
		
		while(i<=a) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		br.close();
		int i = 1;
		while(i<=a) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void stringbuilderUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		br.close();
		
		int i = 1;
		StringBuilder sb = new StringBuilder();
		
		while(i<=a) {
			sb.append(i+"\n");
			i++;
		}
		System.out.println(sb);
	}
}
