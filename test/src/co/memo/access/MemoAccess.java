package co.memo.access;

import java.util.ArrayList;

import co.memo.model.Memo;

public interface MemoAccess {
	public void write(String date, String title, String content);
	public void update(String date, String content);
	public void delete(String date);
	public ArrayList<Memo> FindAll();
	public Memo FindByDate(String date);
	public ArrayList<Memo> FindByContent(String content);
}
