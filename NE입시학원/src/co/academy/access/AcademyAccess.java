package co.academy.access;

import java.util.ArrayList;

import co.academy.model.Attendance;
import co.academy.model.Scores;
import co.academy.model.Student;

public interface AcademyAccess {

	// 원생 등록
	public void signUp(Student student);
	// 원생 정보 수정
	public void updatePhone(Student student);
	// 원생 삭제
	public void delete(int id);
	// 전체 목록 출력
	public ArrayList<Student> printAll();
	// 원생 조회 (이름으로)
	public ArrayList<Student> findByName(String name);
	// 원생 로그인
	public boolean stLogIn(int id, String pw);
	// 로그인 시 이름 출력
	public Student printName(int id);
	// 교사 로그인
	public boolean tcLogIn(String id, String pw);
	// 원생 출석
	public void attendCheck(int id, String date, String time);
	// 원생 비밀번호 변경
	public void updatePw(int id, String pw);
	// 성적 입력
	public void updateScores(int kor, int eng, int mat, int id);
	// 성적 조회
	public Scores viewScores(int id);
	// 출결 조회
	public ArrayList<Attendance> viewAttend(int id);
	
}
