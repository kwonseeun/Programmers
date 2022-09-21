package Test;

public class P_자릿수더하기2 {
	public int solution (int n) {
		int answer = 0;
		String[] arr = String.valueOf(n).split("");
		
		for (String s : arr) {
			answer += Integer.parseInt(s);
		}
		return answer;
	}
}
