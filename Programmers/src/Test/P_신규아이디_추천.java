package Test;

import java.util.ArrayList;

public class P_신규아이디_추천 {
	 public String solution(String new_id) {
	        String answer = "";
	        
	        //1단계
	        new_id = new_id.toLowerCase();
	        
	        //2단계
	        String regularStr = "[^a-z0-9-_.]";
	        new_id = new_id.replaceAll(regularStr, "");
	 
	        //3단계
	        regularStr = "\\.{2,}";
	        new_id = new_id.replaceAll(regularStr, ".");
	        
	        ArrayList<Character> charList = new ArrayList<>();
	        
	        for(int i=0; i<new_id.length(); i++) {
	            charList.add(new_id.charAt(i));
	        }
	        
	        //4단계        
	        if (charList.size() > 0) {
	            if(charList.get(0) == '.' ) charList.remove(0);
	            if(charList.size() > 0 && '.' == charList.get(charList.size()-1) ) 
	            	charList.remove(charList.size()-1);
	        }
			return regularStr;
	        
	 }
}
