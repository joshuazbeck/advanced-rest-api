package business;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.inject.Alternative;

import beans.Car;

/**
 * Session Bean implementation class OrdersBusinessService
 */
@Stateless
@Local(CarBusinessInterface.class)
@LocalBean
@Alternative
public class CarBusinessService implements CarBusinessInterface {
	
	List<Car> cars = new ArrayList<Car>();
    /**
     * Default constructor. 
     */
    public CarBusinessService() {
    	
    	//Build dummy array
    	Car truck = new Car(21, true, 2999.99f, "Ford Truck 2022");
    	Car semi = new Car(3, true, 5000.00f, "Semi Truck");
    	Car sportsCar = new Car(33, true, 5000.00f, "Ford Challenger");
    	Car smartCar = new Car(2, false, 5000.00f, "European Tesla");
    	
    	cars.add(truck);
    	cars.add(semi);
    	cars.add(sportsCar);
    	cars.add(smartCar);
   
    }

    
	@Override
	public List<Car> addCar(int quantity, boolean isSteeringWheelOnLeftSide, float price, String name) {
		// Add the car to the array
		cars.add(new Car(quantity, isSteeringWheelOnLeftSide, price, name));
		return cars;
	}


}
