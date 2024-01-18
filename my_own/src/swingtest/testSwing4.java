package swingtest;


import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class testSwing4 extends JFrame{
	testSwing4() {
		setTitle("Grid Layout!!");
		setLayout(new GridLayout(3,4,10,10));
		add(new JButton("B 1"));
		add(new JButton("B 2"));
		add(new JButton("B 3"));
		add(new JButton("B 4"));
		add(new JButton("B 5"));
		
			
			setSize(600, 200);//width = 600, height = 100
			//pack();
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		}
	public static void main(String[] args) {
		new testSwing4();
	}
	}

