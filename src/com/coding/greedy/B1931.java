package com.coding.greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class B1931 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		/**
		 * time[][0] 시작시점
		 * time[][1] 종료시점
		 */
		int[][] time = new int[n][2];
		
		for(int i = 0; i< n; i++) {
			time[i][0] = sc.nextInt();
			time[0][i] = sc.nextInt();
		}
		
		Arrays.sort(time, new Comparator<int[]>() {
			
		
		
		@Override
		public int compare(int[] o1, int[] o2) {
				if(o1[1] == o2[1]) {
					return o1[0] - o2[0];
				}
				
				return	o1[1] - o2[1]; 
		}
		
		});
		
	}
}
