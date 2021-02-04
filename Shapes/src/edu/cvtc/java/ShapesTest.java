package edu.cvtc.java;

import javax.swing.JOptionPane;

import java.util.Scanner;

public class ShapesTest {

	public static void main(String[] args) {
		
		//variables
		Scanner keyboard = new Scanner(System.in);
		

		
		// Cuboid
		float cuboidWidth;
		float cuboidHeight;
		float cuboidDepth;
		
		// Cylinder
		float cylinderHeight;
		float cylinderRadius;
		
		// Sphere
		float sphereRadius;
		
		// Get the inputs for our cuboid
		cuboidWidth = testValue("Please enter the width for our cuboid");
		cuboidHeight = testValue("Please enter the height for our cuboid");
		cuboidDepth = testValue("Please enter the depth for our cuboid");
		
		// Get the inputs for our cylinder
		cylinderHeight = testValue("Please enter the height for our cylinder");
		cylinderRadius = testValue("Please enter the Radius for our cylinder");
		
		// Get the inputs for our sphere
		sphereRadius = testValue("Please enter the Radius for our sphere");
		
		Cuboid cuboid = new Cuboid(cuboidWidth, cuboidHeight, cuboidDepth);
		Cylinder cylinder = new Cylinder(cylinderRadius,cylinderHeight);
		Sphere sphere = new Sphere(sphereRadius);
		
		cuboid.render();
		cylinder.render();
		sphere.render();
		
		keyboard.close();

	
	}
	
	public static float testValue(String prompt) {
		String strValue = JOptionPane.showInputDialog(prompt);
		
		// First see if our input is empty
		if (strValue.isBlank()) {
			JOptionPane.showMessageDialog(null, "Please enter a number");
			testValue(prompt);
		}
		
		// Second try to convert it to a float value
		try {
			float floatValue = Float.parseFloat(strValue);
			
			// Third check to see if the value of our input is positive
			if(floatValue > -1) {
				return floatValue;
			} else {
				JOptionPane.showMessageDialog(null, "Please enter a positive number");
				testValue(prompt);
			}
		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Please enter a number");
			testValue(prompt);
		}
		return 0;
	}
	
}
