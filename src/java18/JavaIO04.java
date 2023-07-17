package java18;

import java.io.File;

public class JavaIO04 {

	public static void main(String[] args) {
		File filePath = new File("./src/java18/"); //sts 즉 이클립스에서 ./ 즉 현재경로는 해당 프로젝트이다.
		String[] fileList = filePath.list(); // src폴더의 파일목록을 배열로 반환한다.
		for(int i=0; i<fileList.length ; i++) {
			System.out.println(" "+fileList[i]);
		}
		
	}

}
