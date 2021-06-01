package 배열;

/* <배열 정리>
 * 크기 고정, 순차적으로 데이터를 저장하고 읽는 용도
 * 추가/삭제가 번거로움
 */

public class 배열초기화 {
	public static void main(String[] args) {
	
		// 1차원 배열
		// 1. 배열 선언
		int[] a;		//int a[];해도 같음
		// 객체 -> new를 이용해서 힙 영역에 메모리를 할당해줘야함
		a = new int[10];
		// 초기화
		a[0] = 10;	// 요소 갯수가 10개라면 인덱스는 0~9까지
		a[1] = 20;	// 초기값은 0으로 설정됨
		a[2] = 100;
		a[3] = 50;
		
		// 2. 배열 출력
		for (int i=0; i<a.length; i++) {
			System.out.printf("%d ",a[i]);
		}
		// 3. 삭제 (삭제 기능은 따로 없음. 지우고자 하는 2번의 다음 인덱스부터 앞으로 당겨 저장)
		for (int i=2; i<a.length; i++) {
			a[i-1] = a[i];
		}
		for (int i=0; i<a.length; i++) {
			System.out.printf("%d ",a[i]);
		}
		// 4. 배열 선언과 초기화를 한꺼번에
		int[] b = {100, 200, 300};		//-> b = new int[3]{100,200,300}이 생략된 것과 같음
		System.out.println("크기 : "+b.length);
	}
}
