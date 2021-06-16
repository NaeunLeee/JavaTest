package co.academy.gui;

import java.awt.EventQueue;
import java.awt.Font;
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


public class Delete extends JFrame {

	AcademyAccess access = new AcademyDAO();
	
    public Delete() {
        initComponents();
    }

    private void initComponents() {

        deleteJlb = new JLabel();
        stIdJlb = new JLabel();
        stIDtxt = new JTextField();
        deleteBtn = new JButton();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        deleteJlb.setFont(new Font("굴림", 1, 18)); // NOI18N
        deleteJlb.setText("원생 정보 삭제");

        stIdJlb.setFont(new Font("굴림", 0, 14)); // NOI18N
        stIdJlb.setText("수강번호");

        deleteBtn.setFont(new Font("굴림", 0, 14)); // NOI18N
        deleteBtn.setText("삭제");
        deleteBtn.addActionListener(e -> delete());

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(stIdJlb)
                        .addGap(18, 18, 18)
                        .addComponent(stIDtxt, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(deleteJlb)))
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(deleteJlb)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                    .addComponent(deleteBtn)
                    .addComponent(stIDtxt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(stIdJlb))
                .addContainerGap(119, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    
    public void delete() {
    	access.delete(Integer.parseInt(stIDtxt.getText()));
    	JOptionPane.showMessageDialog(null, "삭제가 완료되었습니다.");
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
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Delete.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Delete().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private JButton deleteBtn;
    private JLabel deleteJlb;
    private JTextField stIDtxt;
    private JLabel stIdJlb;
    // End of variables declaration                   
}

