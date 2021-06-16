package co.academy.view;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import co.academy.access.AcademyAccess;
import co.academy.access.AcademyDAO;
import co.academy.model.Attendance;
import co.academy.model.Student;

public class AcademyApp {

	AcademyAccess access = new AcademyDAO();
	static Scanner scn1 = new Scanner(System.in);
	static Scanner scn2 = new Scanner(System.in);
	int stLoginId;
	String tcloginId;
	Date date = new Date();
	SimpleDateFormat sdf1 = new SimpleDateFormat("yy/MM/dd");
	SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");

	public void mainScreen() {
		int menuNum;
		do {
			System.out.println("┌────┤ NE ♥ 입시 학원 ├────┐");
			System.out.println("│　　　1. 원생 로그인　　　│");
			System.out.println("│　　　2. 교사 로그인　　　│");
			System.out.println("│　　　0. 종 료　　　　　　│");
			System.out.println("└──────────────────────────┘");
			System.out.print("입력 > ");
			menuNum = scn1.nextInt();
			switch (menuNum) {
			case 1: stLogIn();	break;
			case 2: tcLogIn();	break;
			}
		} while (menuNum!=0);
		System.out.println("프로그램을 종료합니다.");
	}
	
	public void stLogIn() {
		System.out.println("───────┤ 원생 로그인 ├───────");
		System.out.print("　　　수강번호 > ");
		stLoginId = scn1.nextInt();
		System.out.print("　　　비밀번호 > ");
		String stPW = scn2.next();
		if (access.stLogIn(stLoginId, stPW)) {
			System.out.println();
			System.out.printf("───────┤ %s 학생 환영합니다. ├───────", access.printName(stLoginId).viewName());
			System.out.println();
			stMenu();
		} else {
			System.out.println("수강번호와 비밀번호를 다시 확인하세요.");
			stLogIn();
		}
	}
	
	public void tcLogIn() {
		System.out.println("───────┤ 교사 로그인 ├───────");
		System.out.print("　　　아이디 > ");
		tcloginId = scn1.next();
		System.out.print("　　　비밀번호 > ");
		String tcPW = scn2.next();
		if (access.tcLogIn(tcloginId, tcPW)) {
			tcMenu();
		} else {
			System.out.println("아이디와 비밀번호를 다시 확인하세요.");
			tcLogIn();
		} 
	}
	
	public void stMenu() {
		int menuNum;
		do {
			stMenuTitle();
			System.out.print("입력 > ");
			menuNum = scn1.nextInt();
			switch (menuNum) {
			case 1: attend();		break;
			case 2: stViewScores();	break;
			case 3: updatePw();		break;
			}
		} while (menuNum!=0);
	}
	
	public void stMenuTitle() {
		System.out.println();
		System.out.println("┌────────────────────────────┐");
		System.out.println("│　　　1. 출석 체크　　　　　│");
		System.out.println("│　　　2. 성적 조회　　　　　│");
		System.out.println("│　　　3. 비밀번호 변경　　　│");
		System.out.println("│　　　0. 종 료　　　　　　　│");
		System.out.println("└────────────────────────────┘");
	}
	
	public void attend() {
		String d = sdf1.format(date);
		String t = sdf2.format(date);
		System.out.print("비밀번호를 입력하세요 > ");
		String pw = scn1.next();
		boolean b = access.stLogIn(stLoginId, pw);
		if (b=true) {
			System.out.println("────────────────────────────────────────────");
			access.attendCheck(stLoginId, d, t);
			System.out.println("────────────────────────────────────────────");
		} else {
			System.out.println("비밀번호를 다시 확인하세요.");
		}
	}
	
	public void stViewScores() {
		System.out.print("비밀번호를 입력하세요 > ");
		String pw = scn1.next();
		boolean b = access.stLogIn(stLoginId, pw);
		if (b=true) {
			System.out.println("성적을 조회합니다.");
			System.out.println(access.viewScores(stLoginId).scoresDetail());
		} else {
			System.out.println("비밀번호를 다시 확인하세요.");
		}
	}
	
	public void updatePw() {
		System.out.println("비밀번호를 변경합니다.");
		System.out.print("현재 비밀번호 입력 > ");
		String stPW = scn2.next();
		boolean b = access.stLogIn(stLoginId, stPW);
		if (b=true) {
			System.out.print("새로운 비밀번호 입력 > ");
			String newPw = scn1.next();
			access.updatePw(stLoginId, newPw);
		} else {
			System.out.println("비밀번호를 다시 확인하세요.");
		}
	}
	
	public void tcMenu() {
		int menuNum;
		do {
			tcMenuTitle();
			System.out.print("입력 > ");
			menuNum = scn1.nextInt();
			switch (menuNum) {
			case 1: signUp();		break;
			case 2: updatePhone();	break;
			case 3: delete();		break;
			case 4: printAll();		break;
			case 5: findByName();	break;
			case 6: manageScores();	break;
			case 7: viewAttend();	break;
			}
		} while (menuNum!=0);
		System.out.println("처음으로 돌아갑니다.");
		mainScreen();
	}
	
	public void tcMenuTitle() {
		System.out.println();
		System.out.println("┌──────┤ 원생  관리 ├──────┐");
		System.out.println("│　　　1. 원생 등록　　　　│");
		System.out.println("│　　　2. 정보 수정　　　　│");
		System.out.println("│　　　3. 원생 삭제　　　　│");
		System.out.println("│　　　4. 전체 조회　　　　│");
		System.out.println("│　　　5. 인적 사항　　　　│");
		System.out.println("│　　　6. 성적 관리　　　　│");
		System.out.println("│　　　7. 출결 조회　　　　│");
		System.out.println("│　　　0. 메인 메뉴　　　　│");
		System.out.println("└──────────────────────────┘");
	}
	
	public void signUp() {
		System.out.println("새로운 원생을 등록합니다.");
		System.out.print("수강번호 > ");
		int id = scn1.nextInt();
		System.out.print("비밀번호 > ");
		String pw = scn1.next();
		System.out.print("이름 > ");
		String name = scn2.next();
		System.out.print("생년월일 > ");
		String birth = scn1.next();
		System.out.print("전화번호 > ");
		String phone = scn2.next();
		String grade = access.calGrade(birth);
		Student student = new Student(id, pw, name, birth, phone, grade);
		access.signUp(student);
	}
	
	public void updatePhone() {
		System.out.println("수강번호를 검색해 전화번호를 수정합니다.");
		Student student = new Student();
		System.out.print("수정할 원생의 수강번호 입력 > ");
		student.setId(scn1.nextInt());
		System.out.println("새로운 전화번호 입력 > ");
		student.setPhone(scn2.next());
		access.updatePhone(student);
	}
	
	public void delete() {
		System.out.println("원생의 정보를 삭제합니다.");
		System.out.print("삭제할 원생의 수강번호 입력 > ");
		int id = scn1.nextInt();
		access.delete(id);
	}
	
	public void printAll() {
		System.out.println("┌──────────────────────┐");
		System.out.println("│　　1. 전체 목록　　　│");
		System.out.println("│　　2. 학년별 목록　　│");
		System.out.println("│　　0. 이전 메뉴　　　│");
		System.out.println("└──────────────────────┘");
		System.out.print("입력 > ");
		int menuNum = scn1.nextInt();
		if (menuNum==1) {
			System.out.println("────────────┤ 전체 원생 목록 ├────────────");
			List<Student> studentList = access.printAll();
			for (Student student : studentList) {
				System.out.println(student.viewInfo());
			}
			System.out.println("────────────────────────────────────────────");
		} else if (menuNum==2) {
			System.out.println("┌───────────┬───────────┬───────────┐");
			System.out.println("│　1] 중1　 │　2] 중2　 │　3] 중3　 │");
			System.out.println("├───────────┼───────────┼───────────┤");
			System.out.println("│　4] 고1　 │　5] 고2　 │　6] 고3　 │");
			System.out.println("└───────────┴───────────┴───────────┘");
			System.out.print("입력 > ");
			int m = scn1.nextInt();
			String grade ="";
			switch (m) {
			case 1: grade = "중1"; break;
			case 2: grade = "중2"; break;
			case 3: grade = "중3"; break;
			case 4: grade = "고1"; break;
			case 5: grade = "고2"; break;
			case 6: grade = "고3"; break;
			}
			System.out.printf("────────────┤ %s 전체 목록 ├────────────", grade);
			System.out.println();
			List<Student> studentList = access.printByGrade(grade);
			for (Student student : studentList) {
				System.out.println(student.viewInfo());
			}
			System.out.println("────────────────────────────────────────────");
		} else {
			tcMenu();
		}
		
	}
	public void findByName() {
		System.out.print("조회할 원생의 이름 입력 > ");
		String name = scn1.next();
		if (access.findByName(name)!=null) {
			List<Student> studentList = access.findByName(name);
			System.out.println("──────────────────────────────────────────────────────────");
			System.out.printf("  %s 학생의 인적 사항입니다.", name);
			System.out.println();
			for (Student student : studentList) {
				System.out.println("  "+student.viewDetail());
			}
			System.out.println("──────────────────────────────────────────────────────────");
		} else {
			System.out.println("해당하는 이름의 원생이 없습니다.");
		}
	}
	
	public void manageScores() {
		System.out.println("┌──────────────────────┐");
		System.out.println("│　　1. 성적 입력　　　│");
		System.out.println("│　　2. 성적 조회　　　│");
		System.out.println("│　　0. 이전 메뉴　　　│");
		System.out.println("└──────────────────────┘");
		System.out.print("입력 > ");
		int menuNum = scn1.nextInt();
		if (menuNum==1) {
			updateScores();
		} else if (menuNum==2) {
			tcViewScores();
		} else {
			tcMenu();
		}
	}
	
	public void updateScores() {
		System.out.print("성적 입력할 원생의 수강번호 입력 > ");
		int id = scn1.nextInt();
		System.out.print("국어 성적 > ");
		int kor = scn2.nextInt();
		System.out.print("영어 성적 > ");
		int eng = scn1.nextInt();
		System.out.print("수학 성적 > ");
		int mat = scn2.nextInt();
		access.updateScores(kor, eng, mat, id);
	}
	
	public void tcViewScores() {
		System.out.print("조회할 원생의 수강번호 입력 > ");
		int id = scn1.nextInt();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.printf("  %s 학생의 성적입니다.", access.printName(id).viewName());
		System.out.println();
		System.out.println("  "+access.viewScores(id).scoresDetail());
		System.out.println("──────────────────────────────────────────────────────────");
	}

	public void viewAttend() {
		System.out.print("조회할 원생의 수강번호 입력 > ");
		int id = scn1.nextInt();
		System.out.println("──────────────────────────────────────────────────────────");
		System.out.printf("  %s 학생의 출결 기록입니다.\n", access.printName(id).viewName());
		List<Attendance> attList = access.viewAttend(id);
		for (Attendance att : attList) {
			System.out.println("  "+att.viewAtDetail());
		}
		System.out.println("──────────────────────────────────────────────────────────");
	}
}
