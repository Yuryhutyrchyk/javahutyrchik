package carParking;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Parking {

	public static void main(String[] args) {
		Semaphore semaphore = new Semaphore(2);
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("Car 1",semaphore));
		cars.add(new Car("Car 2",semaphore));
		cars.add(new Car("Car 3",semaphore));
		cars.add(new Car("Car 4",semaphore));
		cars.add(new Car("Car 5",semaphore));
		cars.add(new Car("Car 6",semaphore));		
	}
}