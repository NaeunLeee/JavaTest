package 배열;

import java.awt.Point;

/* 
 * 객체배열 : 배열의 요소 타입이 객체인 경우
 */

public class 객체배열 {
	public static void main(String[] args) {
		// 변수 선언
		Score[] a;
		a = new Score[10];
		// 초기화
		a[0] = new Score("홍길동", 100, 90, 80);
		a[1] = new Score("김유신", 70, 50, 100);
		a[2] = new Score("유관순", 80, 80, 60);
		
		// 이름만 출력
		for (int i=0; i<a.length; i++) {
			if (a[i]!=null) {										// a배열의 크기를 10으로 정해주었기 때문에 nullpointererror가 남
				System.out.println(a[i].name);
			}
		}
		
		// 선언과 동시에 초기화
		Score[] b = {new Score("홍길동", 100, 90, 80),
					 new Score("김유신", 70, 50, 100),
					 new Score("유관순", 80, 80, 60)};
		// 이름과 총점을 출력
		// (일반 for문)
		for (int i=0; i<b.length; i++) {
			System.out.println(b[i].name + " : " + b[i].total);		// b는 요소가 3개 뿐이라 nullpointererror 신경안써도 됨
		}
		// (향상된 for문)
		for (Score score : b) {										// ':'이 파이썬 for문에서의 'in'과 같은 의미
			System.out.println(score.name + " : " + score.total);
		}
		// 객체배열
		Point[] c = {new Point(10, 10), new Point(30, 10), new Point(30, 30), new Point(10, 30)};
		// 확장 for문을 이용하여 x, y 좌표를 출력
		for (Point point : c) {
			System.out.println(point.x + ", " + point.y);
		}
	}
}
