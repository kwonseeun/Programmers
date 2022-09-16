package kakao;

public class K_숫자문자열과_영단어2 {
	public int solution(String s) {
		
		String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		
		for (int i = 0; i < 10; i++) {
			s = s.replace(word[i], Integer.toString(i));
		}
		
		int answer = Integer.parseInt(s);
		
		return answer;
	}
}
