package practice15;

public class Solution {

	public String[] solution(int n, int[] arr1, int[] arr2) {
		
		String[] arr1Map = new String[n];
		String[] arr2Map = new String[n];
		
		// arr1 해독
		for(int i = 0; i < arr1.length; i++) {
			String tempString = "";
			int tempInt = arr1[i];
			while(tempInt != 0) {
				tempString =  tempInt % 2 + tempString;
				tempInt = tempInt / 2;
				
			}
			if(tempString.length() != n) {
				while(tempString.length() != n) {
					tempString = '0' + tempString;
				}
			}
			arr1Map[i] = tempString;
//			System.out.print(arr1Map[i] + " ");
		}
//		System.out.println();
		
		// arr2 해독
		for(int i = 0; i < arr2.length; i++) {
			String tempString = "";
			int tempInt = arr2[i];
			while(tempInt != 0) {
				tempString = tempInt % 2 + tempString;
				tempInt = tempInt / 2;
			}
			if(tempString.length() != n) {
				while(tempString.length() != n) {
					tempString = '0' + tempString;
				}
			}
			arr2Map[i] = tempString;
//			System.out.print(arr2Map[i] + " ");
		}
//		System.out.println();
		
		// 지도 해독
		String[] Map = new String[n];
		for(int i = 0; i < n; i++) {
			String tempString = "";
			for(int j = 0; j < n; j++) {
				if(arr1Map[i].charAt(j) == '1' || arr2Map[i].charAt(j) == '1') {
					tempString = tempString + "#";
				}
				else {
					tempString = tempString + " ";
				}
			}
			Map[i] = tempString;
		}
		return Map;
	}
	public static void main(String[] args) {
		
		int[] arr1 = {9, 20, 28, 18, 11};
		int[] arr2 = {30, 1, 21, 17, 28};
		int n = 5;
		
		Solution sol = new Solution();
		for(int i = 0; i < n; i++) {
			System.out.println(sol.solution(n, arr1, arr2)[i]);
		}
	}
}
