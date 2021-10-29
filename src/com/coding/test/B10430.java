package com.coding.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;


/*
 * 백분 10430문제 
 * 나머지
 */
public class B10430 {

	public static void main(String[] args) {

	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		sc.close();
		
		System.out.println((A+B)%C);
		System.out.println((A%C + B%C)%C);
		System.out.println((A*B) % C);
		System.out.println((A%C * B%C)%C);
	}
	
	/*
	 * BufferedReader + StringBuilder 방법
	 */
	public static void builderUse() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		StringBuilder sb = new StringBuilder();
		
		sb.append( (A%B)%C);
		sb.append('\n');
		
		sb.append((A%C + B%C) %C);
		sb.append('\n');
				
		sb.append((A*B)%C);
		sb.append('\n');
		
		sb.append((A%B * B%C) %C);
		
		
		System.out.println(sb);
	}
	/*
	 * BufferedReader  + BufferedWriter 방법
	 */
	public static void writerUse() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		bw.write((A%B)%C + "\n");
		bw.write((A%C + B%C) %C + "\n");
		bw.write((A*B)%C + "\n");
		bw.write((A%B * B%C) %C + "\n");
		
		bw.flush();
		bw.close();
	}
}
