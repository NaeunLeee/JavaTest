package co.friend.view;

import java.awt.FlowLayout;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import co.friend.access.FriendList;
import co.friend.model.Friend;

public class FriendGuiApp extends JFrame {

	TextField txtName, txtGubun, txtTel;
	JButton btnInsert, btnUpdate, btnDelete, btnSelectAll, btnFindName;
	TextArea txtList;
	FriendList friendList = new FriendList();
	
	public FriendGuiApp(){
		setTitle("친구관리");
		setSize(400, 400);
		init();
		setVisible(true);
	}
	public void init() {
		txtName = new TextField(45);
		txtGubun = new TextField(45);
		txtTel = new TextField(45);
		
		btnInsert = new JButton("등록");
		btnUpdate = new JButton("수정");
		btnDelete = new JButton("삭제");
		btnSelectAll = new JButton("전체조회");
		btnFindName = new JButton("이름조회");
		
		txtList = new TextArea(12,50);
		
		this.getContentPane().setLayout(new FlowLayout());
		this.getContentPane().add(new JLabel("구분"));
		this.getContentPane().add(txtGubun);
		this.getContentPane().add(new JLabel("이름"));
		this.getContentPane().add(txtName);
		this.getContentPane().add(new JLabel("전화"));
		this.getContentPane().add(txtTel);

		this.getContentPane().add(btnInsert);
		this.getContentPane().add(btnUpdate);
		this.getContentPane().add(btnDelete);
		this.getContentPane().add(btnSelectAll);
		this.getContentPane().add(btnFindName);
		
		this.getContentPane().add(txtList);
		
		btnInsert.addActionListener(new ClickHandler());
		btnUpdate.addActionListener(new UpdateHandler());
		btnDelete.addActionListener(new ActionListener() {				// 익명 객체

			@Override
			public void actionPerformed(ActionEvent e) {
				delete();
			}});
		btnSelectAll.addActionListener(e -> selectAll());				// 람다식 : 오버라이딩할 메서드가 딱 하나 있을 때
		btnFindName.addActionListener(e -> findName());
	}
	
	class ClickHandler implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			insert();
		}
	}	
	class UpdateHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			update();
		}
	}
	
	//등록
	public void insert() {
		Friend friend = new Friend();
		friend.setGubun(txtGubun.getText());
		friend.setName(txtName.getText());
		friend.setTel(txtTel.getText());
		friendList.insert(friend);
	}

	// 수정
	public void update() {
		Friend friend = new Friend();
		friend.setName(txtName.getText());
		friend.setTel(txtTel.getText());
		friendList.update(friend);
	}

	// 삭제
	public void delete() {
		String name = txtTel.getText();
		friendList.delete(name);
	}

	// 이름검색
	public void findName() {
		String name = txtTel.getText();
		Friend friend = friendList.selectOne(name);
		txtGubun.setText(friend.getGubun());
		txtTel.setText(friend.getTel());
		txtName.setText(friend.getName());
	}

	// 전체조회
	public void selectAll() {
		List<Friend> list = friendList.selectAll();
		StringBuffer sb = new StringBuffer();
		for(Friend friend : list) {
			sb.append(friend);
			sb.append("\n");
		}
		txtList.setText(sb.toString());
	}
	

}
