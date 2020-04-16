package programers.practice06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Solution {

	public String solution(String s) {
		int[] temp = new int[s.length()];
		for(int i = 0; i < s.length(); i++) {
			temp[i] = (int) s.charAt(i);
		}
		Arrays.sort(temp);
		String answer = "";
		for(int i = s.length() - 1; i >= 0; i--) {
			answer = answer + (char)temp[i];
		}
		return answer;
	}
	
	public static void main(String [] args) {
		Solution sol = new Solution();
		String s = "Zbcdefg";
		String s2 = "AdHgDrtUiO";
		System.out.println(sol.solution(s));
		System.out.println(sol.solution(s2));
	}
}
