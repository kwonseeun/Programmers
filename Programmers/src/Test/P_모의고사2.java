package Test;

import java.util.ArrayList;
import java.util.List;

public class P_모의고사2 {
	public int[] solution(int[] answers) {
		
		//답안지
		int[] student1 = { 1,2,3,4,5 };
		int[] student2 = { 2,1,2,3,2,4,2,5};
		int[] student3 = { 3,3,1,1,2,2,4,4,5,5,};
		int[] score = new int[3];
		
		//채점 
		for (int i = 0; i < answers.length; i++) {
			int answer = answers[i];
			if(answer == student1[i % student1.length]) {
				score[0]++;
			}
			if(answer == student2[i % student1.length]) {
				score[1]++;
			}
			if(answer == student3[i % student1.length]) {
				score[2]++;
			}
			
			int topScore = Math.max(Math.max(score[0], score[1]);
			
			List<Integer> students = new ArrayList<Integer>();
			for (int j = 0; j < score.length; j++) {
				if (topScore == score[i]) {
					students.add(i+1);
				}
			}
		return students.stream().mapToInt(Integer::intValue).toArray();	
		}
	}
}
