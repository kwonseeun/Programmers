package Test;

public class P_자연수뒤집어_배열로만들기 {
	 public int[] solution(long n) {
	        String s = String.valueOf(n);
	        int[] answer = new int[s.length()];
	        
	        for(int i=0; i<s.length(); i++) {
	            int value = Integer.parseInt(s.substring(s.length()-i-1, s.length()-i));
	            answer[i] = value;
	        }
	        return answer;
	    }
}
