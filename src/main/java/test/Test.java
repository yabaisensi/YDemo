package test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.net.URISyntaxException;

public class Test {

    	public static void main(String[] args) throws InterruptedException, IOException, URISyntaxException {
    			try {
					Robot robot = new Robot();
					// ctrl
					robot.keyPress(KeyEvent.VK_CONTROL);
					System.out.println("KeyEvent.VK_CONTROL"+ KeyEvent.VK_CONTROL);
				} catch (AWTException e) {
					e.printStackTrace();
				}
  }
}