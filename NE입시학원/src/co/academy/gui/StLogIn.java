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
import javax.swing.LayoutStyle;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

import co.academy.access.AcademyAccess;
import co.academy.access.AcademyDAO;

public class StLogIn extends JFrame {

	AcademyAccess access = new AcademyDAO();
	int stLoginId;
	
    public StLogIn() {
        initComponents();
    }
                        
    private void initComponents() {

        stLoginJlb = new JLabel();
        stIDjlb = new JLabel();
        stPWjlb = new JLabel();
        stIDtxt = new JTextField();
        stPWtxt = new JTextField();
        enterBtn = new JButton();

        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("원생 로그인");
        setVisible(true);

        stLoginJlb.setFont(new Font("굴림", 1, 18));
        stLoginJlb.setText("원생 로그인");

        stIDjlb.setFont(new Font("굴림체", 1, 18));
        stIDjlb.setText("수강번호");

        stPWjlb.setFont(new Font("굴림체", 1, 18));
        stPWjlb.setText("비밀번호");

        stIDtxt.setText("");
        stPWtxt.setText("");

        enterBtn.setFont(new Font("굴림", 0, 18));
        enterBtn.setText("로그인");
        enterBtn.addActionListener(e -> stLogIn());

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(enterBtn)
                            .addComponent(stLoginJlb)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                            .addComponent(stPWjlb)
                            .addComponent(stIDjlb))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(stIDtxt, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE)
                            .addComponent(stPWtxt, GroupLayout.PREFERRED_SIZE, 146, GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(82, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(stLoginJlb, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(stIDjlb)
                    .addComponent(stIDtxt, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(stPWjlb)
                    .addComponent(stPWtxt, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(enterBtn)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    public static void main(String args[]) {
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(StLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(StLogIn.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(StLogIn.class.getName()).log(Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StLogIn().setVisible(true);
            }
        });
    }

    private void stLogIn() {
    	stLoginId = Integer.parseInt(stIDtxt.getText());
    	String stPW = stPWtxt.getText();
    	if (access.stLogIn(stLoginId, stPW)) {
    		new StMenu();
    		setVisible(false);
    	} else {
    		JOptionPane.showMessageDialog(null, "수강번호와 비밀번호를 다시 확인하세요");
    	}
    }
    
    // Variables declaration - do not modify                     
    private JButton enterBtn;
    private JLabel stIDjlb;
    private JTextField stIDtxt;
    private JLabel stLoginJlb;
    private JLabel stPWjlb;
    private JTextField stPWtxt;
}

