package co.academy.view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AcademyGui3 extends JFrame {

	JPanel mainPanel = new JPanel(new GridLayout(3, 2));
	JPanel loginPanel = new JPanel();
	JTextField jtf = new JTextField();

	
	public AcademyGui3() {
		super("학원 관리 시스템");
		mainScreen();
	}
	
	public void mainScreen() {
		this.setContentPane(mainPanel);
		setSize(350,150);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel title = new JLabel("NE ♥ 입시학원");
		title.setHorizontalAlignment(NORMAL);
		
		JButton stLoginBtn = new JButton("원생 로그인");
		JButton tcLoginBtn = new JButton("교사 로그인");
		
		mainPanel.add(title);
		mainPanel.add(stLoginBtn);
		mainPanel.add(tcLoginBtn);
	}
	
	
	
	
}
