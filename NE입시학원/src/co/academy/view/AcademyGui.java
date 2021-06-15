package co.academy.view;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.TextField;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import co.academy.access.AcademyDAO;

public class AcademyGui extends JFrame {
	
	TextField txtStID, txtStPW, txtTcID, txtTcPW, txtName, txtPhone;
	JButton btnStLogIn, btnTcLogIn, btnAttend, btnStViewSc, btnUpdatePw, btnEnter, btnInsert, btnUpdate, btnDelete, btnPrintAll,
			btnFindByName, btnUpdateSc, btnViewSc, btnViewAt;
	TextArea txtList;
	Font font = new Font("맑은 고딕", Font.BOLD, 25);
	AcademyDAO access = new AcademyDAO();
	Date date = new Date();
	SimpleDateFormat sdf1 = new SimpleDateFormat("yy/MM/dd");
	SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
	
	public AcademyGui() {
		setTitle("NE ♥ 입시학원");
		setSize(500, 500);
		setVisible(true);
		mainScreen();
		// 화면 중앙에 위치
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void mainScreen() {
		btnStLogIn = new JButton("원생 로그인");
		btnTcLogIn = new JButton("교사 로그인");
		btnStLogIn.setBounds(150, 130, 200, 70);
		btnStLogIn.setBackground(Color.white);
		btnStLogIn.setFont(font);
		btnTcLogIn.setBounds(150, 230, 200, 70);
		btnTcLogIn.setBackground(Color.white);
		btnTcLogIn.setFont(font);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(new Color(020, 120, 180));
        contentPane.setLayout(null);
        
        contentPane.add(btnStLogIn);
        contentPane.add(btnTcLogIn);

        btnStLogIn.addActionListener(e -> stLogIn());
        btnTcLogIn.addActionListener(e -> tcLogIn());
	}
	
	public void stLogIn() {
		setTitle("원생 로그인");
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(new Color(000,102,153));
		
		txtStID = new TextField(45);
        txtStPW = new TextField(45);
        
        btnEnter = new JButton("로그인");
        btnEnter.setBounds(150, 300, 200, 70);
        btnEnter.setBackground(Color.white);
        btnEnter.setFont(font);
        
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("수강번호"));
        contentPane.add(txtStID);
        contentPane.add(new JLabel("비밀번호"));
        contentPane.add(txtStPW);
        contentPane.add(btnEnter);
        
        boolean b = access.stLogIn(Integer.parseInt(txtStID.getText()), txtStPW.getText());
        if (b=true) {
        	stMenu();
        } else {
        	stLogIn();
        }
	}

	public void tcLogIn() {
		setTitle("교사 로그인");
		setSize(500, 500);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(new Color(000,102,153));
		
		txtTcID = new TextField(45);
        txtTcPW = new TextField(45);
        
        btnEnter = new JButton("로그인");
        btnEnter.setBounds(150, 300, 200, 70);
        btnEnter.setBackground(Color.white);
        btnEnter.setFont(font);
        
        contentPane.setLayout(new FlowLayout());
        contentPane.add(new JLabel("아이디"));
        contentPane.add(txtTcID);
        contentPane.add(new JLabel("비밀번호"));
        contentPane.add(txtTcPW);
        contentPane.add(btnEnter);
        
        boolean b = access.tcLogIn(txtTcID.getText(), txtTcPW.getText());
        if (b=true) {
        	tcMenu();
        } else {
        	tcLogIn();
        }
	}
	
	public void stMenu() {
		setTitle("환영합니다.");
		setSize(500, 500);
		setVisible(true);
		// 화면 중앙에 위치
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		btnAttend = new JButton("출석 체크");
		btnAttend.setBounds(150, 130, 200, 70);
		btnAttend.setBackground(Color.white);
		btnAttend.setFont(font);
		btnStViewSc = new JButton("성적 조회");
		btnStViewSc.setBounds(150, 230, 200, 70);
		btnStViewSc.setBackground(Color.white);
		btnStViewSc.setFont(font);
		btnUpdatePw = new JButton("비밀번호 변경");
		btnUpdatePw.setBounds(150, 130, 200, 70);
		btnUpdatePw.setBackground(Color.white);
		btnUpdatePw.setFont(font);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(new Color(020, 120, 180));
        contentPane.setLayout(null);
        
        contentPane.add(btnAttend);
        contentPane.add(btnStViewSc);
        contentPane.add(btnUpdatePw);
        
        btnAttend.addActionListener(e -> attend());
        btnStViewSc.addActionListener(e -> stViewScores());
        btnUpdatePw.addActionListener(e -> updatePw());
	}
	
	public void attend() {
		String d = sdf1.format(date);
		String t = sdf2.format(date);
		txtStPW = new TextField(45);
		Container contentPane = getContentPane();
		contentPane.add(new JLabel("비밀번호"));
		contentPane.add(txtStPW);
		boolean b = access.stLogIn(Integer.parseInt(txtStID.getText()), txtStPW.getText());
		if (b=true) {
			access.attendCheck(Integer.parseInt(txtStID.getText()), d, t);
		} else {
			
		}
	}
	
	public void stViewScores() {}
	
	public void updatePw() {}
	
	public void tcMenu() {}
	
	public void signUp() {}
	
	public void updatePhone() {}
	
	public void delete() {}
	
	public void printAll() {}
	
	public void findByName() {}
	
	public void manageScores() {}
	
	public void updateScores() {}
	
	public void tcViewScores() {}
	
	public void viewAttend() {}
	
	
	
	
	
	
	
}
