package co.yedam.app;

public class Add {

	public static void main(String[] args) {
		
		String data1 = null;
		String data2 = null;
		try {
			data1 = args[0];
			data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			System.out.println(value1 / value2);

		} catch (NumberFormatException e) {
			System.out.println("숫자 입력");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("숫자 2개 입력");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
