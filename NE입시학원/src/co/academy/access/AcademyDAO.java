package co.academy.access;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import co.academy.model.Attendance;
import co.academy.model.Scores;
import co.academy.model.Student;

public class AcademyDAO implements AcademyAccess {

	static PreparedStatement psmt1;
	static PreparedStatement psmt2;
	static ResultSet rs;
	static Connection conn;
	static String sql;
	static Scanner scn = new Scanner(System.in);
	Date date = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy");
	
	
	// 원생 등록
	public void signUp(Student student) {
		connect();
		String sql1 = "insert into student (id, pw, name, birth, phone, grade) values (?, ?, ?, ?, ?, ?)";
		String sql2 = "insert into scores (id, name) values (?, ?)";
		try {
			psmt1 = conn.prepareStatement(sql1);
			psmt1.setInt(1, student.getId());
			psmt1.setString(2, student.getPw());
			psmt1.setString(3, student.getName());
			psmt1.setString(4, student.getBirth());
			psmt1.setString(5, student.getPhone());
			psmt1.setString(6, student.getGrade());
			psmt2 = conn.prepareStatement(sql2);
			psmt2.setInt(1, student.getId());
			psmt2.setString(2, student.getName());
			int r = psmt1.executeUpdate();
			psmt2.executeUpdate();
			System.out.println(r + "명의 학생을 등록하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 학년 계산
	public String calGrade(String birth) {
		String grade = "";
		int birthYear = 2000+Integer.parseInt(birth.substring(0, 2));
		int age = Integer.parseInt(sdf3.format(date))-birthYear+1;
		switch (age) {
		case 19: grade = "고3";	break;
		case 18: grade = "고2";	break;
		case 17: grade = "고1";	break;
		case 16: grade = "중3";	break;
		case 15: grade = "중2";	break;
		case 14: grade = "중1";	break;
		}
		return grade;
	}
	
	// 원생 정보 수정 (수강번호로 검색, 전화번호 수정)
	public void updatePhone(Student student) {
		connect();
		String sql = "update student set phone=? where id=?";
		try {
			psmt1 = conn.prepareStatement(sql);
			psmt1.setString(1, student.getPhone());
			psmt1.setInt(2, student.getId());
			int r = psmt1.executeUpdate();
			System.out.println(r + "명의 정보를 수정하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 원생 삭제
	public void delete(int id) {
		connect();
		String sql1 = "delete from student where id=?";
		String sql2 = "delete from scores where id=?";
		try {
			psmt1 = conn.prepareStatement(sql1);
			psmt1.setInt(1, id);
			psmt2 = conn.prepareStatement(sql2);
			psmt2.setInt(1, id);
			int r = psmt1.executeUpdate();
			psmt2.executeUpdate();
			System.out.println(r + "명의 정보를 삭제하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// 전체 목록 출력
	public ArrayList<Student> printAll() {
		ArrayList<Student> studentList = new ArrayList<>();
		connect();
		try {
			String sql = "select * from student";
			psmt1 = conn.prepareStatement(sql);
			rs = psmt1.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setPw(rs.getString("pw"));
				student.setName(rs.getString("name"));
				student.setBirth(rs.getString("birth"));
				student.setPhone(rs.getString("phone"));
				studentList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return studentList;
	}

	// 학년별 목록 출력
	public ArrayList<Student> printByGrade(String grade) {
		ArrayList<Student> studentList = new ArrayList<>();
		connect();
		try {
			String sql = "select * from student where grade=?";
			psmt1 = conn.prepareStatement(sql);
			psmt1.setString(1, grade);
			rs = psmt1.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setPw(rs.getString("pw"));
				student.setName(rs.getString("name"));
				student.setBirth(rs.getString("birth"));
				student.setPhone(rs.getString("phone"));
				student.setGrade(rs.getString("grade"));
				studentList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return studentList;
	}
	
	// 원생 조회 (이름으로)
	public ArrayList<Student> findByName(String name) {
		ArrayList<Student> studentList = new ArrayList<>();
		connect();
		try {
			String sql = "select * from student where name=?";
			psmt1 = conn.prepareStatement(sql);
			psmt1.setString(1, name);
			rs = psmt1.executeQuery();
			while (rs.next()) {
				Student student = new Student();
				student.setId(rs.getInt("id"));
				student.setPw(rs.getString("pw"));
				student.setName(rs.getString("name"));
				student.setBirth(rs.getString("birth"));
				student.setPhone(rs.getString("phone"));
				studentList.add(student);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return studentList;
	}
	
	// 원생 로그인
	public boolean stLogIn(int id, String pw) {
		connect();
		boolean b = false;
		String sql = "select * from student where id=? and pw=?";
		try {
			psmt1 = conn.prepareStatement(sql);
			psmt1.setInt(1, id);
			psmt1.setString(1, pw);
			rs = psmt1.executeQuery();
			if (rs.next()) {
				b = true;
			} else {
				b = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return b;
	}
	
	// 수강번호 입력 시 이름 출력
	public Student printName(int id) {
		connect();
		String sql = "select name from student where id=?";
		Student student = new Student();
		try {
			psmt1 = conn.prepareStatement(sql);
			psmt1.setInt(1, id);
			rs = psmt1.executeQuery();
			while (rs.next()) {
				student.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return student;
	}
	
	// 교사 로그인
	public boolean tcLogIn(String tcID, String tcPW) {
		connect();
		boolean b = false;
		String sql = "select * from teacher where tcID=? and tcPW=?";
		try {
			psmt1 = conn.prepareStatement(sql);
			psmt1.setString(1, tcID);
			psmt1.setString(1, tcPW);
			rs = psmt1.executeQuery();
			if (rs.next()) {
				b = true;
			} else {
				b = false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return b;
	}
	
	// 성적 입력
	public void updateScores(int kor, int eng, int mat, int id) {
		connect();
		String sql = "update scores set kor=?, eng=?, mat=? where id=?";
		try {
			psmt1 = conn.prepareStatement(sql);
			psmt1.setInt(1, kor);
			psmt1.setInt(2, eng);
			psmt1.setInt(3, mat);
			psmt1.setInt(4, id);
			int r = psmt1.executeUpdate();
			System.out.println(r + "명의 성적을 입력하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	// 성적 조회
	public Scores viewScores(int id) {
		connect();
		String sql = "select * from scores where id=?";
		Scores score = new Scores();
		try {
			psmt1 = conn.prepareStatement(sql);
			psmt1.setInt(1, id);
			rs = psmt1.executeQuery();
			while (rs.next()) {
				score.setKor(rs.getInt("kor"));
				score.setEng(rs.getInt("eng"));
				score.setMat(rs.getInt("mat"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return score;
	}
	
	// 출결 조회
	public ArrayList<Attendance> viewAttend(int id) {
		connect();
		ArrayList<Attendance> attList = new ArrayList<>();
		String sql = "select * from attendance where id=?;";
		try {
			psmt1 = conn.prepareStatement(sql);
			psmt1.setInt(1, id);
			rs = psmt1.executeQuery();
			while (rs.next()) {
				Attendance att = new Attendance();
				att.setDate(rs.getString("date"));
				att.setTime(rs.getString("time"));
				att.setAttend(rs.getString("attend"));
				attList.add(att);
			} 
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return attList;
	}
	
	// 원생 출석
	public void attendCheck(int id, String date, String time) {
		connect();
		String attend = "결석";
		System.out.println("   현재 시각 : " + time);
		int hour = Integer.parseInt(time.substring(0, 2));
		if (hour>=13) {
			System.out.println("   [ 지각 ]");
			attend = "지각";
		} else {
			System.out.println("   [ 정상 출석 완료 ]");
			attend = "정상";
		}
		String sql = "insert into attendance (id, date, time, attend) values (?, ?, ?, ?)";
		try {
			psmt1 = conn.prepareStatement(sql);
			psmt1.setInt(1, id);
			psmt1.setString(2, date);
			psmt1.setString(3, time);
			psmt1.setString(4, attend);
			int r = psmt1.executeUpdate();
			System.out.println("   " + r + "건 처리 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}
	
	// 원생 비밀번호 변경
	public void updatePw(int id, String pw) {
		connect();
		String sql = "update student set pw=? where id=?";
		try {
			psmt1 = conn.prepareStatement(sql);
			psmt1.setString(1, pw);
			psmt1.setInt(2, id);
			int r = psmt1.executeUpdate();
			System.out.println(r + "건의 비밀번호를 변경하였습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
	}

	// connection
	public static void connect() {
		String url = "jdbc:sqlite:C:/sqlite/db/academy.db";
		try {
			conn = DriverManager.getConnection(url);
//			System.out.println("☆★☆★연결 성공★☆★☆");
		} catch (SQLException e) {
			System.out.println("=== 연결 실패 ===");
		} 
	}
	
	// close
	public static void close() {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(psmt1!=null) {
			try {
				psmt1.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(psmt2!=null) {
			try {
				psmt2.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
	}
	
}
