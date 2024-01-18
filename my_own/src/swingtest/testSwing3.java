package swingtest;


import java.awt.BorderLayout;
import java.awt.ComponentOrientation;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class testSwing3 extends JFrame{
	testSwing3() {
		setTitle("Border Layout!!");
		setLayout(new BorderLayout(20,30));//you divide 5 layout and set vGap, hGap
			add("East", new JButton("동"));//add "동"Button to EastLayout
			add("West", new JButton("서"));//add "서"Button to WestLayout
			add("South", new JButton("남"));//add "남"Button to SouthLayout
			add( new JButton("북"), BorderLayout.NORTH);//add "북"Button to NorthLayout
			add( new JButton("중"), BorderLayout.CENTER);//add "중앙"Button to CenterLayout
			
			setSize(600, 200);//width = 600, height = 100
			//pack();
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		}
	public static void main(String[] args) {
		new testSwing3();
	}
	}

