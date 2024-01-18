package swingtest;

import javax.swing.JButton;
import javax.swing.JFrame;

public class testSwing extends JFrame{
	testSwing() {
			setTitle("myGUI");// set title

			JButton button = new JButton("버튼");//JButtom method use and generate 'Button' object generate, Button's text is "버튼"
			add(button);// add dbject(button) to GUI:Swing

			setSize(300, 100);// frame metfod size
			setVisible(true);// ture : open swing gui
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // If you close GUI with program
		}
	public static void main(String[] args) {
		new testSwing();
	}
	}

