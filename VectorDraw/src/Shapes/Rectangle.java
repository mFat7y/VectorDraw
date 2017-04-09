package Shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import eg.edu.alexu.csd.oop.draw.Shape;

public class Rectangle implements Shape{

	private Point myPos=null;
	private Map<String, Double> myProp=null;
	private Color myColor=null;
	private Color myFillColor=null;
	
	public Rectangle() {
		myProp = new HashMap<String,Double>();
		myProp.put("Length", 0.0);
		myProp.put("Width", 0.0);
		myProp.put("Rotation", 0.0);
	}
	@Override
	public void setPosition(Point position) {
		myPos = position;
	}

	@Override
	public Point getPosition() {
		return myPos;
	}

	@Override
	public void setProperties(Map<String, Double> properties) {
		for(Entry<String, Double> mp : properties.entrySet()){
			myProp.put(mp.getKey(), mp.getValue());
		}
	}

	@Override
	public Map<String, Double> getProperties() {
		return myProp;
	}

	@Override
	public void setColor(Color color) {
		myColor = color;
	}

	@Override
	public Color getColor() {
		return myColor;
	}

	@Override
	public void setFillColor(Color color) {
		myFillColor = color;
		
	}

	@Override
	public Color getFillColor() {
		return myFillColor;
	}

	@Override
	public void draw(Graphics canvas) {
		canvas.setColor(myFillColor);
		canvas.fillRect(myPos.x, myPos.y, myProp.get("Length").intValue(), myProp.get("Width").intValue());
		canvas.setColor(myColor);
		canvas.drawRect(myPos.x, myPos.y, myProp.get("Length").intValue(), myProp.get("Width").intValue());
	}

	@Override
	public Object clone() {
		return null;
		
	}
		
}
