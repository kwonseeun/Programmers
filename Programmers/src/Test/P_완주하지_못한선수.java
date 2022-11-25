package Test;

public class P_완주하지_못한선수 {
	public static void main(String[] args) {
		String[]  participant= {"marina", "josipa", "nikola", "vinko", "filipa"}; 
		String[]  completion= {"josipa", "filipa","marina", "nikola"}; 
		// ㅇㅖ시 값입니다. 예시값을 추가 해주세요.
		Solution aa = new Solution();	// Class 선언
		System.out.println(aa.solution(participant, completion));	// 메소드 Return 값 출력
	}
	
}

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Arrays.sort(participant);	// 배열 정렬 	a~z
        Arrays.sort(completion);	// 배열 정렬		a~z
        int i;
        for(i = 0; i<participant.length-1; i++) {
        	if(!participant[i].equals(completion[i])) {
        		answer = participant[i];	// 순서대로 비교 후 없는 이름이 있을 경우 저장 후 Return
            	return answer;
        	}
        }
    	if(i == participant.length-1) {
    		answer = participant[i];	// 마지막 까지 일치하는 이름이 없었을 경우 마지막 사람이 완주 명단에 없는 사람.
    	}
    	return answer;
    }
}
