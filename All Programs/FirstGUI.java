import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstGUI implements ActionListener {
	private int count=0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	FirstGUI(){
		JButton button =new JButton("Click");//Made a button object for a button
		label = new JLabel("Number of Clicks = 0");//added a label object for the button
		button.addActionListener(this);//added an action listener for the button 
		
		frame = new JFrame();//made a reference to the frame object
		panel =new JPanel();//made a reference to the panel object
		panel.setBorder(BorderFactory.createEmptyBorder(150,150,150,150));
		panel.setLayout(new GridLayout());
		panel.add(button);
		panel.add(label);
		frame.add(panel, BorderLayout.CENTER);
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		/* Sets the operation that will happen by default 
		when the user initiates a "close" on this frame. 
		You must specify one of the following choices: 

these are the options available 

•DO_NOTHING_ON_CLOSE(defined in WindowConstants):Don't do anything; require theprogram to handle the operation in the windowClosingmethod of a registered WindowListener object. 
•HIDE_ON_CLOSE(defined in WindowConstants):Automatically hide the frame afterinvoking any registered WindowListenerobjects. 
•DISPOSE_ON_CLOSE(defined in WindowConstants):Automatically hide and dispose theframe after invoking any registered WindowListenerobjects. 
•EXIT_ON_CLOSE(defined in WindowConstants):Exit the application using the System exit method. Use this only in applications. 
 */
		
		frame.setTitle("First GUI");
		
		frame.pack();/*Causes this Window to be sized to fit the 
		preferred size and layouts of its subcomponents.
		 The resulting width and height of the window are automatically enlarged 
		 if either of dimensions is less than the minimum size 
		 as specifiedby the previous call to the setMinimumSize method. */
		
		frame.setVisible(true);
}
	public static void main(String[] args) {
		new FirstGUI();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("Number of Clicks = "+count);
	}

}
