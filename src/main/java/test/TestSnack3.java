package test;

import java.io.IOException;

public class TestSnack3 {
	public static void main(String[] args) throws IOException {
        try {
        	ProcessBuilder pb = new ProcessBuilder("cmd");
        	Runtime rt = Runtime.getRuntime();
        	rt.exec(new String[]{"cmd.exe","/c","start excel.exe"});
        } finally {
        }
	}

}
