package practice10;

public class Solution {

	public int[] solution(long n) {
		// n�� ���ڷ� ��ȯ
		String temp = String.valueOf(n);
		// �迭 ����
		int[] arr = new int[temp.length()];
		
		// �迭�� ���ڸ� ���ڷ� ����
		for(int i = 0; i < temp.length(); i++) {
			arr[i] = Character.getNumericValue(temp.charAt(i));
		}
		// �迭 ����
		int[] answer = new int[temp.length()];
		int k = 0;
		
		// �迭�� �Ųٷ� �ٽ� ����
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
