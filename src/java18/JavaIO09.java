package java18;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/* 객체 직렬화를 위한 클래스 설계
 * 1.객체 직렬화 클래스를 설계하기 위해서 java.io의 Externalizable 인터페이스를 구현 상속 받고 2개의 추상메서드를
 * 오버라이딩함
 * 
 */

class Customer implements Externalizable {
	int id;
	String name;
int age ;
double height;
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(new Integer(id)); //오토박싱 업캐스팅
		out.writeObject(name);
		out.writeObject(new Integer(age));
		out.writeObject(new Double(height));
		
	}

	
	public Customer(int id ,String name ,int age, double height) {
		this.id =id ;
		this.name = name;
		this.age = age;
		this.height = height;
	}
	

	
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		id=(Integer)in.readObject();// 명시적인 다운캐스팅 + 오토언박싱
		name=(String)in.readObject();
		age=(Integer)in.readObject();
		height =(Double)in.readDouble(); 
	}
	@Override
	public String toString() {
		
		return "id="+id+",name"+name+",age"+age+",height"+height;
	}
}

public class JavaIO09 {
	public static void main(String[] args) {
		Customer c =new Customer(1,"lee",15,122.1);

		try {
			System.out.println(c.toString());
			FileOutputStream f = new FileOutputStream("./src/java18/Note18");
			
		}
		catch(Exception ie) {
			ie.printStackTrace();
		}
		
	}
}
