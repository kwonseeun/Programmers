package Test;

public class P_약수의합 {
	public int solution(int n) {
		int sum = 0;
		
		for (int i = 0; i < n; i++) {
			if (n % i == 0) {
				sum+= i;
			}
		}
		return sum;
	}
}
