package co.academy.gui;

import java.awt.Dimension;
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
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import co.academy.access.AcademyAccess;
import co.academy.access.AcademyDAO;

public class TcLogIn extends JFrame {

	AcademyAccess access = new AcademyDAO();
	String tcLoginId;
	
    public TcLogIn() {
        initComponents();
    }

    private void initComponents() {

        tcLoginJlb = new JLabel();
        tcIDjlb = new JLabel();
        tcPWjlb = new JLabel();
        tcIDtxt = new JTextField();
        tcPWtxt = new JTextField();
        enterBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("교사 로그인");
        setPreferredSize(new Dimension(400, 300));
        setVisible(true);

        tcLoginJlb.setFont(new Font("굴림체", 1, 18)); // NOI18N
        tcLoginJlb.setText("교사 로그인");

        tcIDjlb.setFont(new Font("굴림체", 1, 18)); // NOI18N
        tcIDjlb.setText("아이디");

        tcPWjlb.setFont(new Font("굴림체", 1, 18)); // NOI18N
        tcPWjlb.setText("비밀번호");

        tcIDtxt.setText("");
        tcPWtxt.setText("");

        enterBtn.setFont(new Font("굴림", 0, 18)); // NOI18N
        enterBtn.setText("로그인");
        enterBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                enterBtnActionPerformed(evt);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(enterBtn)
                            .addComponent(tcLoginJlb, GroupLayout.PREFERRED_SIZE, 105, GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(tcPWjlb)
                            .addComponent(tcIDjlb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(tcIDtxt, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                            .addComponent(tcPWtxt, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(tcLoginJlb, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(tcIDtxt, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcIDjlb))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(tcPWjlb, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tcPWtxt, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addComponent(enterBtn)
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        


    private void enterBtnActionPerformed(ActionEvent evt) {                                         
    	tcLogIn();
    } 

    private void tcLogIn() {
    	tcLoginId = tcIDtxt.getText();
    	String tcPW = tcPWtxt.getText();
    	if (access.tcLogIn(tcLoginId, tcPW)) {
    		new TcMenu();
    		setVisible(false);
    	} else {
    		JOptionPane.showMessageDialog(null, "아이디와 비밀번호를 다시 확인하세요");
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
            Logger.getLogger(TcLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TcLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TcLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TcLogIn.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TcLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JButton enterBtn;
    private JLabel tcIDjlb;
    private JTextField tcIDtxt;
    private JLabel tcLoginJlb;
    private JLabel tcPWjlb;
    private JTextField tcPWtxt;
    // End of variables declaration                   
}

