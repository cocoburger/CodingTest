package com.coding.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;

/*
 * 백준 3052 나머지 문제
 * 서로다른 나머지를 구하는 문제
 */
public class B3052 {

	public static void main(String[] args) {

	}

	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);

		// HashSet은 데이터 중복 허용 안함.
		// 서로 다른 나머지를 구하는 문제이므로 HashSet 사용 제네릭으로 Integer 선언
		HashSet<Integer> h = new HashSet<Integer>();
		// 10개의 데이터를 입력받아야하므로 아래 반복문 조건식을 줌
		for (int i = 0; i < 10; i++) {
			// 10번 반복하여 10개의 값을 입력받고 42로 나눈 나머지를 HashSet에 저장
			h.add(sc.nextInt() % 42);
		}

		sc.close();
		// 크기가 곧 서로 다른 나머지의 수가 된다. 중복된 값은 저장이 되지 않기때문
		System.out.println(h.size());
	}

	/*
	 * 위의 방법과 차이점은 BufferedReader로 입력받아 형변환 후 출력
	 */
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<Integer> h = new HashSet<Integer>();

		for (int i = 0; i < 10; i++) {
			h.add(Integer.parseInt(br.readLine()) % 42);

		}
		System.out.println(h.size());
	}
	
	/*
	 * 42로 나눴을 때 나머지의 범위는 0 ~ 41이다. 43의 나머지 범위는 0 ~ 42다. < 0 ~ N-1 > 
	 * 길이 42 boolean 배열을 만든다. 배열의 인덱스는 나머지 값이며 true로 바꾸어준다.
	 * 나머지값이 있는 index만이 true일테니 for-each문과 if문을 사용하여 true일 때만 카운트 한다.
	 * 카운트된 값을 출력한다.
	 */
	public static void arrayUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean[] arr = new boolean[42];
		int count = 0;
		for (int i = 0; i < 10; i++) {
			arr[Integer.parseInt(br.readLine()) % 42] = true;
		}

		for (boolean a : arr) {
			if (a) {
				count++;
			}
		}
		System.out.println(count);
	}
}
