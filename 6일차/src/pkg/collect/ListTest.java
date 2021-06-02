package pkg.collect;

import java.util.ArrayList;
import java.util.LinkedList;

import pkg.Friend;
import pkg.friend.CompanyFriend;
import pkg.friend.SchoolFriend;

public class ListTest {
	public static void main(String[] args) {
		LinkedList<Friend> list = new LinkedList<Friend>();
		list.add(new Friend("현대", "홍", "1111"));
		list.add(0, new CompanyFriend("삼성", "김", "2222"));
		list.add(1, new SchoolFriend("영신", "박", "3333"));
		for (Friend f : list) {
			System.out.println(f.getName());
		}
		System.out.println("==============");
		list.remove(1);
		for (Friend f : list) {
			System.out.println(f.getName());
		}
		Friend fr = list.get(0);
		System.out.println("첫 번재 이름 : " + fr.getName());
		System.out.println("마지막 이름 : " + list.get(list.size()-1).getName());
		// 수정
		list.set(1, new Friend("중학교", "최", "5555"));
		for (Friend f : list) {
			System.out.println(f.getName());
		}
		
	}
	
}
