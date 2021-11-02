package com.coding.fortest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백준 11021 A+B - 7 문제
 */
public class B11021 {

	public static void main(String[] args) throws IOException {
		//scannerUse();
		//bufferedUse();
		charUse();
	}

	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = 0;
		int b = 0;
		int i = 0;
		for (i = 1; i <= N; i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("Case #" + i + ": " + (a + b));
		}
		sc.close();
	}
	
	public static void bufferedUse() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i<=N; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write("Case #" + i + ": " + (Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()))+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void charUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i<N; i++) {
			String str = br.readLine();
			bw.write("Case #"+i+": ");
			bw.write(str.charAt(0)-'0'+str.charAt(2)-'0'+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
