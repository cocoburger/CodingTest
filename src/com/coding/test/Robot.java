package com.coding.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Robot {

	public static int N, M;
	public static int[][] map;
	public static int cnt;
	public static int dr[] = {-1,0,1,0}; //북, 동,남,서
	public static int dc[] = {0,1,0,-1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(bf.readLine());
	
		//크기를 입력할 수 있다
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		//입력받은 크기만큼 MAP 크기를 설정한다.
		map = new int[N][M];
		
		st = new StringTokenizer(bf.readLine());
		//북쪽으롭부터 떨어진 칸
		int r = Integer.parseInt(st.nextToken());
		//서쪽으로부터 떨어진 칸
		int c = Integer.parseInt(st.nextToken());
		//방향
		int d = Integer.parseInt(st.nextToken());
		
		
		for(int i =0; i<N; i++) {
			st = new StringTokenizer(bf.readLine());
			for(int j = 0; j < M; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		clean(r,c,d);
		
		bw.write(cnt + "\n");
		bf.close();
		bw.flush();
		bw.close();
		
		
	}
	
	public static void clean(int row, int col, int d) {
		
		if(map[row][col] == 0) {
			map[row][col] = 2;
			cnt++;
		}
	}
}
