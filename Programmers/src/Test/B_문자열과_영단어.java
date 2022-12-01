package Test;

import java.util.HashMap;

public class B_문자열과_영단어 {
	public int solution(String s) {
        int answer = 0;
     
        String temp ="";
        String word ="";
        HashMap<String,Integer> dic = new HashMap<>(); 
        dic.put("zero",0);
        dic.put("one",1);
        dic.put("two",2);
        dic.put("three",3);
        dic.put("four",4);
        dic.put("five",5);
        dic.put("six",6);
        dic.put("seven",7);
        dic.put("eight",8);
        dic.put("nine",9);
        
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)<58){
                temp=temp+s.charAt(i);
            }
            else{
                word=word+s.charAt(i);
            }
            
            if(dic.containsKey(word)){
                temp=temp+dic.get(word);
                word="";
            }
            
        }
       
        answer=Integer.parseInt(temp);
        
        return answer;
    }
}
