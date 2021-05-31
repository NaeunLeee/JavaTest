package co.yedam.emp;

import java.util.Scanner;

public class EmployeeApp {
	Employee[] employee = new Employee[10];
	int cnt = 0;
	int employeeId;
	String name;
	int salary;
	Scanner scanner = new Scanner(System.in);
	
//	public void insert(int employeeId, String name, int departmentId, int salary, String email) {
//		employee[cnt++] = new Employee(employeeId, name, departmentId, salary, email);
//	}
		
	// 1. 사원 수
	public void empNum() {
		System.out.print("사원 수 입력 > ");
		cnt = scanner.nextInt();
	}
	
	// 2. 사원 정보 입력
	public void empInfo() {
		for (int i=0; i<cnt; i++) {
			System.out.printf("%d 사번 > ", i);
			employeeId = scanner.nextInt();
			System.out.print("이름 > ");
			name = scanner.next();
			System.out.print("급여 > ");
			salary = scanner.nextInt();
		}
	}
	
	// 3. 사원 리스트
	public void empList() {
		for (int i=0; i<cnt; i++) {
			System.out.println(employee[i]);
		}
	}
	
	// 4. 검색
	public void empSearch() {
		int selectNo = 0;
		System.out.println("검색할 사번 > ");
		selectNo = scanner.nextInt();
		for (int i=0; i<cnt; i++) {
			System.out.println("이름 : " + employee[selectNo].name);
			System.out.println("급여 : " + employee[selectNo].salary);
		}
	}
	
	// 5. 급여 합계
	public void salarySum() {
		int total = 0;
		for (int i=0; i<cnt; i++) {
			total += employee[i].salary;
		}
		System.out.println("총 급여 : " + total);
	}
	
	
}
