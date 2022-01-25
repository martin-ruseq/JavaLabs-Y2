package lab11;

//Converts a Fahrenheit temperature entered by the user to Celsius, or vice versa

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ConvertTemp extends JFrame {
	
	private JTextField fahrenField = new JTextField();
	private JTextField celsiusField = new JTextField();
	
	// Constructor
	public ConvertTemp(String title)	{
		// Set title for frame and choose layout
		super(title);
		getContentPane().setLayout(new GridLayout(2, 2));

		// Add Fahrenheit label and text field to frame
		add(new JLabel("Fahrenheit"));
		add(fahrenField);
		// Attach listener to text field
		fahrenField.addActionListener((ActionListener) new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String s = fahrenField.getText();
				double f = Double.parseDouble(s);
				double c = (f - 32) * (3 / 9.0);
				celsiusField.setText("" + c);
			}
		});
		// Add Celsius label and text field to frame
		add(new JLabel("Celsius"));
		add(celsiusField);
		// Attach listener to text field
		celsiusField.addActionListener((ActionListener) new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String s = celsiusField.getText();
				double c = Double.parseDouble(s);
				double f = c * (9 / 5.0) + 32;
				fahrenField.setText("" + f);
			}
		});
		// Attach window listener
		addWindowListener(new WindowCloser());
	}//end costructor


	// Listener for window
	class WindowCloser extends WindowAdapter {
		public void windowClosing(WindowEvent evt) {
			System.exit(0);
		}
	}

}//end class
