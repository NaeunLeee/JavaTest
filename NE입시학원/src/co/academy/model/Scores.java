package co.academy.model;

public class Scores {

	int id;
	String name;
	int kor;
	int eng;
	int mat;
	
	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public Scores() {}
	
	public Scores(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String scoresDetail() {
		return "국어 : " + kor + " | 영어 : " + eng + " | 수학 : " + mat;
	}
	
}
