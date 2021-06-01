package co.micol.tv;
/*
 * BeanFactory : 객체를 생성해주는 공장. 뒤에 가서 배움.
 */
public class BeanFactory {
	// Object : 최상위 클래스
	// 모든 클래스는 Object의 상속을 받음(like 아담)
	public static Object getBean(String beanName) {
		if (beanName.equals("samsung")) {
			return new SamsungTv();
		}
		else if (beanName.equals("lg")) {
			return new LgTv();
		}
		return null;
	}
}
