package co.yedam.score2;

public class ScoreArrApp2 {
				// 국어 영어 수학 사회
	int[][] arr = {{100, 90, 80, 40},
				   {10, 20},
				   {50, 50, 50},
				   {30, 30, 30}	};
	void print() {
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
		}
		System.out.println();
	}
	// 입력한 번호에 해당하는 학생의 총점
	int stdTotal(int no) {
		int result = 0;
		for (int i=0; i<arr[no].length; i++) {
			result += arr[no][i];
		}
		return result;
	}
	// 해당 학생의 총 과목 수
	int getSbjCnt(int no) {
		return arr[no].length;
	}
	
	
	// 전체 총점
	int total() {
		int result = 0;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr[i].length; j++) {
				result += arr[i][j];
			}
		}
		return result;
	}
	
	
}
