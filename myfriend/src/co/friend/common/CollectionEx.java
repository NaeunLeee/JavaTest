package co.friend.common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/**
 * Collection -> List(interface) -> 구현 : ArrayList, Vector, LinkedList
 *			  -> Set(interface) -> 구현 : HashSet, TreeSet
 *
 * Set : 중복값을 걸러주는 인터페이스 (hashcode와 equals를 기준으로 중복검사)
 * 		 hascode와 equals의 값이 같으면 중복값으로 판단
 */


public class CollectionEx {
	public static void main(String[] args) {
		List<String> list = null;
//		list = new List<String>();
		list = new ArrayList<String>();
		list.add("Hong");
		list.add("Hong");
		list.add("Park");
		list.add("Choi");
		list.remove(0);
		
		System.out.println("<list>");
		for (int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Set<String> set = new HashSet();
		set.add("Hong");
		set.add("Hong");
		set.add("Park");
		set.add("Choi");
		
		Iterator<String> iter = set.iterator();				// set 요소를 하나씩 꺼내오기 위한 반복자 생성
		
		System.out.println("<set>");
		while (iter.hasNext()) {
			String value = iter.next();
			System.out.println(value);
		}
		
	}
}
