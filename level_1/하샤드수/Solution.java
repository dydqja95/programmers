package practice12;

public class Solution {

	public boolean solution(int x) {
		// 숫자를 문자열로 변환
		String temp = "" + x;
		int sum = 0;
		
		// 각 자리수의 문자를 숫자로 변환해 더한다.
		for(int i = 0; i < temp.length(); i++) {
			sum += Character.getNumericValue(temp.charAt(i));
		}	
		
		// 하샤드 수를 판별한다.
		if(x % sum == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(10));
	}
}
