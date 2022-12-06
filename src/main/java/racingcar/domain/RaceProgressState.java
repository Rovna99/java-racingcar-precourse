package racingcar.domain;

import java.util.LinkedHashMap;
import java.util.Map;

public class RaceProgressState {
	private final Map<Car, Integer> raceState = new LinkedHashMap<>();

	public RaceProgressState(Cars cars) {
		initialState(cars);
	}

	public void updateState(Car car) {
		raceState.put(car, raceState.get(car) + 1);
	}

	private void initialState(Cars cars) {
		for (Car raceCar : cars.getRaceCars()) {
			raceState.put(raceCar , 0);
		}
	}
}
