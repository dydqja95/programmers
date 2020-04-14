package programers;

public class solution {

	boolean solution(String s) {
		int count_p = 0;
        int count_y = 0;
        
        for (int i = 0; i < s.length(); i++){
            if(s.substring(i,i+1).equalsIgnoreCase("p")){
                count_p += 1;
            }
            else if(s.substring(i,i+1).equalsIgnoreCase("y")){
                count_y += 1;
            }
            else{
                continue;
            }
        }
        if(count_p == count_y){
            return true;
        }
        else{
            return false;
        }
	}
	public static void main(String[] args) {
		String s  = "pPooooyY";
		String s2 = "Pyy";
	
		solution a = new solution();
		System.out.println(a.solution(s));
		System.out.println(a.solution(s2));
	}
}
