package pkg;

public class Count {
	public static int cnt1;
	private int cnt2;
	
	public void setCnt2(int cnt) {
		if (cnt < 0) {
			cnt = 0;
		}
		this.cnt2 = cnt;
	}
	public int getCnt2() {
		return cnt2;
	}
}
