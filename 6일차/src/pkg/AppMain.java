package pkg;

public class AppMain {
	
	static void print() {
		System.out.println("===========");
	}

	public static void main(String[] args) {
		// name1 (인스턴스) : 객체 생성 후, 조회&수정
		ProjectInfo info = new ProjectInfo();
		System.out.println(info.name1);
		info.name1 = "예성주식회사";
		// name2 (정적) : 객체 생성 않고 바로 조회&수정
		System.out.println(ProjectInfo.name2);
		ProjectInfo.name2 = "예성주식회사";
		// name3 (상수) : 조회 가능, 수정 불가
		System.out.println(ProjectInfo.name3);
//		ProjectInfo.name3 = "예성주식회사";
		
		print();
		
		// 정적 메서드
//		DateUtil dateUtil = new DateUtil();
		System.out.println(DateUtil.curDate());
		
		// Count
//		Count count1 = new Count();
//		Count.cnt1++;
//		count1.cnt2++;
//		Count count2 = new Count();
//		Count.cnt1++;
//		count2.cnt2++;
//		Count count3 = new Count();
//		Count.cnt1++;
//		count3.cnt2++;
//		System.out.println(Count.cnt1 + " " + count1.cnt2);
//		System.out.println(Count.cnt1 + " " + count2.cnt2);
//		System.out.println(Count.cnt1 + " " + count3.cnt2);
		
		
	}

}
