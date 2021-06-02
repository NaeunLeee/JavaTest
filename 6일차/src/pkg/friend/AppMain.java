package pkg.friend;

import pkg.Friend;

public class AppMain {

	public static void main(String[] args) {

		Friend f1 = new CompanyFriend("회사", "홍길동", "1111", "과장");
		Friend f2 = new SchoolFriend("학교", "김유신", "2222", "10/30");
		f1.print();
		f2.print();
		System.out.println("===========================================================");
		
// 인터페이스는 직접 호출 불가
		FriendManager manager = new FriendManager();
//		FriendAccess manager = new FriendManager();
//		FriendAccess manager = BeanFactory.getBean(FriendAccess.class);
		
		// 다형성 (상속받고 오버라이딩 전제조건)
		// 1. 부모타입의 참조변수가 자식객체를 참조가능
		// 2. 메서드 실행하면 참조대상의 메서드가 호출되므로 결과가 다름
		for (Friend fr : manager.friends) {
			fr.print();
		}
		System.out.println("===========================================================");
		for (Friend fri : manager.friends) {
			if (fri instanceof CompanyFriend) {
				fri.print();
			}
		}
	}

}
