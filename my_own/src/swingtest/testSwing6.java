package swingtest;


import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class testSwing6 extends JFrame{
	CardLayout layout;
	
	public void rotate(){
		while(true) {
			try {
				Thread.sleep(500);
			}catch(Exception e){
			}
			layout.next(this.getContentPane());
		}
	}
	
	
	testSwing6() {
		setTitle("Card Layout!!");
		layout = new CardLayout();
		setLayout(layout);
		add("0",new JButton("B 1"));
		add("1",new JButton("B 2"));
		add("2",new JButton("B 3"));
		add("3",new JButton("B 4"));
		add("4",new JButton("B 5"));
		
			
			setSize(600, 200);//width = 600, height = 100
			//pack();
			setVisible(true);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		}
	
	
	public static void main(String[] args) {
		new testSwing6().rotate();
	}
	}

