package Test;

public class B_체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
    	int answer = 0;
        int[] people = new int[n]; 
        
        //(1)
        for(int i: lost) { 
        	people[i-1]--;	 
        }
        
        //(2)
        for(int j: reserve) { 
        	people[j-1]++;
        }
        
        
        for(int i=0; i<people.length;i++) {
        	//(3)	
        	if(people[i] == -1) { 
        		//(4)
                if(i>0 && people[i-1] == 1) { 
        			people[i]++; 
        			people[i-1]--;
        		//(5)
                }else if(i < people.length-1 && people[i+1] ==1) {
        			people[i]++;
        			people[i+1]--;
        		}
        	}
        }
        //(6)
        for(int i : people) {
        	if(i == 0) {
        		answer++;
        	}
        }
        
		return answer;
    }
}
