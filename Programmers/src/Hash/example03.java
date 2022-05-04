package Hash;

import java.util.HashMap;
import java.util.Iterator;

/*
 * < 위장 >  
 * 
 *스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.

/*clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
스파이가 가진 의상의 수는 1개 이상 30개 이하입니다.
같은 이름을 가진 의상은 존재하지 않습니다.
clothes의 모든 원소는 문자열로 이루어져 있습니다.
모든 문자열의 길이는 1 이상 20 이하인 자연수이고 알파벳 소문자 또는 '_' 로만 이루어져 있습니다.
스파이는 하루에 최소 한 개의 의상은 입습니다. */

public class example03 {
	 public int solution(String[][] clothes) {
	        int answer = 1;
	        HashMap<String, Integer> hm = new HashMap<>();
	        
	        for(int i=0; i< clothes.length; i++) {
	        	String cloth_type = clothes[i][1];
	        	hm.put(cloth_type,hm.getOrDefault(cloth_type, 1) + 1);
	        }
	        for (String key : hm.keySet()) {
				answer += hm.get(key);
			}
	        return answer;
	    }

}
