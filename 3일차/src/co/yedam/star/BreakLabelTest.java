package co.yedam.star;

public class BreakLabelTest {

	public static void main(String[] args) {
		Outer: for (int i=0; i<9; i++) {			// for문 앞에 Outer라는 라벨을 붙여줌
			for (int j=0; j<9; j++) {
				System.out.println(i*j);
				if (j==2) {
					break Outer;					// 두번재 for문 뿐 아니라 Outer전체를 빠져나옴
				}
				
			}
		}
		System.out.println("end");
	}

}
