package co.yedam.app.file;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
//		fileCreate();
//		makeFolder();
//		fileInfo();
		folderList();
	}
	
	public static void fileCreate() throws IOException {
		// 파일 생성
		File file = new File("d:/temp/diary.txt");
		boolean result = file.createNewFile();
		System.out.println(result);
	}

	private static void folderList() {
		// 폴더
		File file = new File("d:/temp");
		if (file.isDirectory()) {
			File[] list = file.listFiles();
			for (File f : list) {
				if (StringUtil.getExtention(f.getName()).equals("png")) {
					System.out.println(f.getName());
					FileUtil.copy(f.getAbsolutePath(), "d:/temp/images/"+f.getName());
				}
			}
		}
	}

	private static void fileInfo() {
		// 파일 정보
		File file = new File("d:/temp/image.png");
		System.out.println("파일크기 : " + file.length());
		System.out.println("파일이름 : " + file.getName());
	}

	private static void makeFolder() {
		// 폴더 생성
		File file = new File("d:/temp/images");
		file.mkdir();
	}
		
}
