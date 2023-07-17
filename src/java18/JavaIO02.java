package java18;

import java.io.OutputStream;

public class JavaIO02 {

	public static void main(String[] args) {
			int data = 0;
			System.out.println("문자 입력:");
			try {
				OutputStream myOut = System.out;
				//모니터 출력장치와 연결됨
				
				while((data = System.in.read()) != -1) {
					myOut.write((char)data);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
	}

}
