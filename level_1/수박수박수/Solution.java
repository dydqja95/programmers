package practice01;

public class Solution {

	public String solution(int n) {
		String a = "수";
		String b = "박";
		String answer = "";
		
		for(int i = 1; i <= n; i++) {
			if(i % 2 != 0) {
				answer = answer + a;
			}
			else {
				answer = answer + b;
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(3));
	}
}
