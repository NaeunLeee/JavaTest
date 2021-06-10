package com.yedam.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

import com.yedam.Person;
import com.yedam.PersonDAO;

public class IteratorExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hong", "Park", "Choi");
		Iterator<String> iter = list.iterator();		// 반복된 요소를 지정, 사용하기 위해서 반복자 선언
		while (iter.hasNext()) {
			String val = iter.next();
			System.out.println(val.toUpperCase());
		}
		
		// 위에서 한 것들을 간략하게 하기 위해 Stream 사용
		System.out.println("<stream>");
		Stream<String> stream = list.stream();
		stream.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});
		
		// sample 요소를 database에서 갖고 오도록
		PersonDAO dao = new PersonDAO();
		ArrayList<Person> persons = dao.getPersonList();
		Stream<Person> pStream = persons.stream();
//		pStream.filter(new Predicate<Person>() {
//			public boolean test(Person t) {
//				return t.getAge() > 20;		// return값이 true인 요소만 통과되도록
//			}}).forEach((t) -> System.out.println(t.toString()));
		
		// 위 식을 람다식으로 바꾸면
//		pStream.filter((t) -> t.getAge() > 20)
//			   .forEach((t) -> System.out.println(t.toString()));
		
		// 필터 추가 : 매개값(t)을 받아와서 '->' 뒤의 것을 실행함
		long cnt = pStream.filter((t) -> t.getAge() > 20)
						  .filter((t) -> t.getName().startsWith("이"))
						  //.forEach((t) -> System.out.println(t.toString()));
						  .count();
		System.out.println("최종처리 건수 : " + cnt);
		
	}
}
