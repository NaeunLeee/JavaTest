package 도형;

public class Tri extends Shape implements Drawable {

	int h;
	
	public Tri(int h, int w) {
		this.h = h;
		this.w = h;
	}

	public void area() {
		result = (h*w)/2;
		System.out.println("삼각형의 면적 = " + result);
	}

	public void draw() {
		System.out.println("Draw a triangle");
	}
	
}
