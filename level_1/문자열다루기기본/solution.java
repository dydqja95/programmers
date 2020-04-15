package programers.practice04;

public class solution {

	public boolean solution(String s) {
		if(s.length() == 4 || s.length() == 6) {
			try {
				Integer.parseInt(s);
				return true;
			}
			catch(Exception e) {
				return false;
			}
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		String s = "a234";
		String s2 = "1234";
		
		solution sol = new solution();
		System.out.println(sol.solution(s));
		System.out.println(sol.solution(s2));
	}
}
