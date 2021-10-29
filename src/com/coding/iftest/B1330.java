package com.coding.iftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백준 1330문제 두 수 비교하기
 */
public class B1330 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		if(a > b) {
			System.out.println(">");
		}else if( a < b) {
			System.out.println("<");
		}else if(a == b) {
			System.out.println("==");
		}else {
			System.out.println("에러");
		}
		
		bufferedUse();
		sc.close();
	}
	/*
	 * BufferedReader를 사용한 방법이다.
	 */
	public static void bufferedUse() throws IOException {
		//문자열을 입력받을 수 있는 BufferedReader를 사용
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 입력 받은 값을 공백으로 분리
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		//st에 담긴 문자열을 반환하며, int형으로 형변환 시킨다.
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		//삼항연산자를 이용하여 바로 출력해준다.
		System.out.println(a > b ? ">" : (a<b) ? "<" : "==");
	}
}
