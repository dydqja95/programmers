package practice14;

import java.util.Arrays;
public class Solution {
	
	public int solution(int[] d, int budget) {
		
		Arrays.sort(d);
		int sum = 0;
		int count = 0;
		
		for(int i = 0; i<d.length; i++) {
			sum += d[i];
			count++;
			if (sum > budget) {
				return count-1;
			}
		}
		return count;
		
	}
}
