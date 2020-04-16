package practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

	public int[] solution(int[] arr) {
		
		// arr의 길이가 1이라면 [-1] 반환
		if(arr.length == 1) {
			int[] temp = {-1};
			return temp;
		}
		// 그 외의 경우
		List<Integer> list = new ArrayList<Integer>();
		
		// 최소값을 구함
		int[] temp = new int[arr.length];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		Arrays.sort(temp);
		int min = temp[0]; 
		
		for(int i = 0; i < arr.length; i++) { //
			if(arr[i] != min) {
				list.add(arr[i]);
			}
			else {
				continue;
			}
		}
		System.out.println("arr의 길이는 " + arr.length);
		
		int[] answer = new int[list.size()];
		for(int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}
		System.out.println("list의 길이는 " + list.size());
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr  = {4, 3, 2, 1};
		int[] arr2 = {10};
		
		Solution sol = new Solution();
		int[] answer1 = sol.solution(arr);
		int[] answer2 = sol.solution(arr2);
		
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.println(answer1[i]);
		}
		
	}
}
