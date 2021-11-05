package com.coding.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준 11729 하노이의 탑 문제
 */
public class B11729 {
	
	public static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a= Integer.parseInt(br.readLine());
		
		//일반항 총 원반이 움직이는 횟수 2n - 1 
		// a1 = 1, an+1 = 2an + 1, 점화식에 의한 수열 일반항을 구하면 an = 2n-1
		sb.append((int) (Math.pow(2, a)-1)).append('\n');
		
		hanoi(a,1,2,3);
		
		System.out.println(sb);
	}
	
	/*
	 * N : 원반의 수
	 * from : 원반들이 위치한 곳의 번호
	 * to : 원반들을 옮길 목적지 번호
	 * other : 나머지 한 곳(목적지가 아닌) 곳 번호
	 */
	public static void hanoi(int a, int from, int other, int to) {
		//원반의 개수가 1개일 때
		if(a == 1) {
			sb.append(from + " " + to + "\n");
			return;
		}
		
		hanoi(a-1, from, to, other);
		
		sb.append(from + " " + to + "\n");
		
		hanoi(a-1, other, from, to);
	}
}
