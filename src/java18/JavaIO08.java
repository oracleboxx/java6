package java18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class JavaIO08 {
    public static void main(String[] args) {
        String fileName;
        String buf;
        Reader myIn = new InputStreamReader(System.in);
        BufferedReader keyBr = new BufferedReader(myIn);

        try {
            System.out.println("./src/java18/JavaIO08.java");
            fileName = keyBr.readLine();

            FileReader fr = new FileReader(fileName);

            BufferedReader fileBr = new BufferedReader(fr);
            while ((buf = fileBr.readLine()) != null) {
                System.out.println(buf);
            }
            fileBr.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}