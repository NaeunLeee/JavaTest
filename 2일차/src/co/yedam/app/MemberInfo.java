package co.yedam.app;

import java.util.Scanner;

public class MemberInfo {
	
	String name;
	String id;
	String tel;
	double height;
	double weight;
	double result = 0;
	String s = "";
	Scanner scanner = new Scanner(System.in);

	void heightWeightInput() {
		System.out.print("키(cm) : ");
		height = scanner.nextDouble();
		System.out.print("몸무게(kg) : ");
		weight = scanner.nextDouble();
	}
	String bmi() {
		result = weight/((height/100)*(height/100));
		if (result<=18.5) {
			s = "저체중";
		}
		else if (result>18.5 && result<=23) {
			s = "정상";
		}
		else if (result>23 && result<=25) {
			s = "과체중";
		}
		else if (result>25 && result<=30) {
			s = "비만";
		}
		else {
			s = "고도비만";
		}
		return s;
	}
	
	void input() {
		// 코드 작성
		System.out.print("1. 이름 : ");
		name = scanner.next();
		System.out.print("2. 주민번호 앞 6자리 : ");
		id = scanner.next();
		System.out.print("3. 전화번호 : ");
		tel = scanner.next();
	}				// 중괄호가 닫히는 것은 return을 해주는 것과 마찬가지
	void print() {
		System.out.println("이름 : " + name);
		System.out.println("주민번호 앞 6자리 : " + id);
		System.out.println("전화번호 : " + tel);
	}
	
}
