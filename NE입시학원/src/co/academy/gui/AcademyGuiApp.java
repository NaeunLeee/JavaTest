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

public class AcademyGuiApp extends JFrame {

    
    public AcademyGuiApp() {
        initComponents();
    }

    private void initComponents() {

        JLabel mainTitle = new JLabel();
        JButton stLoginBtn = new JButton();
        JButton tcLoginBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("NE 입시학원");
        setVisible(true);
        

        mainTitle.setFont(new Font("맑은 고딕", 1, 18)); // NOI18N
        mainTitle.setText("♥ NE 입시학원 ♥");

        stLoginBtn.setText("원생 로그인");
        stLoginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                stLoginBtnActionPerformed(evt);
                setVisible(false);
            }
        });

        tcLoginBtn.setText("교사 로그인");
        tcLoginBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                tcLoginBtnActionPerformed(evt);
                setVisible(false);
            }
        });

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(mainTitle)
                    .addComponent(stLoginBtn, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE)
                    .addComponent(tcLoginBtn, GroupLayout.PREFERRED_SIZE, 119, GroupLayout.PREFERRED_SIZE))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addComponent(mainTitle, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(stLoginBtn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tcLoginBtn, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
        );

        pack();
    }                      

    private void stLoginBtnActionPerformed(ActionEvent evt) {                                           
        new StLogIn();
    }                                          

    private void tcLoginBtnActionPerformed(ActionEvent evt) {                                           
        new TcLogIn();
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
            Logger.getLogger(AcademyGuiApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(AcademyGuiApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(AcademyGuiApp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(AcademyGuiApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AcademyGuiApp().setVisible(true);
            }
        });
    }

    private JLabel mainTitle;
    private JButton stLoginBtn;
    private JButton tcLoginBtn;
}


