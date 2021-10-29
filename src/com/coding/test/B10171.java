package com.coding.test;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class B10171 {
	/*
	 * 백슬래시와 큰 따옴표는 단독으로 출력할 수 없다.
	 * Escape Sequance 조합으로 쓰여야한다.
	 * 백슬래시(\) + 문자의 조합
	 */
	public static void main(String[] args) throws IOException {
		
		
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.println(" \\(__)|");
		
		
		/*
		 * BufferedWriter를 활용하여 출력
		 */
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("\\\\   /\\");
		bw.newLine(); //줄 구분자
		
		bw.write(" )  ( ')");
		bw.newLine();
		
		bw.write("(  /  )");
		bw.newLine();
		
		bw.write(" \\\\(__)|");
		bw.newLine();
		
		bw.flush();
		bw.close();
	}
}
