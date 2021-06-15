package co.practice.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class InnerClassListener extends JFrame{
    
    public InnerClassListener() {
        setTitle("InnerClassListener 예제");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        JButton btn = new JButton("Action");
        btn.addActionListener(new MyActionListener());
        
        c.add(btn);
        setSize(300, 200);
        setVisible(true);
    }
    
    private class MyActionListener implements ActionListener {
 
        @Override
        public void actionPerformed(ActionEvent e) {
            JButton b = (JButton)e.getSource();
            if(b.getText().equals("Action")) {
                b.setText("액션");
            } else b.setText("Action");
            
            
            //InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
            InnerClassListener.this.setTitle(b.getText());
        }
        
    }
 
    
    public static void main(String[] args) {
        new InnerClassListener();
 
    }
 
}
