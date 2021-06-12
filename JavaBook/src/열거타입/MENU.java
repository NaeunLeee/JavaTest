package 열거타입;

public enum MENU {
	등록(1), 수정(2), 삭제(3), 조회(4), 종료(0);

	private int value;
	
	public int getValue() {
		return value;
	}
	
	private MENU(int value) {
		this.value = value;
	}
	
	public static void print() {
		MENU[] arr = MENU.values();
		for (MENU m : arr) {
			System.out.print(m.value + " : " + m + " | ");
		}
	}
	
	public static MENU getMenu(int v) {
		MENU[] arr = MENU.values();
		for (MENU m : arr) {
			if (m.getValue() == v) {
				return m;
			}
		}
		return null;
	}
	
}
