package co.academy.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class AcademyGui2 extends JFrame {

	Container contentPane;
	
	public AcademyGui2() {
		setTitle("NE ♥ 입시학원");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		setSize(600,600);
		contentPane.add(new MyPanel(), BorderLayout.CENTER);
		setVisible(true);
	}
	
	class MyPanel extends Panel {
		JButton stLogInBtn = new JButton("원생 로그인");
		JButton tcLogInBtn = new JButton("교사 로그인");
		JTextField tf = new JTextField(10);
		
		MyPanel() {
			setBackground(new Color(020, 120, 180));
			add(stLogInBtn);
			add(tcLogInBtn);
			stLogInBtn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					String stID = JOptionPane.showInputDialog("수강번호");
					add(tf);
					if (stID != null) {
						tf.setText(stID);
					}
					String stPW = JOptionPane.showInputDialog("비밀번호");
					add(tf);
					if (stPW != null) {
						tf.setText(stPW);
					}
				}
			});
			
			
			
			
		}
		
		
	}
	
}
