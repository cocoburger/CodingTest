package com.coding.recursion;

import java.util.Scanner;

/*
 * 백준 10872 팩토리얼 문제
 * 재귀호출이 반복적으로 되어 재귀가 깊어지면 Stack OverFlow 에러 발생.
 * 함수를 반복적으로 호출하는 만ㄴ큼 메모리에 스택되기 때문에 결국 메모리 사용량 증가한다.
 * 또한 재귀함수가 끝날 때는 함수를 닫으면서 스택된 메모리에서 pop을 하기 때문에 수행시간 또한
 * 매우 느려진다. 요약하자면 메모리 부족, 성능 저하로 인하여 
 * 알고리즘 자체가 재귀가 자연스럽거나 호출을 많이 하지 않는 범위 일 때 쓰이고 그 외에는
 * 자주 사용되질 않는다.
 * 재귀 함수가 끝나는 지점을 정확하게 구현해야 한다. 
 */
public class B10872 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		sc.close();
		
		int sum = scannerUse(N);
		System.out.println(sum);

	}

	public static int scannerUse(int N) {
		
		if (N <= 1)
			return 1;
		return N * scannerUse(N - 1);
		
		
		/*
		 * return N * factorial(N - 1);
 
			6 * factorial(5){
				5 * factorial(4){
					4 * factorial(3){
						3 * factorial(2){
							2 * factorial(1){
								return 1;
							}
							return 2 * 1;
						}
						return 3 * 2 * 1;
					}
					return 4 * 3 * 2 * 1;
				}
				return 5 * 4 * 3 * 2 * 1;			
			}
			return 6 * 5 * 4 * 3 * 2 * 1;
		* 
		*/
	}
	
	public static void noRecursion() {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		sc.close();
		
		int sum = 1;
		
		//N이 0이 아닐 때 까지 1씩 감속하면서 sum에 반복적으로 곱해준다.
		/*
		 * N = 3, sum = 1 이면 
		 * 
		 * 1 = 1 * 3
		 * 3 = 3 * 2
		 * 6 = 6 * 1
		 * 0이되면 모든 수가 0이되므로 1까지만 곱해준다.
		 */
		while(N != 0 ){
			sum = sum * N;
			N--;
		}
		System.out.println(sum);
	}

	
}
