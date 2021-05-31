package co.yedam.test;

import java.util.Arrays;

/* 
 * 기본 데이터형 8타입은 기본값은 0으로 초기화
 * boolean은 false로 초기화
 * 참조변수(String, 배열)는 null로 초기화  
 */
public class FieldInitValue {
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	boolean bool;
	char c;
	String str;
	int[] arr;
	
	FieldInitValue() {}
	FieldInitValue(int x, double y) {
		i = x;
		d = y;
	}

	@Override
	public String toString() {
		return "FieldInitValue [b=" + b + ", s=" + s + ", i=" + i + ", l=" + l + ", f=" + f + ", d=" + d + ", bool="
				+ bool + ", c=" + c + ", str=" + str + ", arr=" + Arrays.toString(arr) + "]";
	}
	
		
}
