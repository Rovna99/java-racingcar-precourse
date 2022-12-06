package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

import racingcar.Car;

public class RaceCarGenerator {
	private final String carNames;

	public RaceCarGenerator(String input) {
		carNames = input;
	}

	public List<Car> generateCars() {
		List<Car> raceCars = new ArrayList<>();
		for (String name : carNames.split(",")) {
			raceCars.add(new Car(name));
		}
		return raceCars;
	}
}
