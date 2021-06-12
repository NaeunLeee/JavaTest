package co.board.view;

import java.util.List;
import java.util.Scanner;

import co.board.access.BoardAccess;
import co.board.access.BoardDAO;
import co.board.model.Board;

public class BoardApp {

	BoardAccess dao = new BoardDAO();
	static Scanner scn = new Scanner(System.in);
	String loginId;
	
	public void start() {
		int menuNum;
		do {
			System.out.println("===========================");
			System.out.println("==| 1. 로그인		|==");
			System.out.println("==| 2. 회원가입		|==");
			System.out.println("==| 0. 종료		|==");
			System.out.println("===========================");
			System.out.print("메뉴 번호 입력 > ");
			menuNum = scn.nextInt();
			switch (menuNum) {
				case 1: logIn();	break;
				case 2: signUp();	break;
			}
		} while (menuNum != 0);
		System.out.println("종료합니다.");
	}
	// 로그인
	private void logIn() {
		System.out.println("====== 로그인 ======");
		System.out.print("아이디 > ");
		loginId = scn.next();
		System.out.print("비밀번호 > ");
		String pass = scn.next();
		boolean b = dao.logIn(loginId, pass);
		if (b==true) {
			menu();
		} else {
			System.out.println("아이디와 비밀번호를 다시 확인하세요.");
			start();
		}
	}
	// 메뉴
	private void menu() {
		int menuNum;
		do {
			menuTitle();
			System.out.print("메뉴 번호 입력 > ");
			menuNum = scn.nextInt();
			switch (menuNum) {
			case 1: selectAll();	break;
			case 2: insert();		break;
			case 3: update();		break;
			case 4: delete();		break;
			case 5: selectOne();	break;
			case 6: comment();		break;
			}
		} while (menuNum != 0);
		System.out.println("종료합니다.");
	}

	// 메뉴판
	private void menuTitle() {
		System.out.println();
		System.out.println("=========  게시판  ==========");
		System.out.println("==| 1. 전체 글 조회		|==");
		System.out.println("==| 2. 게시글 등록		|==");
		System.out.println("==| 3. 게시글 수정		|==");
		System.out.println("==| 4. 게시글 삭제		|==");
		System.out.println("==| 5. 게시글 조회		|==");
		System.out.println("==| 6. 댓글 작성		|==");
		System.out.println("==| 0. 종료		|==");
		System.out.println("===========================");
		System.out.println();
	}
	
	// 전체 리스트 조회
	private void selectAll() {
		System.out.println("전체 게시글 목록을 조회합니다.");
		List<Board> boardList = dao.selectAll();
		for (Board board : boardList) {
			System.out.println(board.viewInfo());
		}
	}
	
	// 게시글 등록
	private void insert() {
		System.out.println("게시글을 등록하세요");
		System.out.print("제목 > ");
		String title = scn.next();
		System.out.print("내용 > ");
		String content = scn.next();
		Board board = new Board(title, content, loginId);
		dao.insert(board);
	}
	
	// 게시글 수정
	private void update() {
		Board board = new Board();
		System.out.print("수정할 게시글의 번호를 입력하세요 > ");
		board.setIdNum(scn.nextInt());
		System.out.print("수정할 내용을 입력하세요 > ");
		board.setContent(scn.next());
		dao.update(board);
	}
	
	// 게시글 삭제
	private void delete() {
		Board board = new Board();
		System.out.print("삭제할 게시글의 번호를 입력하세요 > ");
		int id = scn.nextInt();
		String writer = dao.searchWriter(id);
		if (writer==loginId) {
			dao.delete(id);
		} else {
			System.out.println("삭제 권한이 없습니다.");
		}
	}
	// 한건 조회 (본문 + 댓글)
	private void selectOne() {
		System.out.print("조회할 게시글의 번호를 입력하세요 > ");
		int id = scn.nextInt();
		System.out.println(dao.selectOne(id));
		if (dao.viewComment(id)!=null) {
			List<Board> commentList = dao.viewComment(id);
			for (Board board : commentList) {
				System.out.println(board.viewContent());
			}
		} else {
			System.out.println("댓글 0건");
		}
	}
	
	// 댓글 작성
	private void comment() {
		System.out.print("조회할 게시글의 번호를 입력하세요 > ");
		int id = scn.nextInt();
		System.out.println(dao.selectOne(id));
		System.out.println("======================");
		System.out.println("댓글 작성 : 1\n이전 메뉴로 돌아가기 : 2");
		System.out.print("입력 > ");
		int menuNum = scn.nextInt();
		if (menuNum==1) {
			int parentIdNum = id;
			System.out.println("댓글을 등록하세요");
			System.out.print("제목 > ");
			String title = scn.next();
			System.out.print("내용 > ");
			String content = scn.next();
			Board board = new Board(title, content, loginId, parentIdNum);
			dao.reply(board);
		} else {
			menu();
		}
	}
	
	// 회원가입
	private void signUp() {
		System.out.println("====== 회원가입 ======");
		System.out.print("ID > ");
		String id = scn.next();
		System.out.print("비밀번호 > ");
		String pw = scn.next();
		Board board = new Board(id, pw);
		dao.signUp(board);
	}
	



}
