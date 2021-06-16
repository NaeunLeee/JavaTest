package co.academy.view;

import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import co.academy.access.AcademyDAO;
import co.academy.model.Student;

public class AcademyGui4 extends JFrame {
	
	JTextField txtStID, txtStPW, txtName, txtBirth, txtPhone, txtTcID, txtTcPW;
	JButton insertBtn, btnStLogIn, btnTcLogIn, btnAttend, btnStViewSc, btnUpdatePw, btnEnter, btnInsert, btnUpdate, btnDelete, btnPrintAll,
			btnFindByName, btnUpdateSc, btnViewSc, btnViewAt;
	TextArea txtList;
	Font font = new Font("맑은 고딕", Font.BOLD, 25);
	AcademyDAO access = new AcademyDAO();
	Date date = new Date();
	SimpleDateFormat sdf1 = new SimpleDateFormat("yy/MM/dd");
	SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
	
    JPanel jpanel = new JPanel();
//    JTextField t1 = new JTextField();
//    JTextField t2 = new JTextField();
//    JTextField t3 = new JTextField();
//    JTextField t4 = new JTextField();
    JTextArea ta = new JTextArea();
    JButton btn1, btn2, btn3, btn4, btn5;
    JLabel jlb1 = new JLabel("수강번호 : ");
    JLabel jlb2 = new JLabel("비밀번호 : ");
    JLabel jlb3 = new JLabel("이    름 : ");
    JLabel jlb4 = new JLabel("생년월일 : ");
    JLabel jlb5 = new JLabel("전화번호 : ");

   public AcademyGui4() {
	   signUp();
    }

   public void signUp() {
	   setTitle("NE ♥ 입시학원");
       setBounds(50, 50, 480, 450);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setVisible(true);
       setLayout(null);
       add(jpanel);

       txtStID.setBounds(75, 25, 70, 25);
       jpanel.add(txtStID);
       jlb1.setBounds(37, 21, 70, 30);
       jpanel.add(jlb1);

       txtStPW.setBounds(213, 25, 70, 25);
       jpanel.add(txtStPW);
       jlb2.setBounds(150, 21, 70, 30);
       jpanel.add(jlb2);

       txtName.setBounds(352, 25, 80, 25);
       jpanel.add(txtName);
       jlb3.setBounds(290, 21, 70, 30);
       jpanel.add(jlb3);

       txtBirth.setBounds(213, 105, 80, 25);
       jpanel.add(txtBirth);
       jlb4.setBounds(150, 100, 70, 30);
       jpanel.add(jlb4);
       
//       txtPhone.setBounds();
//       jpanel.add(txtPhone);
//       jlb5.setBounds();
//       jpanel.add(jlb5);

       JScrollPane jsp = new JScrollPane(ta);
       jsp.setBounds(23, 145, 420, 250);
       jpanel.add(jsp);

       jpanel.add(insertBtn = new JButton("등록"));
       insertBtn.setBounds(40, 60, 80, 30);

       jpanel.add(btn2 = new JButton("출력"));
       btn2.setBounds(145, 60, 80, 30);

       jpanel.add(btn3 = new JButton("수정"));
       btn3.setBounds(250, 60, 80, 30);

       jpanel.add(btn4 = new JButton("삭제"));
       btn4.setBounds(350, 60, 80, 30);

       jpanel.add(btn5 = new JButton("검색"));
       btn5.setBounds(300, 100, 80, 30);

       // 원생 등록
       btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                ta.setText("");
                int stID = Integer.parseInt(txtStID.getText());
                String stPW = txtStPW.getText();
                String name = txtName.getText();
                String birth = txtBirth.getText();
//                String phone = txtPhone.getText();
                String phone = "010-0000-0000";
                String grade = access.calGrade(birth);
                Student student = new Student(stID, stPW, name, birth, phone, grade);
                access.signUp(student);

                ta.append("입력 완료 \n");

                txtStID.setText("");
                txtStPW.setText("");
                txtName.setText("");
                txtBirth.setText("");
            }
        });

//        // 회원 목록 출력
//        btn2.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                ta.setText("");
//                ArrayList<Model> arr = new ArrayList<Model>();
//                arr = dao.readMember();
//
//                ta.append("\t" + "name" + "\t" + "birth" + "\t" + "tel\n");
//                ta.append("\t" + "------------------------------------------------------------\n");
//
//                for (int i = 0; i < arr.size(); i++) {
//                    ta.append("\t" + arr.get(i).getName() + " \t " + arr.get(i).getBirth() + " \t " + arr.get(i).getTel()
//                            + "\n");
//                }
//            }
//        });
//
//        // 회원 수정
//        btn3.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                ta.setText("");
//
//                String name = t1.getText();
//                String birth = t2.getText();
//                String tel = t3.getText();
//
//                dao.updateMember(name, tel);
//                ta.append("수정 완료 \n");
//
//                t1.setText("");
//                t2.setText("");
//                t3.setText("");
//                t4.setText("");
//            }
//        });
//
//        // 회원 삭제
//        btn4.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                ta.setText("");
//
//                String name = t1.getText();
//                dao.deleteMember(name);
//                ta.append("삭제 완료 \n");
//
//                t1.setText("");
//                t2.setText("");
//                t3.setText("");
//                t4.setText("");
//            }
//        });
//
//        // 회원 검색
//        btn5.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent arg0) {
//                ta.setText("");
//                String content = t4.getText();
//
//                ArrayList<Model> arr = new ArrayList<Model>();
//                arr = dao.searchMember(content);
//                ta.append(" \n");
//
//                ta.append("\t" + "name" + "\t" + "birth" + "\t" + "tel\n");
//                ta.append("\t" + "------------------------------------------------------------\n");
//
//                for (int i = 0; i < arr.size(); i++) {
//                    ta.append("\t" + arr.get(i).getName() + " \t " + arr.get(i).getBirth() + " \t " + arr.get(i).getTel()
//                            + "\n");
//                }
//
//                t1.setText("");
//                t2.setText("");
//                t3.setText("");
//                t4.setText("");
//            }
//        });
    }
}
