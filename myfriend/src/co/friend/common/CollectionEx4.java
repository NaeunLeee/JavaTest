package co.friend.common;

import java.util.Iterator;
import java.util.Map;

import co.friend.access.FriendDAO;

public class CollectionEx4 {
	public static void main(String[] args) {
		// 이름, 연락처를 출력하세요
		FriendDAO dao = new FriendDAO();
		Map<String, String> map = dao.getNameTel();
		Iterator<String> iter = map.keySet().iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			String val = map.get(key);
			System.out.println("이름 : " + key + "  |  전화번호 : " + val);
		}
		
	}
}
