package edu.cvtc.java;

import javax.swing.JOptionPane;

public class Cuboid implements Shape {

	// Attributes 
	private float width = (float) 0.0;
	private float height = (float) 0.0;
	private float depth = (float) 0.0;
	
	
	// Overloaded Constructor
	public Cuboid(float width, float height, float depth) {
		this.setWidth(width);
		this.setHeight(height);
		this.setDepth(depth);
	}

	
	
	// Get the width of our Cuboid
	public float getWidth() {
		return width;
	}

	// set the width of our Cuboid
	public void setWidth(float width) {
		this.width = width;
	}

	// Get the height of our Cuboid
	public float getHeight() {
		return height;
	}

	// set the height of our Cuboid
	public void setHeight(float height) {
		this.height = height;
	}
	
	// Get the depth of our Cuboid
	public float getDepth() {
		return depth;
	}
	
	// set the depth of our Cuboid
	public void setDepth(float depth) {
		this.depth = depth;
	}

	
	// Calculate the surface area of a cuboid
	@Override
	public float surfaceArea() {
		// The equation to find the surface area of a cuboid is (2 * depth * width) + (2 * width * height) + (2 * height * depth)
		
		double sidesLeftRight = 2 * getDepth() * getWidth();
		double sidesFrontBack = 2 * getWidth() * getHeight();
		double sidesTopBottom = 2 * getHeight() * getDepth();
		
		return (float) (sidesLeftRight + sidesFrontBack + sidesTopBottom);
	}

	// calculate the volume of a cuboid
	@Override
	public float volume() {
		// The equation for the volume of a cuboid is (width * depth * height)
		return (float) (getWidth() * getDepth() * getHeight());
	}

	// Render and display a dialog box contain the surface area and volume of our cuboid
	@Override
	public void render() {
			
		String displayMesseage = "With the dimensions of the cuboid being: \n" + "Width: " + getWidth() + "\n" + "Height: " + getHeight() + "\n" + "Depth: " + getDepth() + "\n\n";
		
		displayMesseage += "The Surface Area of the cuboid is: " + surfaceArea() + "\n";
		
		displayMesseage += "The volume of the cuboid is: " + volume() + "\n";
		
		JOptionPane.showMessageDialog(null, displayMesseage);
	}

}
