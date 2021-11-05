package com.coding.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백준 10818 최소, 최대 구하는 문제
 */
public class B10818 {

	public static void main(String[] args) {
		scannerUse();
	}

	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int[] arr = new int[a];
		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextInt();

		}
		sc.close();
		//선택 정렬
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) { // +1을 하는 이유는 자기와 비교할 필요가 없기 때문
				if (arr[i] > arr[j]) { // '>' 일 경우 오름차순 '<' 일 경우 내림차순
					int temp = arr[i]; // 값 변경해야 하기에 임시 저장
					arr[i] = arr[j]; // j를 i로 변경
					arr[j] = temp; // i를 j로 변경
				}
			}
		}
		//메서드 사용
		//Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[a - 1]);
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		//max, min을 값을 반대로 int형의 최댓값, 최솟값으로 초기화한 이유는
		//최솟값, 최대값으로 초기화를 하면 조건문을 만족시킬 수가 없다.
		//최솟값을 0으로 초기화하고 입력받은 값이 0보다 큰 숫자들이라면 
		//if문을 만족시키지 못한다. 그래서 반대로 값을 설정.
		
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			//3, 5, 2가 주어진 데이터라면
			//첫번째 반복에는 max가 3이된다.
			//두번째 반복에는 val = 5이고, max는 3이기 때문에 if문을 만족시키지 못함으로 값이 변하지 않는다.
			//셋번째 반복에는 val = 2 max = 3이기 때문에 if문을 만족하여 max = 2가 된다.
			int val = Integer.parseInt(st.nextToken());
			if(val>max) {
				max = val;
			}
			//위의 설명과 마찬가지이다.
			if(val<min) {
				min = val;
			}
		}
		System.out.println(min + " " + max);
	}
}
