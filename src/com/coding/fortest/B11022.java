package com.coding.fortest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
 * 백준 11022번 A+B -8 문제
 */
public class B11022 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		//bufferedUse();
		charAtUse();
	}
	
	public static void bufferedUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		//테스트 케이스의 개수 설정
		int a =Integer.parseInt( br.readLine());
		int b;
		int c;
		
		for(int i = 1; i<=a; i++) {
			// 두 정수를 입력받고 공백기준으로 나눈다.
			st = new StringTokenizer(br.readLine(), " ");
			//st에 담긴 데이터를 nextToken으로 한 개씩 return후 형변환해준다.
			b = Integer.parseInt( st.nextToken());
			c = Integer.parseInt( st.nextToken());
			//형변환된 데이터를 연산후 저장
			bw.write("Case #" + i + ": " + b + " + " + c + " = "+(b+c)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void charAtUse() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int a =Integer.parseInt( br.readLine());
		
		for(int i = 1; i<=a; i++) {
			String str = br.readLine();
			//String문자열을 int형으로 변환시키기 위해 '0'을 빼준다. 아스키코드값으로 출력되기 때문이다. 
			int B = str.charAt(0)-'0';
			int C = str.charAt(2) - '0';
			bw.write("Case #" + i + ": " + B + " + " + C + " = "+(B+C)+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
