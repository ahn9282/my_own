package swingtest;


import java.awt.Color;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;


public class testSwing5 extends JFrame{

	
	
	testSwing5() {
		setTitle("Please Sign-in!!");
		JPanel p = new JPanel(new FlowLayout()); 
		p.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
		JLabel ID = new JLabel("ID : ");
		JLabel PW = new JLabel("PW : ");
		JTextArea tID = new JTextArea(1,8);
		JTextArea tPW = new JTextArea(1,8);
		JButton b1 = new JButton("Log-In");
		b1.setBounds(200, 200, 60, 40);
		p.add(ID);
		p.add(tID);
		p.add(PW);
		p.add(tPW);
		p.add(b1);
		add(p);
		ID.setForeground(Color.white);// ID set color to white
		ID.getForeground();              // return ID's text color to white
		PW.setForeground(Color.white);
		PW.getForeground();
		p.setBackground(Color.black);// p set color to black
		p.getBackground();             // return p's text color to black
			
			setSize(600, 200);//width = 600, height = 100
			//pack();
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		}
	
	
	public static void main(String[] args) {
		new testSwing5();
	}
	}

