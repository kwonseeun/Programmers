package Test;

public class P_숫자의표현 {
	public int solution(int n) {
        int answer = 0;
        
        for (int i = 0; i < n; i++) {
        	int temp = 0;
            //1부터 하나씩 더한다.
        	for (int j = i+1; j <= n; j++) {
        		temp += j;
                //결과값이 n과 같을때
        		if(temp == n) {
        			answer++;
        			temp = 0;
        			break;
                 //결과값이 n보다 클때
        		}else if(temp > n) {
        			break;
        		}
    		}
		}
        
        return answer;
    }
}
