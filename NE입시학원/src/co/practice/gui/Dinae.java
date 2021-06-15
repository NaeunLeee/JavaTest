package co.practice.gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Dinae extends JFrame {
	 
    public Dinae() {
 
        super("창1"); //타이틀
        JPanel jPanel = new JPanel();
        JButton btn1 = new JButton("창 2");
        setSize(300, 200); //창 크기 설정
        jPanel.add(btn1);
        add(jPanel);
 
        Dimension frameSize = getSize();
 
        Dimension windowSize = Toolkit.getDefaultToolkit().getScreenSize();
        setLocation((windowSize.width - frameSize.width) / 2,
                (windowSize.height - frameSize.height) / 2); //화면 중앙에 띄우기
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
 
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Part1();
                setVisible(false); // 창 안보이게 하기 
            }
        });
    }
    
    public static void main(String[] args) {
        new Dinae();
    }
}

