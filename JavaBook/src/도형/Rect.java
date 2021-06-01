package 도형;

public class Rect extends Shape implements Drawable, Movable {
	
	int h;
	
	public Rect(int h, int w) {
		this.h = h;
		this.w = w;
	}

	public void area() {
		result = h*w;
		System.out.println("사각형의 면적 = " + result);
	}

	public void draw() {
		System.out.println("Draw a rectangle");
	}

	public void move() {
		System.out.println("Move the rectangle");
	}
	
	
}
