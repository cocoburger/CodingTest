package com.coding.fortest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 백준 2439번 별 찍기 -2 문제
 */
public class B2439 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//scannerUse();
		bufferedUse();
	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		/*
		 * N번을 입력하면 N번의-n만큼 공백으로 채워지고 *이 출력된다.
		 * 입력받은 N에 -i를 해주면 된다. i가 row이므로
		 */
		for(int i = 1; i<=N; i++) {
			for(int j=1; j<=N-i; j++) {
				System.out.print(" ");
			}
			//*은 하나씩 증가하기 때문에 조건식으로 미만을 주었다.
			for(int k=0; k<i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i<=N; i++) {
			for(int j =1; j<=N-i; j++) {
				sb.append(" ");
			}
			for(int k =0; k<i; k++) {
				sb.append("*");
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
