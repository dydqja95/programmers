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
			time++; // 1�Ͼ� ����
			count = 0; // �Ź� �������� 0���� �ʱ�ȭ

			for(int i = index; i < progresses.length; i++) { // index���� ������ �迭����                             
				progresses[i] = progresses[i] + speeds[i];   // �����Ȳ + ����ӵ�
				
				if(progresses[index] >= 100) {                   // �������� �����Ȳ�� 100�� ������
					count++;     
					index++;
				}
			}

			if(count != 0) {                                // 100 ���� Ƚ���� �ִٸ� count�� ����
				temp.add(count);
			}
			
			if(index == progresses.length) {               // index�� progresses�� ���̰� �Ǹ� ����
				break;
			}	
		}
		int[] answer = new int[temp.size()];               // ArrayList�� �迭�� ����
		for(int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}
		return answer;                                     // �迭 ����
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
