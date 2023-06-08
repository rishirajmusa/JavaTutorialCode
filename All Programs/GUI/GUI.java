import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUI implements ActionListener {
	private static JFrame frame;// frame is the window
	private static JPanel panel;//panel is the blank space
	private static JLabel Userlabel;// label adds labels to the panel
	private static JLabel Passwordlabel;
	private static JLabel Success;
	private static JTextField Usertext;// it given input box to the panel
	private static JTextField Passwordtext;
	private static JButton button;//It puts thebutton in the panel
	public static void main(String[] args) {
		
		panel = new JPanel();
		panel.setLayout(null);
		
		frame = new JFrame();
		frame.setSize(300,250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);//Added panel to the frame
		//the blank area int output is the panel

		Userlabel = new JLabel("User");
		Userlabel.setBounds(10, 20, 80, 25);
		panel.add(Userlabel);
		
		Passwordlabel = new JLabel("Password");
		Passwordlabel.setBounds(10, 50, 80, 25);
		panel.add(Passwordlabel);
		
		Success =new JLabel("");//this label will only show if user and password are correct
		Success.setBounds(10, 130, 300, 25);
		panel.add(Success);
		
		Usertext = new JTextField(20);//textfield gives an input box to write text and 20 is that box's length
		Usertext.setBounds(100, 20, 165, 25);//set Bounds sets the location 
		panel.add(Usertext);//i had to add every component to the panel to make it visible 

		Passwordtext =new JTextField(20);
		Passwordtext.setBounds(100, 50, 165, 25);
		panel.add(Passwordtext);
		
		button = new JButton("Login");
		button.addActionListener(new GUI());
		button.setBounds(10, 100, 80, 25);
		panel.add(button);		
		
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String user=Usertext.getText();
		String CoreectUserName=new String("rishiraj");
		String CorrectPassword=new String("password");
		String password=Passwordtext.getText();
		if(user.equals(CoreectUserName) && password.equals(CorrectPassword))
			Success.setText("Login Successful!");
		else
			Success.setText("Login Failed Please Enter Correct credentials");
	}

}
