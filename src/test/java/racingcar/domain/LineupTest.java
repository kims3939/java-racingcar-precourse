package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LineupTest {

    @ParameterizedTest
    @CsvSource(value = {"car1, 4", "car2, 5", "car3, 6"})
    @DisplayName("자동차 라인업은 조건을 전달받아서 경기 결과를 반환한다")
    void send_condition_to_cars(String winnerName, int winnerNum) {
        //given
        String loserName = "loser";
        int loserNum = 3;

        Car winner = new Car(winnerName);
        Car loser = new Car(loserName);
        Lineup lineup = new Lineup();
        lineup.addCar(winner);
        lineup.addCar(loser);

        MovingCondition winnerCond = new MovingCondition(winnerNum);
        MovingCondition loserCond = new MovingCondition(loserNum);
        MovingConditions conditions = new MovingConditions();
        conditions.match(winner, winnerCond);
        conditions.match(loser, loserCond);

        //when
        RacingReport racingReport = lineup.race(conditions);

        //then
        assertThat(racingReport).isNotNull();
        assertThat(racingReport.winners()).containsOnly(winner);
    }

}
