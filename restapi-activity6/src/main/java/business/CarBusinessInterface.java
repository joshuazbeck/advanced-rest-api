package business;

import java.util.List;

import javax.ejb.Local;

import beans.Car;

@Local
public interface CarBusinessInterface {

	public List<Car> addCar(int Quantity, boolean isSteeringWheelOnLeftSide, float price, String name);
	
}
