package edu.cvtc.java;

import javax.swing.JOptionPane;

public class Sphere implements Shape {

	// Attributes
	private float radius = (float) 0.0;
	
	
	// Overloaded Constructor
	public Sphere(float radius) {
		this.setRadius(radius);
	}

	
	// Get the sphere radius
	public float getRadius() {
		return radius;
	}

	// Set the sphere radius
	private void setRadius(float radius) {
		this.radius = radius;
	}

	// Calculate the surface area of our sphere
	@Override
	public float surfaceArea() {
		// The Equation for the surface area of a sphere is (4 * PIE * radius^2)
		return (float) (4 * Math.PI * Math.pow(getRadius(), 2));
	}

	// Calculate the volume of our sphere
	@Override
	public float volume() {
		// The Equation for the surface area of a sphere is (1.33 * PIE * radius^3)
		return (float) (1.33 * Math.PI * Math.pow(getRadius(), 3));
	}

	// Render and display a dialog box contain the surface area and volume of our sphere
	@Override
	public void render() {
		
		String displayMesseage = "With the radius of our Shpere being: " + getRadius() + "\n\n";
		
		displayMesseage += "The Surface Area of the Sphere is: " + surfaceArea() + "\n";
		
		displayMesseage += "The Volume of the Sphere is: " + volume() + "\n";
		
		JOptionPane.showMessageDialog(null, displayMesseage);
	}

}
