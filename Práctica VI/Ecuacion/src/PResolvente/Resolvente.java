package PResolvente;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

public class Resolvente extends JPanel implements ActionListener{
	
	private JPanel p1, p2, p3, p4;
	private JLabel l1, l2, l3, l4, l5;
	private JTextField t1, t2, t3;
	private JButton b1, b2;
	private JTextArea ta;
	
	public Resolvente() {
	
	l1 = new JLabel("Ecuación de Segundo Grado" , JLabel.CENTER);
	l2 = new JLabel("Ax^2:" , JLabel.RIGHT);
	l3 = new JLabel("Bx:" , JLabel.RIGHT);
	l4 = new JLabel("C:" , JLabel.RIGHT);
	l5 = new JLabel("Resultados" , JLabel.CENTER);
	b1 = new JButton("Cálcular");
	b2 = new JButton(" Borrar ");
	t1 = new JTextField(4);
	t2 = new JTextField(4);
	t3 = new JTextField(4);
	ta = new JTextArea(5,20);

	p1 = new JPanel(new GridLayout(5,1));
	p1.add(l1);
	p2 = new JPanel(new FlowLayout());
	p2.add(l2); p2.add(t1); p2.add(l3); p2.add(t2); p2.add(l4); p2.add(t3);
	p1.add(p2);
	p3 = new JPanel(new FlowLayout());
	p3.add(b1); p3.add(b2);
	p1.add(p3);
	p1.add(l5);
	p4 = new JPanel(new FlowLayout());
	p4.add(ta);
	p1.add(ta);	
	add(p1);
	
	this.add(ta);	
	b1.addActionListener(this);
	b2.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		double a, b, c, r, x, y;
		if (e.getSource() == b1) {
			a = Double.parseDouble(t1.getText());
			b = Double.parseDouble(t2.getText());
			c = Double.parseDouble(t3.getText());
			if (a == 0) {
				ta.append("Match Error.");
			} else {
				r = (Math.pow(b,2) - 4 * a * c);
				if (r < 0) {
					ta.append("Match Error.");
				} else {
					x = (r - b)/(2 * a);
					y = (-r - b)/(2 * a);
					ta.append("X = " + x + "\n" + "Y = " + y + "\n");
				}
			}
		}
		if (e.getSource() == b2) {
			t1.setText("");
			t2.setText("");
			t3.setText("");
			ta.setText("");
		}
		
	}	
}
