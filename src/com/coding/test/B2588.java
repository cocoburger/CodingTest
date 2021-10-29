package com.coding.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백준 곱셈 문제
 */
public class B2588 {

	public static void main(String[] args) {
		// scannerUse();
		bufferedUse();
	}

	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();

		String B = sc.next();

		sc.close();

		System.out.println(A * (B.charAt(2) - '0'));
		System.out.println(A * (B.charAt(1) - '0'));
		System.out.println(A * (B.charAt(0) - '0'));
		System.out.println(A * Integer.parseInt(B));
	}

	public static void bufferedUse() {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try {
			int a = Integer.parseInt(br.readLine());
			int b = Integer.parseInt(br.readLine());
			br.close();
			StringBuilder sb = new StringBuilder();

			sb.append(a * (b % 10));
			sb.append('\n');

			sb.append(a * ((b % 100) / 10));
			sb.append('\n');

			sb.append(a * (b / 100));
			sb.append('\n');

			sb.append(a * b);

			System.out.println(sb);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
