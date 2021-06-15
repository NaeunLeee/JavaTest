package co.practice.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ContentPaneEx extends JFrame {

	public ContentPaneEx() {
		// 프레임 타이틀
		setTitle("이나은바보똥깨");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
        Container contentPane = getContentPane(); // 컨텐트팬 알아내기
        contentPane.setBackground(new Color(050,120,180)); // 배경색
        contentPane.setLayout(null); // 컨텐트팬에 FlowLayout 배치관리자 달기
        
//        contentPane.add(new JButton("OK")); // OK버튼
//        contentPane.add(new JButton("Cancel")); // Cancel 버튼
//        contentPane.add(new JButton("Ignore")); // Ignore 버튼
        JButton btn1 = new JButton("원생 로그인");
        JButton btn2 = new JButton("교사 로그인");
        Font font = new Font("맑은 고딕", Font.BOLD, 25);
        btn1.setBounds(150, 130, 200, 70);
        btn1.setBackground(Color.white);
        btn1.setFont(font);
        btn2.setBounds(150, 230, 200, 70);
        btn2.setBackground(Color.white);
        btn2.setFont(font);
        contentPane.add(btn1);
        contentPane.add(btn2);
        setSize(500, 500); // 프레임 크기 300 x 150
        setVisible(true); // 화면에 프레임 출력
        
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Part1();
                setVisible(false); // 창 안보이게 하기 
            }
        });
	}
	
	
	public static void main(String[] args) {
		new ContentPaneEx();
	}

}
