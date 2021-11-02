package com.coding.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 백준 2562 최댓값 문제
 */
public class B2562 {

	public static void main(String[] args) {

	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
				sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),
				sc.nextInt()};
		
		//count값은 곧 index값이다. -> for-each문을 사용하여 count를 증감시켜줬기 때문이다.
		//for-each문으로 배열의 항목 수만큼 실행부분을 반복해주며
		//반복이 이루어질 때마다 배열의 항목을 순서대로(index 0부터)꺼내어 우측 변수에 자동으로 대입한다.
		//단점? 값을 가져다가 사용만 가능 수정할 수 없고 성능 차이는 없다.
		
		int count = 0;
		int max = 0;
		int index = 0;
		for(int value : arr) {
			count++;
			//max를 0으로 초기화하였기에 첫번째 반복문에는 인덱스 0의 값이 저장된다.
			if(value > max) {
				max = value;
				index = count;
			}
		}
		System.out.println(max + "\n" + index);
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[] arr = new int[9];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		int max = 0;
		int count = 0;
		int index = 0;
		
		for(int value : arr) {
			count++;
			
			if(value > max) {
				max = value;
				index =count;
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
	
	public static void noArray() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int index=0;
		int max=0;
		
		//문제가 9개의 서로 다른 자연수가 주어질 때
		
		for(int i = 0; i<9; i++) {
			//입력받은 값을 value에 저장
			int value = Integer.parseInt(br.readLine());
			//value와 마지막 value값을 비교하여 조건문에 만족하면 값을 바꾸고 index를 바꿔준다.
			if(value > max) {
				max = value;
				//인덱스는 0부터 시작이고 다음 인덱스가 저장되므로 +1을 해주어야한다.
				index = i+1;
				
			}
		}
		System.out.println(max);
		System.out.println(index);
	}
}
