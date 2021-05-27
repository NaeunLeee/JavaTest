package co.yedam.app;

import java.util.Scanner;

public class AppMain {

	public static void main(String[] args) {
		CalcGame game = new CalcGame();
		game.input();
		//add(), share(), div(), rest()
		System.out.println(game.add());
		System.out.println(game.share());
		System.out.println(game.div());
		System.out.println(game.rest());
	}

}
