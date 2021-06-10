package co.board.view;

import java.util.List;
import java.util.Scanner;

import co.board.access.BoardAccess;
import co.board.access.BoardDAO;
import co.board.model.Board;

public class BoardApp {

	BoardAccess dao = new BoardDAO();
	static Scanner scn = new Scanner(System.in);
	
	public void start() {
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
			}
		} while (menuNum != 0);
		System.out.println("종료합니다.");
	}

	private void menuTitle() {
		System.out.println();
		System.out.println("===========  게시판  ===========");
		System.out.println("==| 1. 전체 글 조회		|==");
		System.out.println("==| 2. 게시글 등록		|==");
		System.out.println("==| 3. 게시글 수정		|==");
		System.out.println("==| 4. 게시글 삭제		|==");
		System.out.println("==| 5. 게시글 조회		|==");
		System.out.println("==| 6. 댓글 작성		|==");
		System.out.println("==| 7. 로그인		|==");
		System.out.println("==| 0. 종료			|==");
		System.out.println("===========================");
		System.out.println();
	}
	
	// 전체 리스트 조회
	private void selectAll() {
		System.out.println("전체 게시글을 조회합니다.");
		List<Board> boardList = dao.selectAll();
		for (Board board : boardList) {
			System.out.println(board);
		}
	}
	
	// 게시글 등록
	private void insert() {
		System.out.println("게시글을 등록하세요");
		System.out.print("제목 > ");
		String title = scn.next();
		System.out.print("작성자 > ");
		String writer = scn.next();
		System.out.print("내용 > ");
		String content = scn.next();
		Board board = new Board(title, content, writer);
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
		System.out.print("삭제할 게시글의 번호를 입력하세요 > ");
		int id = scn.nextInt();
		dao.delete(id);
		
	}
	// 한건조회
	private void selectOne() {
		System.out.println("조회할 게시글의 번호를 입력하세요 > ");
		int id = scn.nextInt();
		System.out.println(dao.selectOne(id));
	}
	

	
}
