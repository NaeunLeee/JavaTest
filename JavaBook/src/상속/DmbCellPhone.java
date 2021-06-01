package 상속;

//			  자식 (sub)	      부모 (super)
public class DmbCellPhone extends CellPhone{
	int channel;
	
	public DmbCellPhone() {
		super("","");
		System.out.println("DmbCellPhone 기본 생성자");
	}
	public DmbCellPhone(String model, String color, int channel) {
		super(model, color);	// 부모 생성자 (안 적더라도 있는 것과 마찬가지. 생략 가능)
		// super()는 항상 맨 위에
		this.model = model;
		this.color = color;
		this.channel = channel;
		System.out.println("DmbCellPhone 생성자");
	}
	void turnOnDmb () {
		System.out.println("채널 " + channel + "번 DMB 방송수신 시작");
	}
	void turnOffDmb () {
		System.out.println("DMB 방송수신을 멈춥니다.");
	}
	void changeChannel(int channel) {
		this.channel = channel;
		System.out.println("채널 변경");
	}
	@Override
	void powerOn() {			// 부모한테 상속 받아서 자식이 재정의
//		super.powerOn();
		System.out.println("Dmb 전원 ON");
	}
	// 오버로딩 : 중복정의 / 오버라이딩 : 재정의
	
}
