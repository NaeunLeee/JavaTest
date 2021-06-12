package co.board.access;

import java.util.ArrayList;

import co.board.model.Board;

public interface BoardAccess {

	// 전체 리스트 조회
	public ArrayList<Board> selectAll();
	// 글 등록
	public void insert(Board board);
	// 글 수정
	public void update(Board board);
	// 글 삭제
	public void delete(int idNum);
	// 한건 조회
	public Board selectOne (int idNum);
	// 댓글 조회
	public ArrayList<Board> viewComment(int parentIdNum);
	// 댓글 작성
	public void reply(Board board);
	// 로그인
	public boolean logIn(String memberId, String memberPass);
	// 회원가입
	public void signUp(Board board);
	// 작성자 추출
	public String searchWriter(int IdNum);

}
