package business;

import java.util.List;

import javax.ejb.Local;

import beans.Car;
/**
This interface defines the method used to add a car to the internal array
 */
@Local
public interface CarBusinessInterface {

	/**
	* Add a car to the internal array
	 */
	public List<Car> addCar(int Quantity, boolean isSteeringWheelOnLeftSide, float price, String name);
	
}
