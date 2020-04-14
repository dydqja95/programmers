package programers.practice03;

import java.util.*;

public class solution {

	public ArrayList <Integer> solution(int []arr) {
		ArrayList <Integer> temp = new ArrayList<>();
		int num;
		for(int i = 1; i < arr.length; i++) {
			
			if(arr[i-1] != arr[i]) {
				temp.add(arr[i-1]);
			}
			else {
				i++;
			}
		}
		return temp;
	}
	public static void main(String[] args) {
		int[] arr1 = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
			
		solution sol = new solution();
		System.out.println(sol.solution(arr1));
	}
}


