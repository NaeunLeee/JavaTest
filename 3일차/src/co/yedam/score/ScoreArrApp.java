package co.yedam.score;

// 1. 클래스 설계도 (UML)

// 2. 클래스 선언

// 3. new 객체 생성

// 4. 객체 이용 (메서드 호출)



public class ScoreArrApp {

	int a=10;
	int[] arr = {90, 80, 50};
	
	void print() {
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	int total() {
		int result = 0;
		for (int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
	double avg() {
		double result = 0;
		result = total()/(double)arr.length;
		return result;
	}
	void printH() {
		System.out.printf("%13s\n국어:%-6d영어:%-6d수학:%-6d\n", "홍길동성적", arr[0], arr[1], arr[2]);
	}
}
