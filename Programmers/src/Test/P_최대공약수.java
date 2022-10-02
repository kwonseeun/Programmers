package Test;

public class P_최대공약수 {
	public int[] solution(int n, int m) {
        int[] answer = {n, m};
        int i;
        
        // n과 m 중 n이 큰지 m이 큰지에 따라 for문의 조건이 달라지기 때문에 나눠줌
        if (n > m) {
        answer[1] = answer[0] * (n / answer[0]) * (m / answer[0]);	
        
        return answer;
    }
}
