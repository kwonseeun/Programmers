package Test;

public class P_자릿수더하기 {
	
	public int solution(int n) {
		int answer = 0;
		String temp ="";
		temp += n;
		
		for (int i = 0; i < temp.length(); i++) {
			answer += Integer.parseInt(temp.substring(i, i+1));
		}
		return answer;
	}

}
