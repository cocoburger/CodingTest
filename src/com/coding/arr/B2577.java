package com.coding.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;


/*
 * 백준 2577 숫자의 개수 문제
 */
public class B2577 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		bufferedUse();
		
		Scanner sc = new Scanner(System.in);
		
		int value = (sc.nextInt() * sc.nextInt() * sc.nextInt());
		sc.close();
		String str = Integer.toString(value);
		//0~9가 몇 번 쓰였는지 count하기 위해
		for(int i = 0; i<10; i++) {
			//count를 0으로 초기화 해준다.
			int count = 0;
			//곱한 결과값의 길이만큼 반복
			//charAt으로 한 개씩 비교해준다.
			for(int j = 0; j< str.length(); j++) {
				if((str.charAt(j) - '0' ) == i) {
					count++;
				}
			}
			System.out.println(count);
		}
		
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[10];
		
		int val = (Integer.parseInt(br.readLine()) * Integer.parseInt(br.readLine())
				* Integer.parseInt(br.readLine()));
		
		//int형을 String으로 변환후 저장
		String str = String.valueOf(val);
		
		//arr의 인덱스는 각 자리수 값, 인덱스에 담긴 값은 개수를 의미
		//
		for(int i = 0; i<str.length(); i++) {
			//System.out.println("각 자릿 수 : "+ i +" => " + arr[(str.charAt(i) - '0')]);
			//System.out.println("Arr[1] : "+arr[1]);
			arr[(str.charAt(i) - 48)]++;
		}
		
		for(int v : arr) {
			System.out.println(v);
		}
	}
}
