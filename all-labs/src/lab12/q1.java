package lab12;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


// Student Name:	Marcin Rusiecki
// Student ID:		C00263263
// Date:			01/02/2022

public class q1 extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnOK = new JButton("OK");
	private JButton btnCancle = new JButton("Cancle");
	private JButton btnHelp = new JButton("Help");
	
	private JCheckBox cBox1 = new JCheckBox("Snap to Grid");
	private JCheckBox cBox2 = new JCheckBox("Show Grid");
	
	private JLabel lblX = new JLabel("X: ");
	private JLabel lblY = new JLabel("Y: ");
	private JTextField fieldX = new JTextField();
	private JTextField fieldY = new JTextField();
	
	// Constructor
	public q1(String Align)	
	{
		// Set title for frame and choose layout
		super(Align);
		setTitle("Align");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		LayoutManager layout = new BorderLayout();
		getContentPane().setLayout(layout);
		
		JPanel buttonPanel = new JPanel();
		LayoutManager boxLayout = new BoxLayout(buttonPanel, BoxLayout.Y_AXIS);
		buttonPanel.setLayout(boxLayout);
		btnOK.setMaximumSize(new Dimension(120,30));
		btnCancle.setMaximumSize(new Dimension(120, 30));
		btnHelp.setMaximumSize(new Dimension (120,30));
		buttonPanel.add(btnOK);
		buttonPanel.add(Box.createVerticalStrut(10));
		buttonPanel.add(btnCancle);
		buttonPanel.add(Box.createVerticalStrut(10));
		buttonPanel.add(btnHelp);
		buttonPanel.add(Box.createVerticalGlue());

		getContentPane().add(buttonPanel, BorderLayout.EAST);
		
		JPanel mainPanel = new JPanel();
		LayoutManager gridLayout = new GridLayout(2, 2);
		mainPanel.setLayout(gridLayout);
		cBox1.setHorizontalAlignment(SwingConstants.CENTER);
		cBox1.setAlignmentX(0.5f);
		
		mainPanel.add(cBox1);
		
		JPanel xPanel = new JPanel();
		LayoutManager boxLayout2 = new BoxLayout(xPanel, BoxLayout.X_AXIS);
		xPanel.setLayout(boxLayout2);
		fieldX.setMaximumSize(new Dimension(40,40));
		xPanel.add(lblX);
		xPanel.add(fieldX);
		mainPanel.add(xPanel);
		cBox2.setHorizontalAlignment(SwingConstants.CENTER);
		
		mainPanel.add(cBox2);
		
		JPanel yPanel = new JPanel();
		LayoutManager boxLayout3 = new BoxLayout(yPanel, BoxLayout.X_AXIS);
		yPanel.setLayout(boxLayout3);
		yPanel.add(lblY);
		fieldY.setHorizontalAlignment(SwingConstants.CENTER);
		yPanel.add(fieldY);
		fieldY.setMaximumSize(new Dimension(40,40));
		mainPanel.add(yPanel);
		
		getContentPane().add(mainPanel, BorderLayout.CENTER);
	}
}

