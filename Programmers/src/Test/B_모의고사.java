package Test;

public class B_모의고사 {
	  public int[] solution(int[] answers) {
	        int[] answer = {};
	        
	        int first[] = {1,2,3,4,5}; //규칙 반복(이하 동일)
	        int second[] = {2,1,2,3,2,4,2,5};
	        int third[] = {3,3,1,1,2,2,4,4,5,5};
	        
	        int all[] = new int[3]; //3명 비교
	        
	        for(int i = 0; i < answers.length; i++){ //정답과 비교하여 맞은 것이 있다면 ++
	            if(answers[i] == first[i%first.length]){all[0]++;}
	            if(answers[i] == second[i%second.length]){all[1]++;}
	            if(answers[i] == third[i%third.length]){all[2]++;}
	        }
	        
	  }
}
