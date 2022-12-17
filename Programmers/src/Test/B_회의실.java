package Test;

public class B_회의실 {
	 public static void main(String[] args) throws IOException  {
	    	
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		     
		    //회의의 수를 입력받는다.
		    int num = Integer.parseInt(br.readLine());
		 
		    int[][] time = new int[num][2];
		    
		    //회의 시작시간과 끝나는시간을 2차원배열에 입력받는다.
		    for(int i=0; i<num; i++) {
		    	StringTokenizer st = new StringTokenizer(br.readLine());
		    	for(int j=0; j<2; j++) {
		    		time[i][j] = Integer.parseInt(st.nextToken());
		    	}
		    }
		    
		    //끝나는 시간을 기준으로 정렬을 하고, 같을 경우에는 시작시간을 기준으로 다시 정렬한다.
		    Arrays.sort(time, new Comparator<int[]>() {
		       
		    	@Override
		        public int compare(int[] start, int[] end) {
		                   
		    		if(start[1]==end[1]){
		                //종료시간이 같을 경우, 시작시간으로 정렬한다.
		                return Integer.compare(start[0], end[0]);
		            }
		            //종료시간으로  정렬한다.
		            return Integer.compare(start[1], end[1]);
		        }

		    });
		    
		    int count = 0;    // 최대값 변수 
		    int end = -1;    // 다음시작 시간과 비교할 변수
		    
		    for (int i = 0; i < num; i++) {
		        
		    	//현재 시작시간이 이전 종료시간보다 늦을 경우(1 4 와 3 5 처럼) 
		        if (time[i][0] >= end) {
		  
		            end = time[i][1]; //현재 종료시간을 다음 시작시간과 비교하기위해 저장 
		            count++;
		        }
		    }
		    System.out.println(count);
		    br.close();
		}
}
