package practice17;

import java.util.ArrayList;
public class Solution {

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int time = 0;
		ArrayList<Integer> inTime = new ArrayList<>();
		int index1 = 0; // 들어가는 인덱스
		int index2 = 0; // 삭제하는 인덱스
		int weightSum = 0;;
		System.out.println("time : " + time);
		while(true) { // 시간의 흐름
			time++;
			System.out.println("time : " + time);
			if(weight >= weightSum + truck_weights[index1]) { // 다리 무게보다 트럭 무게가 적으면
				inTime.add(time);        // 들어간 시간을 측정
				weightSum += truck_weights[index1]; // 현재 트럭무게에 합한다
				index1++;                           // 다음 트럭이 들어가도록 인덱스 설정
				System.out.println("truck_weights : " + truck_weights[index1 - 1]);
				
				if(index1 >= truck_weights.length - 1) {
					index1 = truck_weights.length - 1;
				}
			}
			System.out.println("weightSum : " + weightSum);
			if(time - inTime.get(index2) == bridge_length -1) { // 현재시간에서 가장 먼저 들어간 트럭의 시간 확인
				weightSum -= truck_weights[index2];  // 다리 길이만큼 지나면 버스를 제거
				if(index2 == truck_weights.length-1) {
					break;
				}
				
				index2++;
			}
			
		}
		time ++; // 시간 차이로 인한 1초 추가
		System.out.println(time);
		return time;
	}
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		
		int length = 100;
		int weight = 100;
		int[] truck = {10,10,10,10,10,10,10,10,10,10};
		
		sol.solution(length, weight, truck);
	}
}
