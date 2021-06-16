package co.academy.gui;

import java.awt.EventQueue;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.WindowConstants;

public class TcMenu extends JFrame {


    public TcMenu() {
        initComponents();
    }

    private void initComponents() {

        welcomJlb = new JLabel();
        signUpBtn = new JButton();
        updateBtn = new JButton();
        deleteBtn = new JButton();
        findBtn = new JButton();
        printAllBtn = new JButton();
        manageScBtn = new JButton();
        viewAtBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("교사 메뉴");
        setVisible(true);

        welcomJlb.setFont(new Font("굴림체", 1, 24)); // NOI18N
        welcomJlb.setText("환영합니다!");

        signUpBtn.setFont(new Font("맑은 고딕", 0, 14)); // NOI18N
        signUpBtn.setText("원생 등록");
        signUpBtn.addActionListener(e -> new SignUp());
        
        updateBtn.setFont(new Font("맑은 고딕", 0, 14)); // NOI18N
        updateBtn.setText("정보 수정");
        updateBtn.addActionListener(e -> new Update());

        deleteBtn.setFont(new Font("맑은 고딕", 0, 14)); // NOI18N
        deleteBtn.setText("원생 삭제");
        deleteBtn.addActionListener(e -> new Delete());

        findBtn.setFont(new Font("맑은 고딕", 0, 14)); // NOI18N
        findBtn.setText("원생 조회");
        findBtn.addActionListener(e -> new FindByName());

        printAllBtn.setFont(new Font("맑은 고딕", 0, 14)); // NOI18N
        printAllBtn.setText("전체 목록");

        manageScBtn.setFont(new Font("맑은 고딕", 0, 14)); // NOI18N
        manageScBtn.setText("성적 관리");

        viewAtBtn.setFont(new Font("맑은 고딕", 0, 14)); // NOI18N
        viewAtBtn.setText("출결 조회");

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(signUpBtn)
                            .addComponent(updateBtn)
                            .addComponent(deleteBtn))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                            .addComponent(findBtn)
                            .addComponent(printAllBtn)
                            .addComponent(manageScBtn)
                            .addComponent(viewAtBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(welcomJlb)))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(welcomJlb)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(signUpBtn)
                    .addComponent(findBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(updateBtn)
                    .addComponent(printAllBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(manageScBtn)
                    .addComponent(deleteBtn))
                .addGap(18, 18, 18)
                .addComponent(viewAtBtn)
                .addContainerGap(49, Short.MAX_VALUE))
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
            Logger.getLogger(TcMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(TcMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(TcMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(TcMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TcMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JButton deleteBtn;
    private JButton findBtn;
    private JButton manageScBtn;
    private JButton printAllBtn;
    private JButton signUpBtn;
    private JButton updateBtn;
    private JButton viewAtBtn;
    private JLabel welcomJlb;
    // End of variables declaration                   
}

