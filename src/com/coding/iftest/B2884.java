package com.coding.iftest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/*
 * 백준 2884번 알람 시계 문제
 * 45분 일찍 알람을 맞추는 것 => 입력받은 값에서 45분을 마이너스해준다.
 */
public class B2884 {

	public static void main(String[] args) throws IOException {
		bufferedUse();
		scannerUse();
	}
	
	public static void scannerUse() {
		Scanner sc = new Scanner(System.in);
		
		//시간
		int a = sc.nextInt();
		//분
		int b = sc.nextInt();
		sc.close();
		//분보다 45가 더 크면 시간 1 감소
		if(b < 45) {
			a--;
			b = 60 - (45 - b);
			//시간이 0보다 작을 경우 23으로 수정해준다.
			//그 이유는 24시간 표현이기 때문이다.
			if(a < 0) {
				a = 23;
			}
			System.out.println(a + " " + b);
		//분이 45보다 크면 시간을 따로 계산하지 않고 입력받은 값에서 45분을 빼주면 된다.
		}else {
			System.out.println(a+ " "+ (b - 45));
		}
	}
	
	public static void bufferedUse() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int H = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		if(M < 45) {
			H--;
			M = (60 - 45) + M;
			if(H < 0) {
				H = 23;
			}
			System.out.println(H + " " + M);
		}else {
			System.out.println(H + " " + (M-45));
		}
	
	}
}
