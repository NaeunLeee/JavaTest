package com.yedam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class PersonDAO {

	static PreparedStatement psmt;
	static ResultSet rs;
	static Connection conn;
	
	
	// 전체리스트 (Person)
	public ArrayList<Person> getPersonList() {
		ArrayList<Person> personList = new ArrayList<>();
		connect();		// Connection 객체 연결
		String sql = "select * from person";
		try {
			psmt = conn.prepareStatement(sql);		
			rs = psmt.executeQuery();				
			while (rs.next()) {
				Person person = new Person();
				person.setId(rs.getInt("id"));
				person.setAge(rs.getInt("age"));
				person.setPhone(rs.getString("phone"));
				personList.add(person);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return personList;
	}
	
	// 전체리스트 (Employee)
	public ArrayList<Employee> getEmpList() {
		ArrayList<Employee> empList = new ArrayList<>();
		connect();		// Connection 객체 연결
		String sql = "select * from employees e";
		try {
			psmt = conn.prepareStatement(sql);		
			rs = psmt.executeQuery();				
			while (rs.next()) {
				Employee emp = new Employee();
				emp.setLastName(rs.getString("lastName"));
				emp.setFirstName(rs.getString("firstName"));
				emp.setBirthDate(rs.getString("birthDate"));
				emp.setTitle(rs.getString("title"));
				empList.add(emp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}
		return empList;
	}
	
	
	// connection
	public static void connect() {
//		String url = "jdbc:sqlite:C:/sqlite/db/sample.db";
		String url = "jdbc:sqlite:C:/sqlite/db/chinook.db";
		try {
			conn = DriverManager.getConnection(url);
			System.out.println("☆★☆★연결 성공★☆★☆");
		} catch (SQLException e) {
			System.out.println("=== 연결 실패 ===");
		}
	}
	
	// close
	public static void close() {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(psmt!=null) {
			try {
				psmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if(conn!=null) {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}



