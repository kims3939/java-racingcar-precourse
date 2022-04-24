package racingcar.domain;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RacingGame {

    private final Lineup lineup;

    public RacingGame(String ...carNames) {
        assertDuplicateNames(carNames);
        lineup = new Lineup(carNames);
    }

    public Lineup getLineup() {
        return lineup;
    }

    private void assertDuplicateNames(String... names) {
        Set<String> nameSet = new HashSet<>(Arrays.asList(names));
        if (nameSet.size() < names.length) {
            throw new IllegalArgumentException();
        }
    }
}
