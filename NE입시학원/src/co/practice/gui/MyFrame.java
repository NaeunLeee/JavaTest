package co.practice.gui;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {
	
	public MyFrame() {
		// 크기 지정
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("프레임 작성예시");
		// 배치 관리자 설정
		setLayout(new FlowLayout());
		JButton button = new JButton("버튼");
		// 컴포넌트 생성 및 추가
		this.add(button);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}
