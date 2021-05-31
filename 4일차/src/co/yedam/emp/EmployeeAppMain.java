package co.yedam.emp;

import java.util.Scanner;

public class EmployeeAppMain {

	public static void main(String[] args) {
		EmployeeApp app = new EmployeeApp();
		Scanner scanner = new Scanner(System.in);
		boolean run = true;
		while (run) {
			int no = 0;
			System.out.println("1. 사원 수 | 2. 사원정보입력 | 3. 사원리스트 | 4. 검색 | 5. 급여합계 | 6. 종료");
			System.out.print("선택 > ");
			no = scanner.nextInt();
			if (no==1) {
				app.empNum();
			}
			else if (no==2) {
				app.empInfo();
			}
			else if (no==3) {
				app.empList();
			}
			else if (no==4) {
				app.empSearch();
			}
			else if (no==5) {
				app.salarySum();
			}
			else {
				run = false;
			}
		}
	}

}
