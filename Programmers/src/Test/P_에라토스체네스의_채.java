package Test;

public class P_에라토스체네스의_채 {
	public int solution(int n) {
	      int answer = 1;
	      int count =0;//소수판별 변수
	     
	      for(int i=3; i<=n;i++){//3부터 n까지
	         for(int j=2; j<i; j++){
	              if(i%j==0)
	                  count++;
	            }
	          if(count==0)
	                answer++;
	          count=0;
	      }
	           return answer;
	  }
}
