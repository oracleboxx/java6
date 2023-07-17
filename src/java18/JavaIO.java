package java18;

import java.io.InputStream;

// inputStream은 바이트 입력 스트림의 최상위 추상클래스이다.
public class JavaIO {

	public static void main(String[] args) {
		int data =0;
		System.out.println("문자입력>>");
		try {
			InputStream myIn =System.in;
			// System.in은 키보드 입력장치와 연결됨
			while((data = myIn.read()) != -1) {
				//한 바이트씩 읽어드림 더 이상 읽을 값이 없다면 -1
				System.out.write((char)data);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
