import java.awt.*;
import java.applet.*;
import javax.swing.*;
import PMarco.*;
	
/*
 *
 *|~~~~~~~~~~| |~~~~~|
 *|Práctica V|~|HECHO|
 *|~~~~~~~~~~| |~~~~~|
 *
 */

public class Grafica extends JApplet {
	
	public void init() {
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new Marco());
		
	}
}