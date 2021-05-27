package co.yedam.app.gugudan;

import java.util.Scanner;

public class GugudanApp {
	// 입력받은 단만 출력
	void printDan(int dan) {
		for (int i=1; i<=9; i++) {
			System.out.print(dan+"*"+i+"="+dan*i + "\t");
		}
		System.out.println();
	}
	void printRange(int s, int e) {
		for (int i=s; i<=e; i++) {
			for (int j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
		System.out.println();
		}
	}
	void printAll() {
		for (int i=1; i<=9; i++) {
			for (int j=1; j<=9; j++) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
		}
		System.out.println();
	}
	void printAllReverse() {
		for (int i=9; i>=1; i--) {
			for (int j=9; j>=1; j--) {
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
		}
		System.out.println();
	}
}

