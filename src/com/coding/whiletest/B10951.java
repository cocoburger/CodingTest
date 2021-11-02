package com.coding.whiletest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백준 10951 A+B - 4 문제
 * 강제 종료를 시켜줘야하는게 KEY POINT
 */
public class B10951 {

	public static void main(String[] args) {
		scannerUse();
	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a+b);
		}
		sc.close();
	}
	
	public static void bufferedUse() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		while((str=br.readLine()) != null) {
			st = new StringTokenizer(str, " ");
			int a= Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			sb.append(a+b).append('\n');
		}
		br.close();
		System.out.println(sb);
	}
}
