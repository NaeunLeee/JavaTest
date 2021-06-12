package com.yedam.common;

import java.util.List;
import java.util.stream.Stream;

import com.yedam.Employee;
import com.yedam.PersonDAO;

public class EmpExample {
	public static void main(String[] args) {
		List<Employee> list = null;
		PersonDAO dao = new PersonDAO();
		list = dao.getEmpList();
		Stream<Employee> empStream = list.stream();
		empStream.filter(t -> Integer.parseInt(t.getBirthDate().substring(0, 4))>1970)
				.forEach(t -> System.out.println(t.getFirstName()+", "+t.getLastName()+", "+t.getTitle()));
		

		
	}
}
