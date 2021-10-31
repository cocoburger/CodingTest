package com.coding.fortest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백준 10950 A+B 문제
 */
public class B10950 {

	public static void main(String[] args) throws IOException {
		bufferedUse();
		scannerUse();
	}

	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = 0;
		int c = 0;
		int[] d = new int[a];

		for (int i = 0; i < a; i++) {
			b = sc.nextInt();
			c = sc.nextInt();

			d[i] = b + c;
		}
		for (int l : d) {
			System.out.println(l);
		}
		sc.close();
	}

	public static void bufferedUse() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// StringTokenizer 타입의 st 변수 생성
		StringTokenizer st;
		// StringBuilder에 계산한 식을 넣어준 뒤 나중에 한 번에 출력
		StringBuilder sb = new StringBuilder();
		// 반복횟수 설정
		int a = Integer.parseInt(br.readLine());

		for (int i = 0; i < a; i++) {
			// 반복문을 사용하여 st 객체를 새로 생성
			// readLine은 한 줄씩 입력받을 수 있고 공백을 구분자로 파라미터 넣어줌.
			st = new StringTokenizer(br.readLine(), " ");
			// nextToken메서드를 사용하여 저장된 순서대로 값을 반환한다.
			// 반환된 값을 연산후 append메서드를 사용하여 sb에 저장한다.

			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			// 줄바꿈
			sb.append('\n');

		}
		// 저장된 값 출력
		System.out.println(sb);

	}

	public static void bufferWriterUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int a = Integer.parseInt(br.readLine());
		for (int i = 0; i < a; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()) + "\n");
		}

		bw.flush();
		bw.close();
	}
}
