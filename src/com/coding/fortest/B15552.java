package com.coding.fortest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 백준 15552 빠른 A + B 문제
 */
public class B15552 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		//StringBuffer str = new StringBuffer();
		//StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			//공백을 찾아서 앞 뒤 값을 찾아서 연산 후 출력해준다.
			String s =  br.readLine();
			int target = s.indexOf(" ");
			int result = Integer.parseInt(s.substring(0,target)) + Integer.parseInt(s.substring(target + 1));		
			bw.write(result+"\n");
		}
		br.close();
		bw.flush();
		bw.close();
	}

}
