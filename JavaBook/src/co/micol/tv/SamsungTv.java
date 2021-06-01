package co.micol.tv;

public class SamsungTv implements RemoteControl {

	public SamsungTv() {
		System.out.println("삼성 TV 객체생성");
	}
	public void powerOn() {
		System.out.println("삼성 TV -- 전원 ON");
	}
	public void powerOff() {
		System.out.println("삼성 TV -- 전원 OFF");	
	}
	public void volumeUp() {
		System.out.println("삼성 TV -- 볼륨 UP");
	}
	public void voluemDonw() {
		System.out.println("삼성 TV -- 볼륨 DOWN");
	}
}
