package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class P_나누어떨어지는_숫자배열 {
	public int[] solution(int[] arr, int divisor) {
        int[] answer = {0};
        
        ArrayList<Integer> list = new ArrayList<Integer>();

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % divisor == 0) {
                list.add(arr[i]);           // list에 추가
                count++;            // 나누어 떨어지는 element가 하나도 없을 경우를 대비해 count값 계산
            }
        }
        
     
        
        return answer;
    }
}
