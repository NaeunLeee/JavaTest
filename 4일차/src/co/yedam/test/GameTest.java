package co.yedam.test;

import co.yedam.app.baseball.BaseBallApp;

public class GameTest {

	public static void main(String[] args) {
		BaseBallApp game = new BaseBallApp();
		game.start();		// baseballapp에서 start만 public넣어주면 나머지는 다 접근가능
	}

}
