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
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class StMenu extends JFrame {

    
    public StMenu() {
        initComponents();
    }

    private void initComponents() {

        attendBtn = new JButton();
        viewScBtn = new JButton();
        UpdatePwBtn = new JButton();
        welcomeJlb = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("학생 메뉴");
        setVisible(true);

        attendBtn.setFont(new Font("굴림체", 0, 14)); // NOI18N
        attendBtn.setText("출석 체크");
        attendBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	attendBtnActionPerformed(evt);
            }
        });

        viewScBtn.setFont(new Font("굴림체", 0, 14)); // NOI18N
        viewScBtn.setText("성적 조회");
        viewScBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	viewScBtnActionPerformed(evt);
            }
        });

        UpdatePwBtn.setFont(new Font("굴림체", 0, 14)); // NOI18N
        UpdatePwBtn.setText("비밀번호 변경");
        UpdatePwBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	UpdatePwBtnActionPerformed(evt);
            }
        });

        welcomeJlb.setFont(new Font("굴림체", 1, 24)); // NOI18N
        welcomeJlb.setText("환영합니다!");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                        .addComponent(UpdatePwBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(viewScBtn, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(attendBtn, GroupLayout.PREFERRED_SIZE, 147, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(welcomeJlb)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(welcomeJlb)
                .addGap(18, 18, 18)
                .addComponent(attendBtn, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(viewScBtn, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UpdatePwBtn, GroupLayout.PREFERRED_SIZE, 47, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void attendBtnActionPerformed(ActionEvent evt) {                                         
        new Attend();
    }                                        

    private void viewScBtnActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void UpdatePwBtnActionPerformed(ActionEvent evt) {                                         
        // TODO add your handling code here:
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
            Logger.getLogger(StMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(StMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(StMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(StMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JButton attendBtn;
    private JButton viewScBtn;
    private JButton UpdatePwBtn;
    private JLabel welcomeJlb;
    // End of variables declaration                   
}

