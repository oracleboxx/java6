package java18;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JavaIO11 {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("./src/result10.txt");
			ObjectInputStream ois =  new ObjectInputStream(fis);
			Customer cus =(Customer)ois.readObject();
			System.out.println("ID name age height");
			System.out.println(cus.toString());
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
		catch(ClassNotFoundException ce) {
			ce.printStackTrace();
		}
	}

}
