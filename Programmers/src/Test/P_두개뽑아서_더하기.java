package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class P_두개뽑아서_더하기 {
	 public int[] solution(int[] numbers) {
	        int[] answer = {};
	        int sum = 0;
	        ArrayList<Integer> aList = new ArrayList<Integer>();
	        for(int i=0; i<numbers.length; i++) {
	            for(int j=i+1; j<numbers.length; j++) {
	                sum = numbers[i]+numbers[j];
	                if(aList.indexOf(sum)<0) { //중복이 아니라면
	                    aList.add(sum);
	                }
	            }
	        }
	        answer = new int[aList.size()];
	        for(int i=0; i<aList.size(); i++) {
	            answer[i]+=aList.get(i);
	        }
	        Arrays.sort(answer);
	        return answer;
	    }
}
