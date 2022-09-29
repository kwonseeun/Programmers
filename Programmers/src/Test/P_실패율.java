package Test;

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
	
}
