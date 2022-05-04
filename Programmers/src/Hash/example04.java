package Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/*
 * < 베스트 앨범  >  
 * 
 *스파이가 가진 의상들이 담긴 2차원 배열 clothes가 주어질 때 서로 다른 옷의 조합의 수를 return 하도록 solution 함수를 작성해주세요.

/*스트리밍 사이트에서 장르 별로 가장 많이 재생된 노래를 두 개씩 모아 베스트 앨범을 출시하려 합니다. 노래는 고유 번호로 구분하며, 노래를 수록하는 기준은 다음과 같습니다.

속한 노래가 많이 재생된 장르를 먼저 수록합니다.
장르 내에서 많이 재생된 노래를 먼저 수록합니다.
장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
노래의 장르를 나타내는 문자열 배열 genres와 노래별 재생 횟수를 나타내는 정수 배열 plays가 주어질 때, 베스트 앨범에 들어갈 노래의 고유 번호를 순서대로 return 하도록 solution 함수를 완성하세요.*/

public class example04 {
	 public int[] solution(String[] genres, int[] plays) {
	        int[] answer = {};
	        
	        HashMap<String,Integer> hm = new HashMap<>();
	        
	        for (int i = 0; i < genres.length; i++) {
	        	hm.put(genres[i], hm.getOrDefault(genres[i], 0) + plays[i]);
			}
	        
	        ArrayList<String> genre = new ArrayList<>();
	        for (String key : hm.keySet()) {
				genre.add(key);
			}
	        Collections.sort(genre, (o1, o2) -> hm.get(o2) - hm.get(o1));
	        
	        ArrayList<Integer> list = new ArrayList<>();
	        
	        return answer;
	    }
}
