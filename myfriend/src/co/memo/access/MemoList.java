package co.memo.access;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import co.memo.model.Memo;

public class MemoList implements MemoAccess {
	
	ArrayList<Memo> memos;
	
	public MemoList() {
		memos = new ArrayList<Memo>();
		open();
	}
	// 메모 등록
	public void insert(Memo memo) {
		memos.add(memo);
		save();
	}
	// 메모 수정
	public void update(Memo memo) {
		for (Memo m : memos) {
			if (m.getDate().equals(memo.getDate())) {
				m.setContent(memo.getContent());
				save();
			}
		}
	}
	// 메모 삭제
	public void delete(String date) {
		for (Memo m : memos) {
			if (m.getDate().equals(date)) {
				memos.remove(m);
				save();
				break;
			}
		}
	}
	// 메모 전체조회
	public ArrayList<Memo> selectAll() {
		return memos;
	}
	// 날짜로 내용조회
	public Memo selectOne(String date) {
		for (Memo m : memos) {
			if (m.getDate().equals(date)) {
				return m;
			}
		}
		return null;
	}
	// 일부 내용으로 조회
	public Memo searchContent(String content) {
		for (Memo m : memos) {
			if (m.getContent().contains(content)) {
				return m;
			}
		}
		return null;
	}
	
	// open과 save
	String path = "d:/temp/memo.txt";
	public void open() {
		try {
			Scanner scanner = new Scanner (new File(path));
			while (true) {
				if (! scanner.hasNext()) break;
				String str = scanner.nextLine();
				String[] arr = str.split(" : ");
				memos.add(new Memo(arr[0], arr[1]));
			}
			scanner.close();
		} catch (Exception e) {
			System.out.println("오류");
		}
	}
	public void save() {
		try {
			BufferedWriter fw = new BufferedWriter(new FileWriter(path));
			for (Memo m : memos) {
				fw.write(String.format("%s : %s\n", m.getDate(), m.getContent()));
			}
			fw.close();
		} catch (Exception e) {
			System.out.println("오류");
		}
	}
}
