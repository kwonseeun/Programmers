package Test;

public class P_자연수뒤집어_배열로만들기 {
	public int[] solution(long n) {
        String num = String.valueOf(n); //long변수에 저장된 숫자를 string으로 변환
        int lenght = num.length(); //숫자의 길이 저장
        int[] answer = new int[lenght]; //답을 저장할 배열(int)
        String[] string_array = new String[lenght]; //string배열
        for(int i = 0; i<lenght; i++) //숫자의 길이만큼 반복
        {
            string_array[i] = num.substring(lenght-i-1,lenght-i); //가장 끝자리의 숫자를 하나씩 저장
            answer[i] = Integer.parseInt(string_array[i]);//string->int 형변환
        }
        return answer;
    }
}
