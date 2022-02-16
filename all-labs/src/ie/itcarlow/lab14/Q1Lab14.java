package ie.itcarlow.lab14;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Dimension;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			16/02/2022
public class Q1Lab14 extends JFrame
{
	private static final long serialVersionUID = 6570344005481546643L;
	private JPanel mainPanel;

	/* Launch the application. */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Q1Lab14 frame = new Q1Lab14();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/* Create the frame. */
	@SuppressWarnings({"rawtypes", "unchecked"})
	public Q1Lab14()
	{
		setLocationByPlatform(true);
		setSize(new Dimension(514, 216));
		setName("Printer");
		setPreferredSize(new Dimension(450, 225));
		setTitle("Printer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 448, 215);
		mainPanel = new JPanel();
		mainPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		JPanel buttonsPanel = new JPanel();
		buttonsPanel.setBounds(315, 0, 109, 168);
		mainPanel.add(buttonsPanel);
		buttonsPanel.setLayout(null);
		
		JButton okButton = new JButton("Ok");
		okButton.setBounds(10, 20, 85, 30);
		okButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonsPanel.add(okButton);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(10, 56, 85, 30);
		cancelButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonsPanel.add(cancelButton);
		
		JButton setupButton = new JButton("Setup");
		setupButton.setBounds(10, 92, 85, 30);
		setupButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		setupButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		buttonsPanel.add(setupButton);
		
		JButton helpButton = new JButton("Help");
		helpButton.setBounds(10, 128, 85, 30);
		helpButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		buttonsPanel.add(helpButton);
		
		JPanel printingPanel = new JPanel();
		printingPanel.setBounds(10, 0, 307, 123);
		mainPanel.add(printingPanel);
		printingPanel.setLayout(null);
		
		JLabel printerLabel = new JLabel("Printer: My Printer");
		printerLabel.setBounds(10, 10, 113, 15);
		printerLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		printingPanel.add(printerLabel);
		
		JCheckBox imageBox = new JCheckBox("Image");
		imageBox.setBounds(64, 39, 59, 21);
		printingPanel.add(imageBox);
		
		JCheckBox codeBox = new JCheckBox("Code");
		codeBox.setBounds(64, 62, 59, 21);
		printingPanel.add(codeBox);
		
		JCheckBox textBox = new JCheckBox("Text");
		textBox.setBounds(64, 85, 58, 21);
		printingPanel.add(textBox);
		
		JRadioButton selectionRadioBt = new JRadioButton("Selection");
		selectionRadioBt.setBounds(171, 39, 82, 21);
		printingPanel.add(selectionRadioBt);
		
		JRadioButton allRadioBt = new JRadioButton("All");
		allRadioBt.setBounds(171, 62, 72, 21);
		printingPanel.add(allRadioBt);
		
		JRadioButton appletRadioBt = new JRadioButton("Applet");
		appletRadioBt.setBounds(171, 85, 72, 21);
		printingPanel.add(appletRadioBt);
		
		JPanel qualityPanel = new JPanel();
		qualityPanel.setBounds(10, 123, 307, 45);
		mainPanel.add(qualityPanel);
		qualityPanel.setLayout(null);
		
		JCheckBox checkPrintToFile = new JCheckBox("Print to file");
		checkPrintToFile.setBounds(188, 12, 109, 23);
		checkPrintToFile.setFont(new Font("Tahoma", Font.BOLD, 12));
		qualityPanel.add(checkPrintToFile);
		
		JLabel qualityLabel = new JLabel("Print Quality:");
		qualityLabel.setBounds(10, 16, 81, 15);
		qualityLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		qualityPanel.add(qualityLabel);
		
		JComboBox qualityList = new JComboBox();
		qualityList.setBounds(107, 12, 66, 21);
		qualityList.setFont(new Font("Tahoma", Font.BOLD, 12));
		qualityList.setModel(new DefaultComboBoxModel(new String[] {"High", "Low"}));
		qualityPanel.add(qualityList);
	}
}
