package PMarco;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

public class Marco extends JPanel implements ActionListener{

	private JPanel p;
	private JLabel l1, l2;
	private JTextField t1, t2;
	
	public Marco() {
		
		l1 = new JLabel("Temperatura en Centigrados (ºC): ");
		l2 = new JLabel("Temperatura en Farenheit (ºF): ");
		t1 = new JTextField(10);
		t2 = new JTextField(10);
		p = new JPanel(new GridLayout(2,2));
		// Uso del GridLayout como controlador //
	   	// Se visualizará de manera de matríz //
	   	// Tambíén P = new JPanel(new GridLayout(2,2)); //
		p.add(l1);p.add(t1);
		p.add(l2);p.add(t2);
		this.setLayout(new FlowLayout()); 
		// Como es un contenedor nesecita un manejador de distribución //
		this.add(p); // ¿Que? //
		t1.addActionListener(this); 
		t2.addActionListener(this); 
		// Oyente para los cuadros de textos //
				
	}
	
	public void actionPerformed(ActionEvent e) {
		
		// En e se guarda la acción de los cuadros de textos //
		double t;
		if (e.getSource() == t1) {
			// getSource() devuelve la referencia //
			t = Double.parseDouble(t1.getText());
			t = (t * 1.8 + 32);
			t2.setText(" " + t);
		} else {
			t = Double.parseDouble(t2.getText());
			t = ((t - 32)/1.8);
			t1.setText(" " + t);
		}
		
	}	
}
