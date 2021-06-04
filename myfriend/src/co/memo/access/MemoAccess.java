package co.memo.access;

import java.util.ArrayList;

import co.memo.model.Memo;

public interface MemoAccess {

	// 등록
	public void insert(Memo memo);
	// 수정
	public void update(Memo memo);
	// 삭제
	public void delete(String date);
	// 전체조회
	public ArrayList<Memo> selectAll();
	// 날짜로 내용조회
	public Memo selectOne(String date);
	// 일부내용으로 조회
	public Memo searchContent(String content);
	
}
