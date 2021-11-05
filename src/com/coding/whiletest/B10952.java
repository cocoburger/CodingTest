package com.coding.whiletest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백준 10952 A+B -5 문제
 */
public class B10952 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//scannerUse();
		stringBuilderUse();
	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			int a= sc.nextInt();
			int b = sc.nextInt();
			
			
			if(a==0&&b==0) {
				sc.close();
				break;
			}
			System.out.println(a+b);
		}
	}
	/*
	 * BufferedReader를 사용하여 입력값을 받고
	 * StringTokenizer로 구분
	 * StringBuilder로 문자열을 이어준다.
	 */
	public static void stringBuilderUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			if(a==0 && b==0) {
				br.close();
				break;
			}
			sb.append((a+b)).append('\n');
		}
		System.out.println(sb);
	}
}
