package test;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Test2 {

  public static void main(String[] args) {
    try {
    	FileWriter myObj = new FileWriter("my_path.txt");
			Scanner sc = new Scanner(System.in);
		    String cstr = sc.next();
		    Path path = Paths.get(cstr);
			String pstr = path.getParent().toString();
			System.out.println(pstr);
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}