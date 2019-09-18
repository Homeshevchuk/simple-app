package routes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import entities.Car;

@RestController
public class MainRoute {
	@RequestMapping("/cars")
	public List<Car> getListOfCars() {
		List<Car> cars = new ArrayList<Car>();
		cars.add(new Car("Volkswagen", 5));
		cars.add(new Car("Rolls Royce", 10));
		return cars;
	}
}
