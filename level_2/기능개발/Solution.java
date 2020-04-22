package practice19;

import java.util.ArrayList;
import java.util.Arrays;
public class Solution {

	public int[] solution(int[] progresses, int[] speeds) {
		int index = 0;
		int count = 0;
		int time  = 0;
		ArrayList<Integer> temp = new ArrayList<>();
		
		while(true) {
			time++; // 1일씩 증가
			count = 0; // 매번 돌때마다 0으로 초기화

			for(int i = index; i < progresses.length; i++) { // index부터 마지막 배열까지                             
				progresses[i] = progresses[i] + speeds[i];   // 진행상황 + 진행속도
				
				if(progresses[index] >= 100) {                   // 더했을때 진행상황이 100을 넘으면
					count++;     
					index++;
				}
			}

			if(count != 0) {                                // 100 넘은 횟수가 있다면 count를 저장
				temp.add(count);
			}
			
			if(index == progresses.length) {               // index가 progresses의 길이가 되면 정지
				break;
			}	
		}
		int[] answer = new int[temp.size()];               // ArrayList를 배열로 변경
		for(int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}
		return answer;                                     // 배열 리턴
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] progresses = {40, 93, 30, 55, 60, 65};
		int[] speeds = {60, 1, 30, 5 , 10, 7};
		int[] answer = sol.solution(progresses, speeds);
		
		for(int i = 0; i<answer.length; i++) {
			System.out.println(answer[i]);
		}
	}
}
