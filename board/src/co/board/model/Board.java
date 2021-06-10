package co.board.model;

public class Board {

	int idNum;
	String title;
	String content;
	String writer;
	
	public Board() {};
	
	public Board(String title, String content, String writer) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	public Board(int idNum, String title, String content, String writer) {
		super();
		this.idNum = idNum;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	public int getIdNum() {
		return idNum;
	}
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String showInfo() {
		return "Board [글번호 : " + idNum + "| 제목 : " + title + "| 작성자 : " + writer + "]";
	}
	
	@Override
	public String toString() {
		return "Board [글번호 : " + idNum + "| 제목 : " + title + "| 작성자 : " + writer +"| 내용 : " + content + "]";
	}
	
	
}
