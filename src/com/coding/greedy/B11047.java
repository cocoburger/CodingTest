package com.coding.greedy;

import java.util.Scanner;

public class B11047 {
 
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		int[] coin = new int[N];
		
		for(int i = 0; i<N; i++) {
			coin[i] = sc.nextInt();
		}
		
		int count = 0;
		
		for(int i = N -1; i>=0; i--) {
			
			//현재 동전의 가치가 K보다 작거나 같아야지 구성가능
			if(coin[i] <= K) {
				count += (K / coin[i]);
				K = K % coin[i];
			}
		}
		System.out.println(count);
	}
}
