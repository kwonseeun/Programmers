package Hash;

import java.util.HashMap;
import java.util.Map;

public class example02 {

/*
 * < 전화번호 목록 >  
 * 
전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다. 
전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

구조대 : 119
박준영 : 97 674 223
지영석 : 11 9552 4421
전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요. */
	public boolean solution(String[] phone_book) {
		 boolean answer = true;
	        Map<String, Integer> map = new HashMap<>();
	        for (int i = 0; i <phone_book.length; i++) {
	            map.put(phone_book[i], i);
	        }
	        for (int i = 0; i < phone_book.length; i++) {
	            for (int j = 1; j < phone_book[i].length(); j++) {
	                if(map.containsKey(phone_book[i].substring(0,j))) {
	                    answer = false;
	                }
	            }
	        }
	        return answer;
	}
	
}
/**
 * phone_book 배열에 있는 문자열을 hashMap key로 넣는다
 * map.containKey()를 이용해 순서대로 문자열을 하나씩 비교한다. 
 *각 번호를 앞에서부터 한자리씩 늘려가며 자른뒤 해당 번호에 전화번호가 map에 있는지 확인
 *이때 자기 자신을 비교하는 것을 제외하기 위해 문자열의 길이보다 1 작은 길이까지만 비교한다. */