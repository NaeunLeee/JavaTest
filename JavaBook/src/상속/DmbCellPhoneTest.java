package 상속;

public class DmbCellPhoneTest {

	public static void main(String[] args) {
		DmbCellPhone phone = new DmbCellPhone();
		DmbCellPhone dmbCellPhone = new DmbCellPhone("삼성", "검정", 10);
		System.out.println(phone);
		System.out.println(dmbCellPhone.color + " " + dmbCellPhone.model);

		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannel(20);
		dmbCellPhone.turnOffDmb();
		dmbCellPhone.powerOff();
	}

}
