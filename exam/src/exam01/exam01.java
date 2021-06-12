package exam01;

public class exam01 {
	
	public static void main(String[] args) {
		String[] arr = {"010102-2", "991012-1", "960304-1", "881012-2", "040403-1"};
		
		int man = 0;
		int woman = 0;
		
		int age;
		int age10 = 0;
		int age20 = 0;
		int age30 = 0;
		int age40 = 0;
		
		for (String s : arr) {
			char ch = s.charAt(7);
			if (ch=='1') {
				man++;
			} else {
				woman++;
			}
		}
		
		for (String s : arr) {
			char ch = s.charAt(0);
			int i = Integer.parseInt(s.substring(0,2));
			if (ch=='0') {
				age = 2021 - (2000+i) + 1;
			} else {
				age = 2021 - (1900+i) + 1;
			}
			if (age>=10 && age<20) {
				age10++;
			} else if (age>=20 && age<30) {
				age20++;
			} else if (age>=30 && age<40) {
				age30++;
			} else {
				age40++;
			}
			
		}
		System.out.println("남 " + man + " " + "여 " + woman);
		System.out.println("10대 " + age10 + "명");
		System.out.println("20대 " + age20 + "명");
		System.out.println("30대 " + age30 + "명");
		System.out.println("40대 " + age40 + "명");
		
	}
	
	
}
