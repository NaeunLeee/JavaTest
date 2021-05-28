package co.yedam.score;

public class AppMain {

	public static void main(String[] args) {

		ScoreArrApp score = new ScoreArrApp();
		System.out.println("성적 : ");
		score.print();
		System.out.printf("총점 : %04d\n", score.total());
		System.out.printf("평균 : %3.1f\n", score.avg());
		System.out.println("=======================");
		score.printH();
	}

}
