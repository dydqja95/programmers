package practice11;

public class Solution {

	public int solution(int num) {
		int count = 0;
		long number = num;
		while(number != 1) {
			if(count > 500) {
				return -1;
			}
			if(number % 2 == 0) {
				number = (number / 2);
				System.out.println(number);
				count++;
				
			}
			else {
				number = ((number*3) + 1);
				System.out.println(number);
				count++;
				
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		System.out.println(sol.solution(626331));
	}
}
