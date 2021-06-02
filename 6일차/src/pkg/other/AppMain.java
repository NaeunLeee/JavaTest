package pkg.other;

import pkg.DateUtil;
import pkg.Car;
import pkg.Count;

//import pkg.*;		->pkg 하위에 있는 것들 모두 import (권장안함)

public class AppMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.setModel("현대");
		car.setSpeed(100);
		Car car2 = new Car("삼성", 50);
		Car car3 = new Car("쌍용");
		
		System.out.println(DateUtil.curDate());
		Count count1 = new Count();
		Count.cnt1++;
		count1.setCnt2(count1.getCnt2()+1);
		System.out.println(Count.cnt1);
	}

}
