package Test;

import java.util.ArrayList;

public class P_모의고사2 {
	 public int[] solution(int[] answers) {
	        int[] answer = {};
	        int[] person1 = {1,2,3,4,5}; //이만큼씩 반복
	        int[] person2 = {2,1,2,3,2,4,2,5};
	        int[] person3 = {3,3,1,1,2,2,4,4,5,5};
	        int answer1=0, answer2 =0, answer3 =0;
	        
	        for(int i =0; i<answers.length; i++){
	            if(person1[i%person1.length] == answers[i]) answer1++;
	            if(person2[i%person2.length] == answers[i]) answer2++;
	            if(person3[i%person3.length] == answers[i]) answer3++;
	        }
	      
	        
	        return answer;
	    }
}
