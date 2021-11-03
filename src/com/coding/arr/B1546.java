package com.coding.arr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백준 1546번 평균문제
 */
public class B1546 {

	public static void main(String[] args) {
		scannerUse();
	}

	public static void scannerUse() {

		Scanner sc = new Scanner(System.in);

		double[] arr = new double[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		double sum = 0;
		// 오름차순으로 정렬
		Arrays.sort(arr);

		// 점수 조작하여 총점수를 구함
		for (int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length - 1]) * 100);
		}
		// 구한 총 점수 / 과목 수
		System.out.println(sum / arr.length);
	}

	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		double[] arr = new double[Integer.parseInt(br.readLine())];

		// 점수를 일렬로 입력받기 때문에 for문 밖에서 다 입력 후 for문으로 return 값을 배열에 저장
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Double.parseDouble(st.nextToken());
		}

		double sum = 0;
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length - 1]) * 100);
		}
		System.out.println(sum / arr.length);
	}
}
