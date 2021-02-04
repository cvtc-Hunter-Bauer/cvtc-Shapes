package edu.cvtc.java;

import javax.swing.JOptionPane;

public class Cylinder implements Shape {

	// Attributes
	private float radius = (float) (0.0);
	private float height = (float) (0.0);
	
	// Overloaded Constructor
	public Cylinder(float radius, float height) {
		this.setRadius(radius);
		this.setHeight(height);
	}
	
	

	// Get the radius of our cylinder
	public float getRadius() {
		return radius;
	}

	// Set the radius of our cylinder
	private void setRadius(float radius) {
		this.radius = radius;
	}

	// Get the height of our cylinder
	public float getHeight() {
		return height;
	}

	// Set the height of our cylinder
	private void setHeight(float height) {
		this.height = height;
	}

	
	// Calculate the surface area of our cylinder
	@Override
	public float surfaceArea() {
		// The equation for the surface area of a cylinder is (2 * PIE * radius * height) + (2 * PIE * radius^2)
		return (float) ((2 * Math.PI * getRadius() * getHeight()) + (2 * Math.PI * Math.pow(radius, 2)));
	}

	
	// Calculate the volume of our cylinder
	@Override
	public float volume() {
		// The equation for the volume of a cylinder is (PIE * radius^2 * height)
		return (float) (Math.PI * Math.pow(getRadius(), 2) * getHeight());
	}

	// Render and display a dialog box contain the surface area and volume of our Cylinder
	@Override
	public void render() {
		
		String displayMesseage = "With the dimensions of the Cylinder being: \n" + "radius: " + getRadius() + "\n" + "Height: " + getHeight() + "\n\n";
		
		displayMesseage += "The Surface Area of the Cylinder is: " + surfaceArea() + "\n";
		
		displayMesseage += "The volume of the Cylinder is: " + volume() + "\n";
		
		JOptionPane.showMessageDialog(null, displayMesseage);
	}

}
