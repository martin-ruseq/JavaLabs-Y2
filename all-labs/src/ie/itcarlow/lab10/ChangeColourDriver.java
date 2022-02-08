package ie.itcarlow.lab10;

//Student Name:		Marcin Rusiecki
//Student ID:		C00263263
//Date:				11/01/2022

import javax.swing.JFrame;

public class ChangeColourDriver {

	public static void main(String[] args) {
	
		ChangeColour changeColour = new ChangeColour("Button");
		changeColour.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		changeColour.setSize(500, 300);
		changeColour.setVisible(true);

	}//end main

}//end class
