package practice10;

public class Solution {

	public int[] solution(long n) {
		// n을 문자로 변환
		String temp = String.valueOf(n);
		// 배열 생성
		int[] arr = new int[temp.length()];
		
		// 배열에 문자를 숫자로 넣음
		for(int i = 0; i < temp.length(); i++) {
			arr[i] = Character.getNumericValue(temp.charAt(i));
		}
		// 배열 생성
		int[] answer = new int[temp.length()];
		int k = 0;
		
		// 배열을 거꾸로 다시 저장
		for(int i = arr.length; i > 0; i--) {
			System.out.println(arr[i-1]);
			answer[k] = arr[i-1];
			k++;
		}
		return answer;
	}

	public static void main(String[] args	) {
		Solution sol = new Solution();
		System.out.println(sol.solution(12345));
	}
}
