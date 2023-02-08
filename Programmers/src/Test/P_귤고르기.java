package Test;

import java.security.KeyStore.Entry;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

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
	        
	       

	        return answer;
	    }
}
