package 도형;

public class Circle extends Shape implements Drawable {

	public Circle(int w) {
		this.w = w;
//		super(w);도 가능
	}
	
	public void area() {
		result = w*w*3.14;
		System.out.println("원의 면적 = " + result);
	}

	public void draw() {
		System.out.println("Draw a circle");
	}
}
