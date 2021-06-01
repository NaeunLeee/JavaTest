package 도형;

public class AppMain {

	public static void main(String[] args) {

//		Shape s = new Rect(5, 6);
//		s.area();
//		s.print();
//		
//		s = new Tri(5, 6);
//		s.area();
//		s.print();
		
//		Shape[] s = new Shape[3];
//		s[0] = new Rect(4, 5);
//		s[1] = new Circle(5);
//		s[2] = new Tri(3, 6);
//
//		for (Shape temp : s) {
//			temp.area();
//			temp.print();
//		}
		
		Drawable[] t = new Drawable[3];
		t[0] = new Rect(4, 5);		// 자식타입이 부모타입으로 자동 형변환
		t[1] = new Circle(5);
		t[2] = new Tri(3, 6);
		
		for (Drawable temp : t) {
			temp.draw();
			if (temp instanceof Shape) {
				((Shape)temp).area();	// 부모타입은 자식타입으로 강제 형변환해야함
				((Shape)temp).print();
			}
			if (temp instanceof Movable) {
				((Movable)temp).move();
			}
		}
		
	}

}
