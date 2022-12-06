package Test;

public class P_약수의합2 {
	 public int solution(int n) {
	        int answer = 0;
	        for(int i = 1; i <= Math.sqrt(n); i++){
	            if(n % i == 0){
	                answer = answer + i;
	                int check = n/i;
	                if( i != check){
	                    answer = answer + check;
	                }
	            }
	        }
	        return answer;
	    }
}
