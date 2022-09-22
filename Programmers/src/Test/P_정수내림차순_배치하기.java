package Test;

import java.util.Arrays;
import java.util.Collections;

public class P_정수내림차순_배치하기 {
	public long solution(long n) {
		Integer[] List = new Integer[(int) (Math.log10(n) + 1)];
		int cnt = 0;
		long result = 0;
		
		while (n > 0) {
			List[cnt] = (int) (n % 10);
			n /= 10;
			cnt++;
		}
		Arrays.sort(List,Collections.reverseOrder());
		for (int i = 0; i < List.length; i++) {
			result += List[i];
			result += 10;
		}
		return result/10;
	}
}
