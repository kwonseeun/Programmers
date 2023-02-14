package Test;

public class P_최소직사각형 {
	public int solution(int[][] sizes)
    {
        int w = 0;
        int h = 0;
        
        for (int i = 0; i < sizes.length; i++)
        {
            int a = sizes[i][0];
            int b = sizes[i][1];
            
            // 방향 상관없이 더 큰 길이를 sizes[i][0]에, 짧은 길이를 sizes[i][1]에 배치
            sizes[i][0] = Math.max(a, b);
            sizes[i][1] = Math.min(a, b);
            
            // 더 큰 길이의 최대값과, 더 작은 길이의 최대값을 구함
            w = Math.max(w, sizes[i][0]);
            h = Math.max(h, sizes[i][1]);
        }
        
        return w * h;
    }
}
