package Test;

import java.util.HashSet;

public class P_폰켓몬 {
	public int solution(int[] nums) {
	    HashSet<Integer> set = new HashSet<>();		// set.size() : 폰켓몬 종류의 수
	    int maxCount = nums.length/2;

	    for(int num : nums) {
	        set.add(num);
	    }
		
	    // set.size()가 maxCount 보다 크거나 같다면 maxCount -> 종류가 많아도 다 못데려감
	    // set.size()가 maxCount 보다 작다면 set.size() -> 많이 데려갈 수 있어도 종류가 없음
	    return maxCount <= set.size() ? maxCount : set.size();
	}
}
