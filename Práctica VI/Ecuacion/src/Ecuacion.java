import java.awt.*;
import java.applet.*;
import javax.swing.*;
import PResolvente.*;
	
/*
 * 
 *|~~~~~~~~~~~| |~~~~~|
 *|Pr�ctica VI|~|FALTA|
 *|~~~~~~~~~~~| |~~~~~|
 * 
 */

public class Ecuacion extends JApplet {
	
	public void init() {
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new Resolvente());
		
	}
}