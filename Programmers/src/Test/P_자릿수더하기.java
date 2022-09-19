package Test;

public class P_자릿수더하기 {
	
	public int solution(int n) {
		 int answer = 0;
	        String number = String.valueOf(n);
	        String[] digits = number.split("(?<=.)");

	        for(int i = 0; i < digits.length; i++) {
	            answer = answer+Integer.parseInt(digits[i]);
	        }
	        return answer;
	    }
}
