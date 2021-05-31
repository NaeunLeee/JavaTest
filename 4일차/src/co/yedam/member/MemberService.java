package co.yedam.member;

import java.util.Scanner;

public class MemberService {
	Member[] members = new Member[10];
	int cnt = 0;
	Scanner scanner = new Scanner(System.in);
	
	// 회원가입
	void insert(String name, String id, String password, int age) {
		members[cnt] = new Member(name, password, id, age);
		cnt++;
	}
	// 1. 입력받아 등록
	void insert() {
		System.out.print("ID > ");
		String id = scanner.next();
		System.out.print("이름 > ");
		String name = scanner.next();
		System.out.print("Password > ");
		String password = scanner.next();
		System.out.print("나이 > ");
		int age = scanner.nextInt();
		members[cnt] = new Member(name, id, password, age);
	}
	// 2. 회원리스트 전체 조회
	void printList() {
		for (int i=0; i<members.length; i++) {
			System.out.println(members[i]);
		}
		
	}
	// 3. 번호로 조회
	void printMember() {
		System.out.print("번호 입력 > ");
		int i = scanner.nextInt();
		System.out.println("이름 : " + members[i].name);
		System.out.println("ID : " + members[i].id);
		System.out.println("나이 : " + members[i].age);
	}
	// 4. 로그인
//	boolean login() {
//		System.out.print("ID > ");
//		String id = scanner.next();
//		System.out.print("Password > ");
//		String password = scanner.next();
//		boolean result = false;
//		for (int i=0; i<cnt; i++) {
//			if (id.equals(members[i].id) & password.equals(members[i].password)) {
//				result = true;
//				System.out.println("로그인 되었습니다.");
//				break;
//				}
//			else {
//				System.out.println("등록되지 않은 ID와 PW입니다.");
//				}
//			}
//		return result;
//	}
	void login() {
		System.out.println("ID > ");
		String id = scanner.next();
		System.out.println("Password > ");
		String password = scanner.next();
		for (int i=0; i<members.length; i++) {
			if (id.equals(members[i].id) & password.equals(members[i].password)) {
				System.out.println("로그인 되었습니다.");
				break;
			}
			else {
				System.out.println("등록되지 않은 ID와 PW입니다.");
			}
		}
	}
	
	// 5. ID로 조회
	void search() {
		System.out.println("ID를 입력하세요 > ");
		String id = scanner.next();
		for (int i=0; i<members.length; i++) {
			if (id.equals(members[i].id)) {
				System.out.println("이름 : " + members[i].name);
				System.out.println("나이 : " + members[i].age);
			}
		}
	}
	
	void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
}
