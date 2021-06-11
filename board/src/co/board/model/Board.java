package co.board.model;

public class Board {

	int idNum;
	String title;
	String content;
	String writer;
	String memberId;
	String memberPass;
	int perentIdNum;
	
	public Board() {};
	
	public Board(String memberId, String memberPass) {
		super();
		this.memberId = memberId;
		this.memberPass = memberPass;
	}
	
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
	
	public Board(String title, String content, String writer, int parentIdNum) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.perentIdNum = parentIdNum;
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

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getMemberPass() {
		return memberPass;
	}

	public void setMemberPass(String memberPass) {
		this.memberPass = memberPass;
	}

	public int getPerentIdNum() {
		return perentIdNum;
	}

	public void setPerentIdNum(int perentIdNum) {
		this.perentIdNum = perentIdNum;
	}

	public String viewInfo() {
		return "글번호 : " + idNum + "\t| 제목 : " + title + "\t| 작성자 : " + writer;
	}
	
	public String viewContent() {
		return "  └ 댓글 : " + content;
	}
	
	@Override
	public String toString() {
		return "글번호 : " + idNum + "\t| 제목 : " + title + "\t| 작성자 : " + writer + "\n" + "내용 : " + content;
	}
	
	
}
