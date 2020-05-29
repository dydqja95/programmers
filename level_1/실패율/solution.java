package practice23;

import java.util.ArrayList;
import java.util.Collections;

public class solution {

	public int[] solution(int n, int[] stages) {
		ArrayList<Double> stageCount = new ArrayList<Double>();
		int userNumber = stages.length;
		
		for(int i = 1; i <= n; i++) {
			
			int count = 0;
			if(userNumber == 0) {
				stageCount.add(0.0);
			}
			else {
				for(int j = 0; j < stages.length; j++) {
					if(stages[j] == i) {
						count++;
					}
				}
				stageCount.add((double)count/userNumber);
				userNumber -= count;
			}
		}

		
		int[] answer = new int[n];

		for(int i = 0; i<n; i++) {
			double max = Collections.max(stageCount);

			int temp = stageCount.indexOf(max);

			temp = temp + 1;

			answer[i] = temp;

			stageCount.set(answer[i] - 1, -1.0);
		}
	return answer;
	}
	
	public static void main(String[] args) {
		solution solution = new solution();
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		
		int[] answer = solution.solution(5, stages);
		
		for(int i = 0; i<answer.length; i++) {
			System.out.print(answer[i] + " ");
		}
	}
}
