package test;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class Test3 {

    	public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
    		int index=0;
    		while(index<4) {
    			index++;
    			Scanner sc = new Scanner(System.in);
    			String cstr = sc.nextLine();
    			System.out.println(cstr);
    	        File file = new File(cstr);
    	        URI uri = file.toURI();
    	        String path = uri.getPath();
    	        File parent = new File(path).getParentFile();
    	        
    			System.out.println(parent.getPath());
    			ProcessBuilder pb = new ProcessBuilder("C:\\Users\\Administrator\\Desktop\\noteOfJapanIT\\组长大大实用小工具\\back tool win系一键备份文件工具\\back tool 日文系统版version2.0\\back tool 日文系统版2.0,cmd");
    			pb.start();
    			Runtime rt = Runtime.getRuntime();
    			rt.exec("explorer \""+parent.getPath()+"\"");
    		}
  }
}