package 배열;

public class Score {
	String name;
	int kor;
	int mat;
	int eng;
	int total;
	double avg;
	
	public Score(String name, int kor, int mat, int eng) {
		super();
		this.name = name;
		this.kor = kor;
		this.mat = mat;
		this.eng = eng;
		this.total = kor + mat + eng;
		this.avg = (double)this.total/3;
	}
	
}
