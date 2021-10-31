package com.coding.fortest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 백준 2739 구구단 문제
 */
public class B2739 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		bufferedUse();
		scannerUse();
	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		for(int i = 1; i<10; i++) {
			System.out.println(a +"*" + i + "=" + a*i);
		}
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//BufferedReader의 readLine메서드로 text를 입력받고 Integer.parseInt로 int형으로 형변환
		int a = Integer.parseInt(br.readLine());
		
		//구구단은 1부터 9까지 곱해주니 i를 1로 초기화 조건식을 10미만으로 조건 설정 
		for(int i = 1; i<10; i++) {
			//a는 입력받은 값 i는 1부터 시작 a*i는 결과값이다.
			System.out.println(a +" * " + i + " = " + a*i);
		}
	}
}
