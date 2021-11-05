package com.coding.recursion;

import java.util.Scanner;

/*
 * 별 찍기 10 
 */
public class B2447 {

	static char[][] arr;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		// 크기 입력
		arr = new int[N][N];

		star(0, 0, N, false);

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				sb.append(arr[i][j]);
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}

	public static void star(int x, int y, int N, boolean blank) {

		// 공백칸일 경우
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
		
		//거듭제곱이라고 할 때 => 3으로 나눈다.
		int size = N/3;
		int count = 0;
		for(int i = 0; i< x+N; i++) {
			for(int j = 0; j < y+N; j+=size) {
				count++;
				//공백칸일경우 5번째가 공백칸이다.
				if(count == 5) {
					star(i,j,size,true);
				}else {
					star(i, j , size, false);
				}
			}
		}
	}
}
