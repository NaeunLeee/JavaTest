package co.academy.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
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

public class Attend extends JFrame {

	AcademyAccess access = new AcademyDAO();
	Date date = new Date();
	SimpleDateFormat sdf1 = new SimpleDateFormat("yy/MM/dd");
	SimpleDateFormat sdf2 = new SimpleDateFormat("HH:mm:ss");
	int stLoginId;
	
    public Attend() {
        initComponents();
    }

    private void initComponents() {

        enterBtn = new JButton();
        attendJlb = new JLabel();
        stPWjlb = new JLabel();
        stPWtxt = new JTextField();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("출석 체크");
        setVisible(true);
        
        enterBtn.setFont(new Font("굴림", 0, 18)); // NOI18N
        enterBtn.setText("입력");
        enterBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        attendJlb.setFont(new Font("굴림", 1, 24)); // NOI18N
        attendJlb.setText("출석 체크");

        stPWjlb.setFont(new Font("굴림체", 1, 18)); // NOI18N
        stPWjlb.setText("비밀번호");

        stPWtxt.setText("");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(enterBtn)
                            .addComponent(attendJlb)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(stPWjlb)
                        .addGap(18, 18, 18)
                        .addComponent(stPWtxt, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(attendJlb)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                    .addComponent(stPWjlb)
                    .addComponent(stPWtxt, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(enterBtn)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void enterBtnActionPerformed(ActionEvent evt) {                                         
        attend();
    }                                        

    private void attend() {
		String d = sdf1.format(date);
		String t = sdf2.format(date);
		String pw = stPWtxt.getText();
		if (access.stLogIn(stLoginId, pw)) {
			access.attendCheck(stLoginId, d, t);
		} else {
			JOptionPane.showMessageDialog(null, "비밀번호를 다시 확인하세요");
		}
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
            Logger.getLogger(Attend.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Attend.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Attend.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Attend.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Attend().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JLabel attendJlb;
    private JButton enterBtn;
    private JLabel stPWjlb;
    private JTextField stPWtxt;
    // End of variables declaration                   
}

