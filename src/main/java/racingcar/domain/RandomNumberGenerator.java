package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomNumberGenerator {
	private final int startNumber;
	private final int endNumber;

	public RandomNumberGenerator(int start, int end) {
		startNumber = start;
		endNumber = end;
	}

	public int generateNumber() {
		return Randoms.pickNumberInRange(startNumber, endNumber);
	}
}
