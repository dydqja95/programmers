package practice12;

public class Solution {

	public boolean solution(int x) {
		// ���ڸ� ���ڿ��� ��ȯ
		String temp = "" + x;
		int sum = 0;
		
		// �� �ڸ����� ���ڸ� ���ڷ� ��ȯ�� ���Ѵ�.
		for(int i = 0; i < temp.length(); i++) {
			sum += Character.getNumericValue(temp.charAt(i));
		}	
		
		// �ϻ��� ���� �Ǻ��Ѵ�.
		if(x % sum == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(10));
	}
}
