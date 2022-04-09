package com.coding.quicksort;


/**
 * 
 * @author BurgurBum
 *
 *	1. 피벗을 하나 선택한다.
 *	2. 피벗을 기준으로 양쪽에서 피벗보다 큰 값, 혹은 작은 값을 찾는다.
 *	3. 왼쪽에서부터는 피벗보다 큰 값을 찾고, 오른쪽에서부터는 피벗보다 작은 값을 찾는다.
 *	4. 양 방향에서 찾은 두원소를 교환한다.
 *	5.엇갈린 기점을 기준으로 두 개의 부분리스트로 나누어 1번으로 돌아가 해당 부분리스트의
 *	길이가 1이 아닐 떄 까지 1번 과정을 반복한다. (Divide: 분할)
 *	6.인접한 부분리스트끼리 합친다.(Conqure : 정복)
 *
 *	피벗을 선택하는 과정은 여러 방법이 있는데, 대표적인 세 가지가 있다.
 *	1. 가장 왼쪽 원소가 피벗
 *	2. 가장 오른쪽 원소가 피벗
 *	3. 중간 원소가 피벗
 *
 */
public class QuickSort {

	public static void sort(int[] a) {
		l_pivot_sort(a, 0, a.length - 1);
	}
	
	
	/**
	 * 왼쪽 피벗 선택 방식
	 * @param a 정렬할 배열
	 * @param lo 현재 부분배열의 왼쪽
	 * @param hi 현재 부분배열의 오른쪽
	 */
	
	private static void l_pivot_sort(int[] a, int lo, int hi) {
		
		/*
		 * lo가 hi보다 크거나 같다면 정렬 할 원소가 1개 이하이므로
		 * 정렬하지 않고 return한다.
		 */
		if(lo >= hi) {
			return;
		}
		
		/*
		 * 피벗을 기준으로 요소들이 왼쪽과 오른쪽으로 약하게 정렬된 상태로
		 * 만들어 준 뒤. 최종적으로 pivot의 위치를 얻는다.
		 * 
		 * 그리고 나서 해당 비벗을 기준으로 왼쪽 부분리스트와 오른쪽 부분리스트로 나누어
		 * 분할정복을 해준다.
		 * 
		 * Partitioning :
		 * 
		 * 			a[left]					    left part			      right part
		 * +------------------------------------------------------------------------------+
		 * |  		pivot			|		element <= pivot	   |	element > pivot	  |
		 * +------------------------------------------------------------------------------+
		 * 
		 *	result After Partitioning :
		 *
		 *		  left part                       a[lo]          		  right part
		 * +------------------------------------------------------------------------------+
		 * |  		pivot			|		element <= pivot	   |	element > pivot	  |
		 * +------------------------------------------------------------------------------+
		 * 
		 * result : pivot = lo
		 * 
		 * Recursion:
		 * 
		 * l_pivot_sort(a, lo, pivot - 1) l_pivot_sort(a, pivot + 1, hi)
		 * 
		 * 		 *         left part                           right part
		 * +-----------------------+             +-----------------------+
		 * |   element <= pivot    |    pivot    |    element > pivot    |
		 * +-----------------------+             +-----------------------+
		 * lo                pivot - 1        pivot + 1                 hi
		 * 
		 * 
		 * 
		 */
		
		
		
	}
}
