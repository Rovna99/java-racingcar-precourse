package racingcar.domain;

import java.util.List;

public class Cars {
	private final List<Car> raceCars;

	public Cars(List<Car> cars) {
		this.raceCars = cars;
	}

	public void moveOneTime() {

	}

	public List<Car> getRaceCars() {
		return raceCars;
	}
}
