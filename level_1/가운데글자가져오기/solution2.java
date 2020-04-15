package programers;

public class solution2 {
	public String solution2(String s) {
		if(s.length() % 2 == 0) { //길이가 짝수인 경우
			return s.substring(s.length() / 2 - 1, s.length() / 2 +1);
		}
		else { // 길이가 홀수인 경우
			return s.substring((int) Math.floor(s.length() / 2), (int) Math.floor(s.length() / 2) + 1);
		}
	}
	
	
	public static void main(String[] args) {
		String s  = "abcde";
		String s2 = "qwer";
		
		solution2 sol = new solution2();
		System.out.println(sol.solution2(s));
		System.out.println(sol.solution2(s2));
	}
}
