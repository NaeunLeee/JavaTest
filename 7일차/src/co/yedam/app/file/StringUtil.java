package co.yedam.app.file;

import java.nio.file.Paths;

public class StringUtil {
	// 파일명 추출
	public static String getFilename(String path) {
		String s = null;
		if (path == null) return null;
		s = path.substring(path.lastIndexOf("/")+1);
		return s;
	}
	// 확장자
	public static String getExtention(String path) {
		String s = null;
		if (path == null) return null;
		s = path.substring(path.lastIndexOf(".")+1);
		return s;
	}
	// 경로
	public static String getPath(String path) {
		String s = null;
		if (path == null) return null;
		s = path.substring(0, path.lastIndexOf("/"));
		return s;
	}
}
