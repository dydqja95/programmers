package practice20;

public class Solution {

	public int[] solution(int[] prices) {
		int index = 0;
		int[] answer = new int[prices.length];
		
		while(true) {
			int time = 0;
			for(int i = index; i< prices.length; i++) {
				int target = prices[index];
				time++;
				
				if(target > prices[i]) {
					break;
				}
			}
			if(index >= prices.length) {
				break;
			}
			else {
				answer[index] = time -1;
				index++;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] prices = {1, 2, 3, 2, 3};
		int[] answer = sol.solution(prices);
		
		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
