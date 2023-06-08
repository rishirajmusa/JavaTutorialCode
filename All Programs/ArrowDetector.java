package arrowKeys;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ArrowDetector {
public ArrowDetector() {
	JPanel panel = new JPanel();
	
	JFrame frame = new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	frame.setSize(550, 200);
	frame.setFocusable(true);
	
	JLabel up = new JLabel("UP KEY Count : 0");
	JLabel down = new JLabel("DOWN KEY Count : 0");
	JLabel right = new JLabel("RIGHT KEY Count :0 ");
	JLabel left = new JLabel("LEFT KEY Count :0 ");
	
	panel.add(left);
	panel.add(right);
	panel.add(down);
	panel.add(up);
	
	frame.addKeyListener(new KeyListener(){
		int upCount=1;
		int downCount=1;
		int leftCount=1;
		int rightCount=1;
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
			int keyCode = e.getKeyCode();
			switch(keyCode) {
			case KeyEvent.VK_UP:
				up.setText("UP KEY Count : " + Integer.toString(upCount++));
				break;
			case KeyEvent.VK_DOWN:
				down.setText("DOWN KEY Count : " + Integer.toString(downCount++));
				break;
			case KeyEvent.VK_LEFT:
				left.setText("LEFT KEY Count : "+Integer.toString(leftCount++));
				break;
			case KeyEvent.VK_RIGHT:
				right.setText("RIGHT KEY Count : "+Integer.toString(rightCount++));
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	
	});
	frame.add(panel);
}

	public static void main(String[] args) {
		new ArrowDetector();
		
}
}