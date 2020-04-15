package programers.practice03;

import java.util.*;

public class solution {

	public static int[] solution(int[] array) {
	       
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        for(int i = 0; i < array.length-1; i++) {
           if(array[i] != array[i+1]) {
              arrayList.add(array[i]);
           }
        }
        
        arrayList.add(array[array.length-1]);
        
        int[] answer = new int[arrayList.size()];   
        for(int i = 0; i < answer.length; i++) {
           answer[i] = arrayList.get(i);
        }        
        return answer;
     }
	public static void main(String[] args) {
		int[] arr1 = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
			
		solution sol = new solution();
		System.out.println(sol.solution(arr1));
		System.out.println(sol.solution(arr2));
	}
}