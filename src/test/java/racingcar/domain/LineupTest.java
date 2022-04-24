package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class LineupTest {

    @ParameterizedTest
    @CsvSource(value = {"car1, 4", "car2, 5", "car3, 6"})
    @DisplayName("자동차 라인업은 조건을 전달받아서 경기 결과를 반환한다")
    void send_condition_to_cars(String winner, int conditionNum) {
        //given
        String loser = "loser";
        int loserConditionNum = 3;

        Lineup lineup = new Lineup(winner, loser);
        MovingCondition winnerCondition = new MovingCondition(conditionNum);
        MovingCondition loserCondition = new MovingCondition(loserConditionNum);

        //when
        RacingReport racingReport = lineup.race(winnerCondition, loserCondition);

        //then
        assertThat(racingReport).isNotNull();
        assertThat(racingReport.winners()).containsOnly(new Car(winner));
    }


}
