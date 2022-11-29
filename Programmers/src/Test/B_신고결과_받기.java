package Test;

public class B_신고결과_받기 {
	class Solution {
	    public int[] solution(String[] id_list, String[] report, int k) {
	        int[] answer = new int[id_list.length];
	        Map<String, HashSet<String>> map = new HashMap<>();
	        Map<String, Integer> idxMap = new HashMap<>();
	 
	        for (int i = 0; i < id_list.length; i++) {
	            String name = id_list[i];
	            map.put(name, new HashSet<>());
	            idxMap.put(name, i);
	        }
	 
	      
	        return answer;
	    }
}
