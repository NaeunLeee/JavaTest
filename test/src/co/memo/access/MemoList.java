//package co.memo.access;
//
//import java.text.ParseException;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//import co.memo.model.Memo;
//
//public class MemoList implements MemoAccess{
//	ArrayList<Memo> memoList;
//	public static final String DATE_FORMAT = "yyyy-MM-dd";
//	
//	public MemoList() {
//		memoList = new ArrayList<Memo>();
//	}
//
//
//	@Override
//	public void write(String date, String title, String content) {
//		Memo memo = new Memo(date,title,content);
//		memoList.add(memo);
//	}
//
//	@Override
//	public void update(String title) {
//		for(Memo m : memoList) {
//			if(m.getTitle().equals(title)) {
//				m.print();
//				System.out.println("수정할 항목을 선택하세요. 1.날짜 2.제목 3.내용");
//				Scanner scanner = new Scanner(System.in);
//				int choice = scanner.nextInt();
//				
//				switch(choice) {
//				case 1:
//					System.out.print("날짜 > ");
//					String newDate = scanner.next();
//					
//					try {
//						SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
//						sdf.parse(newDate);
//						m.setDate(newDate);
//					} catch (ParseException e) {
//						System.out.println("날짜 형식이 올바르지 않습니다. ex) 1900-01-01");
//					}
//					break;
//				case 2:
//					System.out.print("제목 > ");
//					m.setTitle(scanner.next());
//					break;
//				case 3:
//					System.out.print("내용 > ");
//					m.setContent(scanner.nextLine());
//					break;
//				}
//				m.print();
//				break;
//			}
//		}
//	}
//
//	@Override
//	public void delete(String title) {
//		for(Memo m : memoList) {
//			if(m.getTitle().equals(title)) {
//				System.out.println(m.getTitle() + " 메모 삭제 성공");
//				memoList.remove(m);
//				break;
//			}
//		}
//		System.out.println("삭제할 메모가 없습니다.");
//	}
//
//	@Override
//	public void FindAll() {
//		for(Memo m : memoList) {
//			m.print();
//			System.out.println("=================");
//		}
//		
//	}
//
//	@Override
//	public void FindByDate(String date) {
//		SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
//		try {
//			sdf.parse(date);
//			for(Memo m : memoList) {
//				if(m.getDate().equals(date)) {
//					m.print();
//					break;
//				}
//			}
//		} catch (ParseException e) {
//			System.out.println("날짜 형식이 올바르지 않습니다.");
//		}
//	}
//
//	@Override
//	public void FindByContent(String content) {
//		for(Memo m : memoList) {
//			if(m.getContent().equals(content)) {
//				m.print();
//				break;
//			}
//		}
//	}
//
//}
