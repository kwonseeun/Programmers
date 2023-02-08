package Test;

import java.util.*;
import java.util.Map.*;

public class P_귤고르기 {
	  public int solution(int k, int[] tangerine) {
	        int answer = 0;
	        
	        Map<Integer, Integer> sizeMap = new HashMap<Integer, Integer>();
	        
	        // Comparator 정의
	        Comparator<Entry<Integer, Integer>> comparator = new Comparator<Entry<Integer, Integer>>() {
	            @Override
	            public int compare(Entry<Integer, Integer> e1, Entry<Integer, Integer> e2) {
	                return e1.getValue().compareTo(e2.getValue());
	            }
	        };
	        
	        /* 1. 귤 사이즈별로 정리 */
	        for(int size : tangerine) {
	            sizeMap.put(size, sizeMap.getOrDefault(size, 0)+1);
	        }
	        
	        /* 2. 사이즈별로 가장 많은 귤들부터 담기 */
	        while(k > 0) {
	            Entry<Integer, Integer> maxEntry = Collections.max(sizeMap.entrySet(), comparator); // Max Value의 key, value

	            k -= maxEntry.getValue(); // 박스에 담았으니 그만큼 줄임
	            answer++; // 종류별로 ++
	            sizeMap.put(maxEntry.getKey(), 0); // 해당 key는 0으로 초기화
	        }

	        return answer;
	    }
}
