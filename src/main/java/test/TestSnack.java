package test;

import java.util.Scanner;

public class TestSnack {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        try {
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
        	System.out.println(sb);
            scan.close();
        }
	}

}
