package bjProblem;

import java.util.Scanner;

public class P5543 {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print("상덕버거 가격 > ");
		int sang = scn.nextInt();
		System.out.print("중덕버거 가격 > ");
		int jung = scn.nextInt();
		System.out.print("하덕버거 가격 > ");
		int ha = scn.nextInt();
		System.out.print("콜라 가격 > ");
		int coke = scn.nextInt();
		System.out.print("사이다 가격 > ");
		int cider = scn.nextInt();
		
		int price = 0;
		
		if (sang<jung && sang<ha) {
			if (coke<cider) {
				price = sang+coke;
			} else if (cider<coke) {
				price = sang+cider;
			}
		} else if (jung<sang && jung<ha) {
			if (coke<cider) {
				price = jung+coke;
			} else if (cider<coke) {
				price = jung+cider;
			}
		} else if (ha<sang && ha<jung) {
			if (coke<cider) {
				price = ha+coke;
			} else if (cider<coke) {
				price = ha+cider;
			}
		}
		System.out.println("세트 메뉴 가격 : "+(price-50));
		
	}

}
