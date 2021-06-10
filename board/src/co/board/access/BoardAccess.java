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
	// 한건조회
	public Board selectOne (int idNum);
	
	
	// 댓글작성
	// 로그인

}
