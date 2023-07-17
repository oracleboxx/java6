package java18;

import java.io.FileInputStream;

public class JavaIO05 {

	public static void main(String[] args) {
		int data =0;
		String path = "./src/java18/JavaIO05.java";
		try {
			FileInputStream fis = new FileInputStream(path);
			while((data = fis.read())!= -1) {
				System.out.write((char)data);
			}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}


