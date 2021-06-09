package co.friend.common;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import co.friend.model.Friend;

public class CollectionEx3 {
	public static void main(String[] args) {
		Map<String, Friend> map = new HashMap<>();
		map.put("반장", new Friend("1반", "홍길동", "010-1111-2222"));
		map.put("평범", new Friend("1반", "홍평범", "010-2222-3333"));
		map.put("선생님", new Friend("1반", "홍두깨", "010-3333-4444"));
		map.put("반장", new Friend("1반", "박길동", "010-2222-4444"));
		
//		System.out.println(map.get("선생님"));
		
		Set<String> keys = map.keySet();		// keySet : key값을 가지고 와서 set 컬렉션에 담음
		Iterator<String> iter = keys.iterator();
		while (iter.hasNext()) {
			String key = iter.next();
			Friend val = map.get(key);
			System.out.println("key : " + key + ", value : " + val.toString());
		}
		
		System.out.println("============================================================");
		
		// Friend : key, Integer : value
		Map<Friend, Integer> scores = new HashMap<>();
		scores.put(new Friend("1반", "홍길동", "010-1111-2222"), 80);
		scores.put(new Friend("1반", "정인영", "010-2222-3333"), 90);
		scores.put(new Friend("1반", "김효진", "010-3333-4444"), 89);
		scores.put(new Friend("1반", "윤지민", "010-4444-5555"), 91);
		scores.put(new Friend("1반", "홍길동", "010-1111-2222"), 85);
		
		Set<Entry<Friend, Integer>> ent = scores.entrySet();				// entry : key와 value 한쌍
		Iterator<Entry<Friend, Integer>> eiter = ent.iterator();
		while (eiter.hasNext()) {
			Entry<Friend, Integer> e = eiter.next();
			System.out.println(e.getKey() + ", " + e.getValue());
		}
		
	}
}
