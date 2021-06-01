package co.micol.tv;

public class MainApp {

	// 명령행 인수
	public static void main(String[] args) {
//		SamsungTv tv = new SamsungTv();
//		LgTv tv = new LgTv();
		
// 		다형성
		// 1. 부모타입의 참조변수가 자식객체를 참조할 수 있다.
		// 2. 참조하는 대상의 메서드가 호출됨
		//	  코드는 같아도 참조대상에 따라서 실행결과 다르게 나옴.
//		RemoteControl tv = new SamsungTv();
//		RemoteControl tv = new LgTv();
		RemoteControl tv = (RemoteControl)BeanFactory.getBean(args[0]);
		
		tv.powerOn();
		tv.volumeUp();
		tv.voluemDonw();
		tv.powerOff();
	}

}
