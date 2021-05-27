package co.yedam.app.score;

public class SwitchTest {

	public static void main(String[] args) {
	    float avg = 61.4f;
	    char grade;
	    
		switch((int)avg/10) {      //80상 60중 하
		case 10: 
		case 9: 
		case 8: grade = '상'; break;
		case 7:
		case 6: grade = '중'; break;
		default: grade = '하'; break;
		}
		System.out.println(grade);
	}

}
