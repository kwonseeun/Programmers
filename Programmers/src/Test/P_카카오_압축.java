package Test;

import java.util.ArrayList;
import java.util.HashMap;

public class P_카카오_압축 {
	 HashMap<String, Integer> dict = new HashMap<>();
	    public int[] solution(String msg) {
	        int[] answer;
	        ArrayList<Integer> ans = new ArrayList<>();        
	        
	        int dictIdx = 1;
	        for(int i='A'; i<='Z'; i++){
	            dict.put( String.valueOf((char)i), dictIdx++) ;
	        }
	       
	        int idx = 0;
	        while(idx < msg.length()){
	            String w = "";
	            while(idx < msg.length()){
	                if(!dict.containsKey(w+msg.charAt(idx))){
	                    break;
	                }else{
	                    w += msg.charAt(idx);
	                }
	                idx++;
	            }
	            
	            ans.add(dict.get(w));
	            if(idx < msg.length()){
	                dict.put(w+msg.charAt(idx), dictIdx++);
	            }            
	        }
	        
	        answer = new int[ans.size()];
	        for(int i =0; i<ans.size(); i++){
	            answer[i] = ans.get(i);
	        }
	           
	        return answer;
	    }
}
