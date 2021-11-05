package com.coding.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 백준 10870 피보나치 수 5 문제
 * F0 = 0, F1 = 1, Fn+2 = Fn+1+Fn
 */
public class B10870 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//System.out.println(fibonacci(N));
		cache();
	}
	
	public static int fibonacci(int N) {
		if(N == 0) return 0;
		if(N == 1) return 1;
		if(N == 2) return 1;
		
		//전전의값 + 전값 = N값
		//N-2 + N-1 = N 위의 식과 동일하다.
		return fibonacci(N - 1) + fibonacci(N - 2);
	}
	
	public static void cache() throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] cache = new int[N + 1];
		
		for(int i = 0; i<cache.length; i++) {
			if(i == 0) cache[0] = 0;
			else if(i == 1) cache[1] = 1;
			else if(i == 2) cache[2] = 1;
			else cache[i] = cache[i - 1] + cache[i - 2];
			
		}
		System.out.println(cache[N]);
	}

}
