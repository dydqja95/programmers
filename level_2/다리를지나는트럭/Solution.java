package practice17;

import java.util.ArrayList;
public class Solution {

	public int solution(int bridge_length, int weight, int[] truck_weights) {
		
		int time = 0;
		ArrayList<Integer> inTime = new ArrayList<>();
		int index1 = 0; // ���� �ε���
		int index2 = 0; // �����ϴ� �ε���
		int weightSum = 0;;
		System.out.println("time : " + time);
		while(true) { // �ð��� �帧
			time++;
			System.out.println("time : " + time);
			if(weight >= weightSum + truck_weights[index1]) { // �ٸ� ���Ժ��� Ʈ�� ���԰� ������
				inTime.add(time);        // �� �ð��� ����
				weightSum += truck_weights[index1]; // ���� Ʈ�����Կ� ���Ѵ�
				index1++;                           // ���� Ʈ���� ������ �ε��� ����
				System.out.println("truck_weights : " + truck_weights[index1 - 1]);
				
				if(index1 >= truck_weights.length - 1) {
					index1 = truck_weights.length - 1;
				}
			}
			System.out.println("weightSum : " + weightSum);
			if(time - inTime.get(index2) == bridge_length -1) { // ����ð����� ���� ���� �� Ʈ���� �ð� Ȯ��
				weightSum -= truck_weights[index2];  // �ٸ� ���̸�ŭ ������ ������ ����
				if(index2 == truck_weights.length-1) {
					break;
				}
				
				index2++;
			}
			
		}
		time ++; // �ð� ���̷� ���� 1�� �߰�
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
