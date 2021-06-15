package co.practice.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ButtonPractice extends JFrame {

	TextField txtStID, txtStPW, txtTcID, txtTcPW, txtName, txtPhone;
	JButton btnStLogIn, btnTcLogIn, btnEnter, btnInsert, btnUpdate, btnDelete, btnPrintAll,
			btnFindByName, btnUpdateSc, btnViewSc, btnViewAt;
	TextArea txtList;
	Font font = new Font("맑은 고딕", Font.BOLD, 25);
	
	public void stLogIn() {
		setTitle("원생 로그인");
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(new Color(000,102,153));
		contentPane.setLayout(null);
		
		txtStID = new TextField(45);
        txtStPW = new TextField(45);
        txtList = new TextArea(12,50);
        btnEnter = new JButton("로그인");
        btnEnter.setBounds(150, 300, 200, 70);
        btnEnter.setBackground(Color.white);
        btnEnter.setFont(font);
        
        
        contentPane.add(new JLabel("수강번호"));
        contentPane.add(txtStID);
        contentPane.add(new JLabel("비밀번호"));
        contentPane.add(txtStPW);
        contentPane.add(txtList);
        contentPane.add(btnEnter);
        
	}
	

}
