package com.coding.fortest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백준 10871번 X보다 작은 수 문제
 */
public class B10871 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// scannerUse();
		// bufferedUse();
		 stringBuilderUse();
		
	}

	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);

		// N개로 이루어진 수열의 크기를 입력받아서 arr에 크기를 지정
		int N = sc.nextInt();
		// X보다 작은 수를 출력하는 프로그램이므로 X를 입력받는다.
		int X = sc.nextInt();

		// 수열 A
		int[] arr = new int[N];

		// 반복문을 사용하여 배열 마지막 인덱스까지 입력값을 받는다.
		// 인덱스는 0부터이기때문에 i = 0으로 초기화 마지막인덱스는 length-1이기때문에 미만
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < N; i++) {
			// 입력받은 X보다 미만인 수를 출력하므로 아래 조건식을 주었다.
			if (arr[i] < X) {
				System.out.println(arr[i] + " ");
			}
		}
		sc.close();
	}

	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int X = Integer.parseInt(br.readLine());

		int[] arr = new int[N];

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		for (int i = 0; i < N; i++) {
			if (arr[i] < X) {
				System.out.println(arr[i] + " ");
			}
		}
	}

	public static void stringBuilderUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// BufferedReader로 String으로 값을 입력받고 공백을 구분자로 데이터를 나눈다.
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		// nextToken()으로 값을 반환해주고 int형으로 형변환 해준다.
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());

		// StringBuilder의 append를 사용해 하나의 문자열로 만들어준다
		StringBuilder sb = new StringBuilder();

		// 새로운 객체를 생성하여 참조한다. 문자열을 입력받고,공백을 구분자
		// 새로 객체를 만드는 이유는 기존의 참조하던 객체에는 데이터가 없고 중복될 수 있으므로, 새로운 객체를 생성했다.
		st = new StringTokenizer(br.readLine(), " ");

		for (int i = 0; i < N; i++) {
			// 저장된 데이터를 nextToken으로 값 반환 int형으로 형변환하여 value에 저장
			int value = Integer.parseInt(st.nextToken());
			// 저장된 value가 입력받은 값보다 미만이면 해당 값을 저장
			if (value < X) {
				sb.append(value).append(' ');
			}
		}
		br.close();
		System.out.println(sb);
	}
	
}
