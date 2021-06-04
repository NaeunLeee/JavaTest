package co.yedam.app.file;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileUtil {

	public static void copy(String src, String des) {
	// 파일복사
		try {
			FileInputStream fis = new FileInputStream(src);
			FileOutputStream fos = new FileOutputStream(des);
			byte[] b = new byte[100];
			while (true) {
				int cnt = fis.read(b);
				if (cnt==-1) break;
				fos.write(b);
			}
			fis.close();
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
