package com.yedam.lambda;

interface Run {
	void run();
}

class RunCls implements Run {
	public void run() {
		System.out.println("달립니다.");
	}
}

public class FunctionalEx1 {
	public static void main(String[] args) {
		RunCls cls = new RunCls();
		cls.run();
//		Run r = new Run() {
//			@Override
//			public void run() {				// Run이라는 클래스를 구현해주는 익명객체
//				System.out.println("빨리 달립니다.");
//			}
//		};
		Run r = () -> System.out.println("빨리 달립니다.");
		r.run();
	}

}
