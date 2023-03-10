package test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Test4 {

    	public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
    		while(true) {
    			Scanner sc = new Scanner(System.in);
    			String cstr = sc.nextLine();
    			cstr=cstr.replaceAll("^\"|\"$", "");
    	        File file = new File(cstr);
    	        URI uri = file.toURI();
    	        String path = uri.getPath();
    	        File parent = new File(path).getParentFile();
    	        
    			System.out.println(parent.getPath());
    			ProcessBuilder pb = new ProcessBuilder("cmd");
    			pb.start();
    			Runtime rt = Runtime.getRuntime();
    			rt.exec("explorer \""+parent.getPath()+"\"");
    		}
  }
}