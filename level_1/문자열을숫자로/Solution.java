
package practice04;

public class Solution {

	public int solution(String s) {
		

		if(s.charAt(0) == '-') {
			return -1 * Integer.parseInt(s.substring(1));
		}
		else if(s.charAt(0) == '+') {
			return Integer.parseInt(s.substring(1));
		}
		else {
			return Integer.parseInt(s);
		}
	}
}
