package pkg.friend;

import java.util.List;

import pkg.Friend;
/**
 * 인터페이스 : 상수필드 + 추상메서드
 * 상수필드(public static final)가 기본.
 * 추상메서드(public abstract)가 기본.
 */

// 친구 관리 프로그램 개발 표준
public interface FriendAccess {

	// 등록
	public void insert(Friend friend);
	// 수정
	public void update(Friend friend);
	// 삭제
	public void delete(String name);
	// 전체조회
	public List selectAll();
	// 단건조회
	public Friend selectOne(String name);
	
}
