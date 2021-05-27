package co.yedam.app.score;

public class ForTest {

	public static void main(String[] args) {
//		for(int i=10; i>0; i-=2) {
//			System.out.println(i+"안녕하십니까");
		for(int i=1; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i*j+"\t");
			}
			System.out.println();
		}
	}

}
