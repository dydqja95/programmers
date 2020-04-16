package practice07;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

	public String[] solution(String[] strings, int n) {
        String[] answer = {};
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 0; i < strings.length; i++) {
            arr.add("" + strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(arr);
        answer = new String[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }
        return answer;
    }
	
	public static void main(String[] arg) {
		Solution sol = new Solution();
		String[] strings = {"abce", "abcd", "cdx"};
		
		String[] temp = sol.solution(strings, 2);
		
		for(int i = 0; i < strings.length; i++) {
			System.out.println(temp[i]);
		}
	}
}
