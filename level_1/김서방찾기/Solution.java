package practice02;

public class Solution {

	public String solution(String[] s) {
		String answer = "";
		for(int i = 0; i < s.length; i++) {
			if(s[i].equals("Kim")) {
				answer = "김서방은 " + i + "에 있다";
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] s = {"seoul", "Kim"};
		
		String answer = sol.solution(s);
		System.out.println(answer);
	}
}
