package java18;

import java.io.InputStream;
import java.io.OutputStream;

public class JavaIO03 {

	public static void main(String[] args) {
		int data = 0;
		int cnt = 0;
		InputStream myIn = System.in;
		OutputStream myOut = System.out;
		try {

			while((data = myIn.read()) !=-1) {
				if(data == 'x' || data == 'X') {
					
					break;
				}
					cnt++;
					myOut.write((char)data);
				}
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("입력받은 개수"+cnt);
	
	}

}
