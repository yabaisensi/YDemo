package test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class TestPath {
	public static void main(String[] args) {
		System.out.println();
			Scanner sc = new Scanner(System.in);
		    String cstr = sc.next();
		    Path path = Paths.get(cstr);
			String pstr = path.getParent().toString();
			System.out.println(pstr);
	}
}
