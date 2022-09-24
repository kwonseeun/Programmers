package Test;

public class P_최대공약수와_최소공배수 {
	public int[] solution(int n, int m) {
		int[] answer = new int[2];
		int temp=1;
		int gcd = n*m;
		
		while (temp!=0) {
			temp = m%n;
			m = n;
			n = temp;
		}
		
		answer[0] = m;
		answer[1] = gcd/m;
		
		return answer;
	}
}
