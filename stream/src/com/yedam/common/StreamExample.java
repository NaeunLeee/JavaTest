package com.yedam.common;

import java.util.List;
import java.util.OptionalDouble;

import com.yedam.Person;
import com.yedam.PersonDAO;

public class StreamExample {

	public static void main(String[] args) {
		// 1. 스트림 2. 중간처리/최종처리 3. 결과
		List<Person> list = null;
		PersonDAO dao = new PersonDAO();
		list = dao.getPersonList();
		OptionalDouble avg = list.stream()
								 .filter(t -> t.getAge()%2==0)
//								 .filter(t -> t.getId()>900)
								 .mapToInt(p -> p.getAge())
								 //.forEach(v -> System.out.println(v));
								 .average();
		if (avg.isPresent()) {
			System.out.println("평균나이 : " + avg.getAsDouble());
		} else {
			System.out.println("만족하는 요소가 없습니다.");
		}
	}

}
