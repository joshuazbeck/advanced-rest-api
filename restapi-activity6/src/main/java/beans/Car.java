package beans;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * This is an object used to hold an car's information
 * @author Josh Beck
 *
 */

@XmlRootElement
public class Car {

	/********* DECLARATIONS *************/
	int wheels;
	boolean isSteeringWheelSideRight;
	float price;
	String name;

	/********* GETTERS/SETTERS *************/
	public int getWheels() {
		return wheels;
	}
	public void setWheels(int wheels) {
		this.wheels = wheels;
	}
	public boolean isSteeringWheelSideRight() {
		return isSteeringWheelSideRight;
	}
	public void setSteeringWheelSideRight(boolean isSteeringWheelSideRight) {
		this.isSteeringWheelSideRight = isSteeringWheelSideRight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	/********* CONSTRUCTORS *************/
	public Car(int wheels, boolean isSteeringWheelSideRight, float price, String name) {
		super();
		this.wheels = wheels;
		this.isSteeringWheelSideRight = isSteeringWheelSideRight;
		this.price = price;
		this.name = name;
	}
	public Car() {
		super();
	}
	
	
}
