package pkg.friend;

import java.util.ArrayList;
import java.util.List;

import pkg.Friend;

public class FriendList implements FriendAccess{
	ArrayList<Friend> friends;

	public FriendList() {
		friends = new ArrayList<Friend>();
	}
	public void insert(Friend friend) {
		friends.add(friend);
	}
	public void update(Friend friend) {
		
	}
	public void delete(String name) {
		
	}
	public List selectAll() {
		System.out.println("FriendList");
		return null;
	}
	public Friend selectOne(String name) {
		for (Friend f : friends) {
			if (f.getName().equals(name)) {		// 같은 이름이 있는지를 찾을때는 equals, 특정 단어를 포함하는지를 찾을때는 contains, 그외 startsWith 등 사용
				return f;
			}
		}
		return null;
	}

}
