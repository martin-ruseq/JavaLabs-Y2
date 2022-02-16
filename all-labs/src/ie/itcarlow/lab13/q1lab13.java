package ie.itcarlow.lab13;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Dimension;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			08/02/2022

public class q1lab13 extends JFrame
{
	private JPanel mainPanel;

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					q1lab13 frame = new q1lab13();
					frame.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	public q1lab13()
	{
		setTitle("ColorSelect");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 173);
		mainPanel = new JPanel();
		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel optionPanel = new JPanel();
		optionPanel.setBounds(0, 0, 386, 91);
		mainPanel.add(optionPanel);
		optionPanel.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 5, 366, 30);
		comboBox.setBackground(Color.LIGHT_GRAY);
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox.setMinimumSize(new Dimension(29, 30));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"RED", "GREEN", "BLUE"}));
		optionPanel.add(comboBox);
		
		JCheckBox checkForground = new JCheckBox("Foreground");
		checkForground.setBounds(193, 55, 106, 21);
		checkForground.setPreferredSize(new Dimension(81, 30));
		checkForground.setFont(new Font("Tahoma", Font.PLAIN, 14));
		optionPanel.add(checkForground);
		
		JCheckBox checkBackgroud = new JCheckBox("Backgrount");
		checkBackgroud.setBounds(85, 55, 106, 21);
		checkBackgroud.setPreferredSize(new Dimension(79, 30));
		checkBackgroud.setFont(new Font("Tahoma", Font.PLAIN, 14));
		optionPanel.add(checkBackgroud);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBounds(0, 94, 386, 42);
		mainPanel.add(buttonPanel);
		
		JButton okButton = new JButton("Ok");
		okButton.setBounds(114, 5, 63, 30);
		okButton.setPreferredSize(new Dimension(47, 30));

		buttonPanel.setLayout(null);
		buttonPanel.add(okButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(187, 5, 73, 30);
		cancelButton.setPreferredSize(new Dimension(63, 30));
		buttonPanel.add(cancelButton);
	}
}
