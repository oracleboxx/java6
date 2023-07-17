package java18;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* java.io 패키지의 FileOutStream 클래스는 주어진 파일에 바이트 단위로 기록하기
 * 
 */


public class JavaIO06 {

	public static void main(String[] args) throws IOException {
		int data =0;
		System.out.println("저장할 내용을 저장");
		
		
		try {
			File f =new File("./src/result.txt");
			FileOutputStream fos =new FileOutputStream(f);
			while((data = System.in.read()) !=-1) {
				if(data == 'n' || data== 'N') {
					break;
						
				}
				fos.write((char)data);
			}
			fos.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
	}

}
