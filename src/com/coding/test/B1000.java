package com.coding.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class B1000 {

	public static void main(String[] agrs) throws IOException {
		splitUse();
		tokenUse();
		scannerUse();
	}
	/*
	 * BufferedReader로 입력을 받고 구분자로는 split을 사용한 방법이다.
	 * split 파라미터에 구분자를 넣어주면 구분자 단위로 나눠주며 배열 형태로 저장해야한다.
	 * 그러므로 String[] 으로 변수 설정 및 int형으로 변환시에도 str[i] 형태로 파라미터 값을 넣어준다.
	 */
	public static void splitUse() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String[] str;
		try {
			str = bf.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			System.out.println(a + b);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	/*
	 * BufferedReader(readLine())를 사용하여 입력값을 받고
	 * StringTokenizer를 사용해 공백을 구분한 방법이다.
	 * StringTokenizer 객체 생성시 입력받은 문자열과, 구분자를 파라미터값으로 받는다.
	 * nextToken()을 사용해 담겨진 데이터를 담긴 순서대로 반환되며 해당 객체는 사라진다. 
	 * 반환받은 객체는 Integer.parseInt로 int형으로 변환시켜 연산시킨다. 
	 */
	public static void tokenUse() {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		String str;
		try {
			str = bf.readLine();
			// 객체 생성시 파라미터값으로 "문자열", 구분자
			StringTokenizer st = new StringTokenizer(str, " ");
			// 구분된 변수를 꺼낼 때는 차례대로 nextToken();을 해주면 문자열을 반환해준다.
			// 이 때 반환시킨 문자열을 반환됨과 동시에 해당 객체에서 사리지게 된다.
			// 그 후 Integer.parseInt()로 int형으로 변환시켜준다.
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());

			System.out.println(a + b);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/*
	 * Scanner를 사용한 방법이다.
	 * Scanner를 사용하여 int형으로 입력값을 입력받은 후 연산해준다. 
	 */
	public static void scannerUse() {
		
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		System.out.println(a + b);
		
		sc.close();
	}
}
