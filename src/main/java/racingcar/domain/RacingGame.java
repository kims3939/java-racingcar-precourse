package racingcar.domain;

public class RacingGame {

    private Lineup lineup;

    public Lineup setLineup(String... carNames) {
        lineup = new Lineup(carNames);
        return lineup;
    }
}
