package practice16;

import java.util.List;

public class Solution {

	public String solution(int n) {
		String[] arr = {"1", "2", "4"};
		String answer = "";
		int k = 0;
		
		while(n != 0) {
			if(n%3 == 0) {
				answer =  "4" + answer;
				n = n / 3 -1 ;
			}
			else {
				answer = Integer.toString(n%3) + answer;
				n = n / 3;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		String answer = sol.solution(9);
		
		System.out.println(answer);
	}
}
