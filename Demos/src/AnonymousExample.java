import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class AnonymousExample extends JFrame {

	JButton button;
	public AnonymousExample()
	{
		setTitle("Button Action Example with and without Lambda Expression");
		setSize(400,300);
		setVisible(true);
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		button = new JButton("Button");
		button.setBounds(100,100,90,40);
		button.addActionListener(e-> 
		   System.out.println("Result for lambda Expression:::::"));
		button.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
				System.out.println("Result for Actionlistener::::"); 
			}  

		});
		add(button);
	}
	public static void main(String args[])
	{
		new AnonymousExample();
	} 
}
