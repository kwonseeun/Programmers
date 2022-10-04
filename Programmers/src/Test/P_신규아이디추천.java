package Test;

public class P_신규아이디추천 {
	public String solution(String new_id) {
		String answer = "";
			new_id = new_id.toLowerCase();
			new_id = new_id.replaceAll("[^0-9a-z.-", "");
			new_id = new_id.replaceAll("[]+",".");
			
			if (new_id.startsWith(".")) {
				new_id=new_id.substring(1);
			}
			if (new_id.endsWith(".")) {
				new_id=new_id.substring(0, new_id.length()-1);
			}
			if (new_id.equals("")) {
				new_id="a";
			}
			if (new_id.length() >= 16) {
				new_id=new_id.substring(0,15);
			}
			if (new_id.endsWith(".")) {
				new_id=new_id.substring(0, new_id.length()-1);
			}
			while (new_id.length()<3) {
				new_id+=new_id+= new_id.charAt(new_id.length()-1);
			}
			
			answer=new_id;
			return answer;
		
	}
}
