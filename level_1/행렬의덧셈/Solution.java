package practice13;

public class Solution {

	public int[][] solution(int[][] arr1, int[][] arr2){
		int[][] answer = new int[arr1.length][arr1[0].length];
		
		for(int i = 0; i < arr1.length; i++) { // За
			
			for(int j = 0; j < arr1[i].length; j++) {//ї­
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[][] arr1 = {{1,2}, {2,3}};
		int[][] arr2 = {{3,4}, {5,6}};
	}
}
