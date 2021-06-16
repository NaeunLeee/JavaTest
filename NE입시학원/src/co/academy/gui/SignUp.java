package co.academy.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import co.academy.access.AcademyAccess;
import co.academy.access.AcademyDAO;
import co.academy.model.Student;

public class SignUp extends JFrame {

	AcademyAccess access = new AcademyDAO();
	
    public SignUp() {
        initComponents();
    }

    private void initComponents() {

        signUpJlb = new JLabel();
        stIdJlb = new JLabel();
        stPwJlb = new JLabel();
        nameJlb = new JLabel();
        birthJlb = new JLabel();
        phoneJlb = new JLabel();
        stIDtxt = new JTextField();
        stPWtxt = new JTextField();
        nameTxt = new JTextField();
        birthTxt = new JTextField();
        phoneTxt = new JTextField();
        insertBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        signUpJlb.setFont(new Font("굴림", 1, 18)); // NOI18N
        signUpJlb.setText("새로운 원생 등록");
        stIdJlb.setText("수강번호");
        stPwJlb.setText("비밀번호");
        nameJlb.setText("이    름");
        birthJlb.setText("생년월일");
        phoneJlb.setText("전화번호");
        insertBtn.setText("등록");
        insertBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	insertBtnActionPerformed(evt);
            }
        });
        
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(signUpJlb)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(stIdJlb)
                            .addComponent(stPwJlb)
                            .addComponent(nameJlb)
                            .addComponent(birthJlb)
                            .addComponent(phoneJlb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(stIDtxt, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                            .addComponent(stPWtxt, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthTxt, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneTxt, GroupLayout.PREFERRED_SIZE, 152, GroupLayout.PREFERRED_SIZE))))
                .addGap(27, 27, 27)
                .addComponent(insertBtn)
                .addGap(48, 48, 48))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(signUpJlb)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(stIdJlb)
                            .addComponent(stIDtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(stPWtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(stPwJlb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameJlb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(birthTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(birthJlb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(phoneTxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneJlb)))
                    .addComponent(insertBtn, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );

        pack();
    }// </editor-fold>                        

    private void insertBtnActionPerformed(ActionEvent evt) {                                         
    	signUp();
    } 
    
    private void signUp() {
    	int id = Integer.parseInt(stIDtxt.getText());
    	String pw = stPWtxt.getText();
    	String name = nameTxt.getText();
    	String birth = birthTxt.getText();
    	String phone = phoneTxt.getText();
    	String grade = access.calGrade(birth);
		Student student = new Student(id, pw, name, birth, phone, grade);
		access.signUp(student);
		JOptionPane.showMessageDialog(null, "등록이 완료되었습니다.");
    }
    
    
    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JLabel birthJlb;
    private JTextField birthTxt;
    private JButton insertBtn;
    private JLabel nameJlb;
    private JTextField nameTxt;
    private JLabel phoneJlb;
    private JTextField phoneTxt;
    private JLabel signUpJlb;
    private JTextField stIDtxt;
    private JLabel stIdJlb;
    private JTextField stPWtxt;
    private JLabel stPwJlb;
    // End of variables declaration                   
}

