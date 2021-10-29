package com.coding.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

/*
 * 개(Dog)를 출력해보자
 */
public class B10172 {

	
	public static void main(String[] args) throws IOException {
		
		//System 클래스
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\\\__|");
		
		System.out.println();
		
		//BufferedWriter
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("|\\_/|");
		bw.newLine();
		
		bw.write("|q p|   /}");
		bw.newLine();
		
		bw.write("( 0 )\"\"\"\\");
		bw.newLine();
		
		bw.write("|\"^\"`    |");
		bw.newLine();
		
		bw.write("||_/=\\\\__|");
		bw.newLine();
		
		bw.flush();
		bw.close();
		
		
		//StringBuilder
		
		StringBuilder sb = new StringBuilder();
		
		sb.append("|\\_/|\n");
		sb.append("|q p|	/}\n");
		sb.append("( 0 )\"\"\"\\\n");
		sb.append("|\"^\"`    |\n");
		sb.append("||_/=\\\\__|");
		
		System.out.println(sb);
		
		
		
		
	}
}
