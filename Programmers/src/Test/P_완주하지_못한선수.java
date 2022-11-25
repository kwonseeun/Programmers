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


}
