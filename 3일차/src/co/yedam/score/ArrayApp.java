package co.yedam.score;

public class ArrayApp {

	int[] arr = new int[10];
	
	void init() {
		for (int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
	}
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
	int max() {
		int max = 0;
		for (int i=0; i<arr.length; i++) {
			if (arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

	public static void main(String[] args) {

		ArrayApp app = new ArrayApp();
		app.init();
		app.print();
		System.out.println("합계 : "+app.total());
		System.out.println("최대값 : "+app.max());

	}
}
