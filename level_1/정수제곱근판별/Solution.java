package practice09;

public class Solution {

	public long solution(long n) {
		
		if(Math.pow((int)Math.sqrt(n), 2) == n) {
			return (long) Math.pow((int)Math.sqrt(n) + 1, 2);
		}
		else {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(3));
	}
}
