package Exercise;

class MyPoint {
	int x;
	int y;

	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public double getDistance(int x1, int y1) {
		return Math.sqrt(Math.pow(this.x-x1, 2) + Math.pow(this.y-y1, 2));
	}
}

class Exercise6_7 {
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1,1);

        	// MyPoint와 (2,2)의 거리를 구한다.
		System.out.println(p.getDistance(2,2)); 
	}
}
