package com.coding.iftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백문 9498문제 시험성적
 */
public class B9498 {

	public static void main(String[] args) throws IOException {
		bufferedUse();
		scannerUse();
	}
	
	/*
	 * Scanner를 사용한 방법 
	 */
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		if(100 <= a || a >= 90) {
			System.out.println("A");
		}else if(89 <= a || a >= 80) {
			System.out.println("B");
		}else if(79 <= a || a >= 70) {
			System.out.println("C");
		}else if(69 <= a || a >= 60) {
			System.out.println("D");
		}else if(0  <= a || a <= 59){
			System.out.println("F");
		}
		sc.close();
	}
	
	/*
	 * BufferedReader를 사용한 방법
	 */
	public static void bufferedUse() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a = Integer.parseInt(st.nextToken());
		
		//출력문에 삼항연산자를 사용하여 출력 괄호를 묶어줘야한다.
		System.out.println((a >= 90) ? "A" : (a >= 80) ? "B" : (a >= 70) ? "C" : (a >=60) ? "D" : "F");
	}
}
