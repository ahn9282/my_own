package swingtest;


import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class testSwing2 extends JFrame{
	testSwing2() {
		setTitle("Flow Layout!!");
			JPanel p = new JPanel(new FlowLayout());//default is Flow
			p.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);//you set component Layout direction right to left
			JButton b1 = new JButton("B 1");				// right >>>> left
			JButton b2 = new JButton("B 2");
			JButton b3 = new JButton("Button 3");
			JButton b4 = new JButton("Button Four");
			p.add(b1);
			p.add(b2);
			p.add(b3);
			p.add(b4);
			add(p);
			
			setSize(600, 100);//width = 600, height = 100
			//pack();
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		}
	public static void main(String[] args) {
		new testSwing2();
	}
	}

