package Test;

public class P_체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
        /** List를 이용해서 푸는 그리디 문제
         *  student[n+2] 배열을 만들고, 여분이 있으면 1을 index에 저장하고
         *  여분이 없으면 0, 도난 당했으면 -1 을 저장한다.
         *  배열을 돌면서, 여분을 체크하면서 1을 증가 혹은 감소 시키면서 답을 구하면 된다.
         *  [n+2] 로 두는 이유는 1~5번 학생이면, 0과 6 인덱스를 추가로 증가시키면, 0,6은 신경쓰지 않을 수 있어서 코드가 깔끔해진다.
         */


        // 1. student 배열 생성
        int[] student = new int[n + 2];
        int answer = 0;


        // 2. reserve / lost 정보 입력
        for (int l : lost)
            student[l]--;
        for (int r : reserve)
            student[r]++;


        return answer;
    }

}
