package practice03;

public class Solution {

	public int solution(int n) {
		int answer = 0;
		
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				answer += i;
				System.out.println(i);
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(12));
	}
}
