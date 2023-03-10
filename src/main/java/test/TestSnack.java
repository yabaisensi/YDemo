package test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TestSnack {
	private static final String IN_FILE = "C:\\Users\\Administrator\\Documents\\pleiades-2021-12-java-win-64bit-jre_20220106\\pleiades\\workspace\\YDemo\\src\\main\\java\\test\\snack_in.txt";
	private static final String OUT_FILE = "C:\\Users\\Administrator\\Documents\\pleiades-2021-12-java-win-64bit-jre_20220106\\pleiades\\workspace\\YDemo\\src\\main\\java\\test\\snack_out.txt";
	public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        try {
        	ProcessBuilder pb = new ProcessBuilder("cmd");
        	Runtime rt = Runtime.getRuntime();
        	rt.exec("notepad \""+IN_FILE+"\"");
        	System.out.println();
        	new java.util.Scanner(System.in).nextLine();
            while (scan.hasNextLine()){

            	String line = scan.nextLine();
        		while (line.contains("_")) {
    			line = line.replaceFirst("_[a-z]",
    					String.valueOf(Character.toUpperCase(line.charAt(line.indexOf("_") + 1))));
    		}
                if (line.equals("##")) {
                    scan.close();
                    break;
                }
                line = line+"\r\n";
                sb.append(line);
            }
        } finally {
        	ProcessBuilder pb = new ProcessBuilder("cmd");
        	scan.close();
			Runtime rt = Runtime.getRuntime();
			rt.exec("pause");
			BufferedWriter bwr = new BufferedWriter(new FileWriter(new File(OUT_FILE)));
			bwr.write(sb.toString());
			bwr.flush();
			bwr.close();
			pb.start();
		    String staStr = "notepad \""+OUT_FILE+"\"";
			rt.exec(staStr);
        }
	}

}
