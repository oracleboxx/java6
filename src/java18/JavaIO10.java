package java18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class JavaIO10 {

	public static void main(String[] args) {
		Customer cus =new Customer(10,"홍길동",23,173.6);
		System.out.println(cus.toString());
		try {
			System.out.println(cus.toString());
			FileOutputStream fos =new FileOutputStream("./src/result10.txt");
			ObjectOutputStream oos =new ObjectOutputStream(fos);
			oos.writeObject(cus);
			oos.close();
			fos.close();
		}
		catch(IOException ie) {
			ie.printStackTrace();
		}
	}

}
