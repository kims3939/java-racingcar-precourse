package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingGameTest {

    @Test
    @DisplayName("경주 게임은 자동차들의 이름을 전달받아서 자동차들을 만든다")
    void make_lineup() {
        //given
        String car1 = "car1";
        String car2 = "car2";

        RacingGame racingGame = new RacingGame();

        //when
        Lineup lineup = racingGame.setLineup(car1, car2);

        //then
        assertThat(lineup.numberOfCars()).isEqualTo(2);
    }
}
