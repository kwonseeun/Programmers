package kakao;

public class K_숫자문자열과_영단어 {
	
	String[] word = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
	
    public int solution(String s) {
	
		StringBuilder sb = new StringBuilder();
		
		for (int pos = 0; pos < s.length(); ) {
			if (s.charAt(pos) >= '0' && s.charAt(pos) <= '9') {
				sb.append(s.charAt(pos++));
			} else {
				for (int i = 0; i < 10; i++) {
					if (s.startsWith(word[i], pos)) {
						sb.append((char)('0' + i));
						pos+= word[i].length();
						break;
					}
				}
			}
		}
        int answer = Integer.parseInt(sb.toString());
        return answer;
    }
}
