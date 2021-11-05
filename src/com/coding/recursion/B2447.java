package com.coding.recursion;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * 백준 2447  별 찍기 10  문제
 * 2차배열, 1,1은 공백 즉 5번째 출력은 반드시 공백이다.
 * count를 세서 5번째 빼고 다 재귀호출 해버려!
 * 그리고 각 인덱스에 별이 담겨져있다라고 생각하면된다.
 */
public class B2447 {
	static char[][] arr;
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int N = Integer.parseInt(br.readLine());
		
		arr = new char[N][N];
        
		star(0, 0, N, false);
		/*
		   BufferedWriter 의 write 메소드는 배열도 순서대로 출력해주기 때문에
		   2차원 배열의 경우 한 행씩 write 해주면
		   자체에서 해당 행의 열들을 순서대로 담아준다.
		*/
		for (int i = 0; i < N; i++) {
			bw.write(arr[i]);
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
 
	static void star(int x, int y, int N, boolean blank) {
 
		// 공백칸일 경우
		if (blank) {
			for (int i = x; i < x + N; i++) {
				for (int j = y; j < y + N; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
 
		// 더이상 쪼갤 수 없는 블록일 때
		if (N == 1) {
			arr[x][y] = '*';
			return;
		}
 
		/*
		   N=27 일 경우 한 블록의 사이즈는 9이고, 
		   N=9 일 경우 한 블록의 사이즈는 3이듯
		   해당 블록의 한 칸을 담을 변수를 의미 size
           
		   count는 별 출력 누적을 의미
		 */
 
		int size = N / 3;
		int count = 0;
		for (int i = x; i < x + N; i += size) {
			for (int j = y; j < y + N; j += size) {
				count++;
				if (count == 5) { // 공백 칸일 경우
					star(i, j, size, true);
				} else {
					star(i, j, size, false);
				}
			}
		}
	}
}
