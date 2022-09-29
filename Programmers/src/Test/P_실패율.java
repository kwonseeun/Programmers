package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P_실패율 {
	static class Point implements Comparable<Point> {
		int x;
		double y;
		
		public Point(int x, double y) {
			this.x = x;
			this.y = y;
		}
		
		public int compareTo(Point o) {
			if (o.y == this.y) {
				return this.x - o.x;
			}
			return Double.compare(o.y, this.y);
		}
	}
	public int[] solution(int N, int[] stages) {
		List<Point> list = new ArrayList<>();
		Arrays.sort(stages);
		int size = stages.length;
		int idx = 0;
		for (int i = 1; i <= N; i++) {
			int cnt = 0;
			for (int j = idx; j < stages.length; j++) {
				if (stages[j] > i) {
					break;
				}
				cnt++;
				idx++;
			}
           
		return answer;
	}
}
