package co.friend.access;

import java.util.ArrayList;
import java.util.List;

import co.friend.model.Friend;
/**
 * 인터페이스 : 상수필드 + 추상메서드
 * 상수필드(public static final)가 기본.
 * 추상메서드(public abstract, 기능이 구현되어있지 않고 선언만 되어있는)가 기본.
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
	public ArrayList<Friend> selectAll();
	// 단건조회
	public Friend selectOne(String name);
	public Friend findTel(String tel);
	
}
