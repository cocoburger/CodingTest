package com.coding.whiletest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;

/*
 * 백준 1110 더하기 사이클 문제
 * 
 * 주어진 수의 일의 자릿수가 새로운 수의 십의 자릿수로 간다.
 * 10으로 나눈 나머지 값에 10을 곱하면 십의 자릿수가 된다. (주어진 수 % 10) * 10=> 십의 자릿수
 * 일의 자릿수는 ((주어진 수 / 10) + (주어진 수 % 10)) % 10 => 일의 자릿수
 * ((주어진 수 % 10) * 10) + (((주어진 수 / 10) + (주어진 수 * 10)) % 10)
 * 처음 입력한 값과 비교하여 값이 같으면 break로 while문을 빠져나온다.
 * 
 */
public class B1110 {

	public static void main(String[] args) {
	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		sc.close();
		int copy = a;
		int cnt = 0;
		while(true) {
			//앞의 식은 십의 자리를 구하고 뒤의 식은 일의 자리는 구하는 식이다.
			
			a = ((a%10) * 10 ) + (((a/10) + (a%10)) % 10);
			cnt++;
			
			if(copy == a) {
				break;
			}
		}
		System.out.println(cnt);
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a = Integer.parseInt(br.readLine());
		int temp = a;
		int count = 0;
		
		while(true) {
			int q = temp / 10; //a의 십의 자리
			int r = temp % 10; //a의 일의 자리
			
			int sum = q+r;
			
			//일의 자리에 10을 곱해주어 십의 자리로 만들어 주고 sum % 10을 하면 새로운 일의 자릿수가 된다.
			
			temp = r * 10 + sum % 10;
			count++;
			
			if(a == temp) {
				break;
			}
		}
		br.close();
		bw.write(count + "\n");
		bw.flush();
		bw.close();
	}
}
