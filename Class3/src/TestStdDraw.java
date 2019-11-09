//https://introcs.cs.princeton.edu/java/stdlib/javadoc/StdDraw.html
//package stdDraw;

public class TestStdDraw {
	public static void main(String[] args) {
		StdDraw.setCanvasSize(400, 200);
		StdDraw.setPenRadius(0.02);
		StdDraw.setPenColor(StdDraw.BLUE);
		StdDraw.point(0.5, 0.5);
		StdDraw.setPenColor(StdDraw.MAGENTA);
		StdDraw.line(0.2, 0.2, 0.8, 0.3);
		StdDraw.setPenColor(StdDraw.BLACK);
//		StdDraw.circle(100, 100, 0.5);
	}

}
