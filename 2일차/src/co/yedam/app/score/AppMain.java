package co.yedam.app.score;

public class AppMain {

	public static void main(String[] args) {
		ScoreApp score = new ScoreApp();
		// 성적입력
		score.input();
		// 결과출력
		System.out.println(
				"총점 : " + score.getSum()+ "\n"+
				"평균 : " + score.getAvg()+ "\n"+
				"등급 : " + score.getGrade()
				);
		System.out.println("합격여부 : " + 
				(score.isPass()? "합격" : "불합격"));
		
		
	}

}
