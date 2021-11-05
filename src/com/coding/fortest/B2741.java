package com.coding.fortest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
<<<<<<< HEAD
 * 백준 2741 N 찍기 문제
 */
public class B2741 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//scannerUse();
		bufferedUse();
	}
	

	
	public static void stringbuilderUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		
		br.close();
		
		int i = 1;
		StringBuilder sb = new StringBuilder();
		
		while(i<=a) {
			sb.append(i+"\n");
			i++;
		}
	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		int i = 1;
		
		while(a >= i) {
			System.out.println(i);
			i++;
		}
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		br.close();
		StringBuilder sb = new StringBuilder();
		
		int i = 1;
		//a가 i보다 크고 같으면 반복문
		while(a >= i) {
			//StringBuilder의 append를 사용해 하나의 문자열로 만들어준다. i를 추가 해주고 줄바꿈을 해준다.
			sb.append(i+"\n");
			//i를 1씩 더해준다.
			i++;
		}
		//StringBuilder에 담긴 데이터를 한꺼번에 출력
		System.out.println(sb);
	}
}
