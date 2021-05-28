package co.yedam.score2;

public class AppMain {

	public static void main(String[] args) {
		ScoreArrApp2 score = new ScoreArrApp2();
		score.print();
		for (int i = 0; i < score.arr.length; i++) {
			System.out.printf("%s번 학생 총 %d과목의 총점 : %d\n",i,score.getSbjCnt(i),score.stdTotal(i));
		}
//		System.out.println(score.total());

	}

}
