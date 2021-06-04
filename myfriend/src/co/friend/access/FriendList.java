package co.friend.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import co.friend.model.Friend;

public class FriendList implements FriendAccess{
	ArrayList<Friend> friends;

	public FriendList() {
		friends = new ArrayList<Friend>();
		open();
	}
	public void insert(Friend friend) {
		friends.add(friend);
		save();
	}
	public void update(Friend friend) {
		for (Friend f : friends) {
			if (f.getName().equals(friend.getName())) {
				f.setTel(friend.getTel());
				save();
			}
		}
	}
	public void delete(String name) {
		for (Friend f : friends) {
			if (f.getName().equals(name)) {
				friends.remove(f);
				save();
				break;
			}
		}
	}
	public ArrayList<Friend> selectAll() {
		return friends;
	}
	public Friend selectOne(String name) {
		for (Friend f : friends) {
			if (f.getName().equals(name)) {		// 같은 이름이 있는지를 찾을때는 equals, 특정 단어를 포함하는지를 찾을때는 contains, 그외 startsWith 등 사용
				return f;
			}
		}
		return null;
	}
	public Friend findTel(String tel) {
		for (Friend f : friends) {
			if (f.getTel().contains(tel)) {	
				return f;
			}
		}
		return null;
	}
	
	// open과 save
	String path = "d:/temp/friend.txt";
	public void open() {
		try {
			Scanner scanner = new Scanner(new File(path));
			while (true) {
				if (! scanner.hasNext()) break;
				String str = scanner.nextLine();
				String[] arr = str.split(",");
				friends.add(new Friend(arr[0],arr[1],arr[2]));						
			}
			scanner.close();
		} catch (Exception e) {
			System.out.println("오류");
		}
	}
	public void save() {
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(path));
			for (Friend f : friends) {
				fw.write(String.format("%s, %s, %s\n", f.getGubun(), f.getName(), f.getTel()));
			}
			fw.close();
		} catch (Exception e) {
			System.out.println("오류");
		}
	}

}
