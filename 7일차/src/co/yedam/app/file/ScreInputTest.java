package co.yedam.app.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintStream;

public class ScreInputTest {
	
	public static void main(String[] args) {
		try {
			BufferedReader fr = new BufferedReader(new FileReader("d:/temp/score.txt"));
			PrintStream out = System.out;
			String a;
			while (true) {
				a = fr.readLine();
				String[] score = a.split(" ");
				int result = 0;
				for (String sc : score) {
					result += Integer.parseInt(sc);
				}
				if (a == null) break;
				out.println(result);
			}
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
