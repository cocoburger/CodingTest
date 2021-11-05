package com.coding.string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


/*
  * 백준 10890 알파벳 찾기 문제
  */
public class B10809 {

	public static void main(String[] args) throws IOException {
		//scannerUse();
		indexOf();
	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[26];
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = -1;
		}
		String s = sc.nextLine();
		sc.close();
		for(int i=0; i<s.length(); i++) {
			
			char ch = s.charAt(i);
			
			
			//아스키 코드 값으로 비교 가능
			//a는 97과 대응 ch에 b가 담겨있다면 arr[98 - 97] == -1 이런 식이다.
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
				
			}
		}
		
		for(int val : arr) {
			System.out.println(val +  " ");
		}
	}
	
	
	public static void indexOf() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		//반복문을 통해 'a'부터 'z'까지 반복하며 
		//indexOf메서드로 str에 'a' - 'z'까지의 문자가 있는지 확인하고 있다면 몇 번째 인덱스인지 반환
		//없으면 -1을 반환한다. 그 후에 공백을 추가
		for(char c = 'a'; c<='z'; c++) {
			bw.write(str.indexOf(c) + " ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
	
	public static void bufferedUse() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str = br.readLine();
		//알파벳은 26개까지 있으니깐~
		int[] arr = new int[26];
		//일단 -1로 싹 초기화 해주고 있는 것들만 위치 값으로 바꿔준다잉~
		for(int i=0; i<arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i = 0; i<str.length(); i++) {
			//입력받은 값의 한 글자씩 ch에 저장을 하고
			char ch = str.charAt(i);
			
			//ch에 저장된 한글자씩 비교한다. 당연히 입력받지 않은 값들은 제외된다. 즉 -1
			//baekjoon으로 입력받았으면 첫번째 반복에는 ch에 b가 저장이 되어있을테고
			//b-a는 arr[1]이다. -1로 모두 초기화를 해주었기 때문에 조건문 true이고 
			//ch-'a' 인덱스 즉 arr[1]에 i를 저장한다. 0부터 시작이니 arr[1]에는 0이 저장
			//두번째 반복문에는 a - a는 0이므로 arr[0] == -1  
			//arr[0]에 1이저장된다. 왜? i증감했기때문에
			if(arr[ch - 'a'] == -1) {
				arr[ch - 'a'] = i;
			}
		}
		for(int val : arr) {
			bw.write(val+ " ");
		}
		br.close();
		bw.flush();
		bw.close();
	}
}
