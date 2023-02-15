package Test;

import java.util.ArrayList;

public class P_모의고사_2 {
	public int[] solution(int[] answers) {
        int[] answer = new int[] {0,0,0};
        int[] player1 = {1,2,3,4,5};
        int[] player2 = {2,1,2,3,2,4,2,5};
        int[] player3 = {3,3,1,1,2,2,4,4,5,5};
        int max = 0;
        ArrayList<Integer> countNum = new ArrayList<>();


        for(int i=0; i<answers.length; i++){
            if(answers[i] == player1[i%5]){
                answer[0]++;
            }
            if(answers[i] == player2[i%8]){
                answer[1]++;
            }
            if(answers[i] == player3[i%10]){
                answer[2]++;
            }
        }

        for(int n : answer){
            if(n > max){
                max = n;
                System.out.println (n);
            }
        }
        for (int i = 0; i < 3; i++) {
            if (answer[i] == max) {
                countNum.add(i+1);
            }
        }
        return countNum.stream().mapToInt(i->i).toArray();
    }
}
