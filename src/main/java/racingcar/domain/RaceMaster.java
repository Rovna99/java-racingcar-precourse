package racingcar.domain;

public class RaceMaster {
	private final RandomNumberGenerator generator;
	public RaceMaster(int start, int end) {
		generator = new RandomNumberGenerator(start, end);
	}

	public boolean isCanMove() {
		return generator.generateNumber() >= 4;
	}
}
