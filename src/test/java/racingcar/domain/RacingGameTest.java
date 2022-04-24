package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RacingGameTest {

    @Test
    @DisplayName("경주 게임은 자동차들의 이름을 전달받아서 자동차들을 만든다")
    void make_lineup() {
        //given
        RacingGame racingGame = new RacingGame();

        //when
        Lineup lineup = racingGame.setLineup("car1", "car2");

        //then
        assertThat(lineup.numberOfCars()).isEqualTo(2);
    }

    @Test
    @DisplayName("경주 게임은 중복된 이름의 자동차를 만들 수 없다")
    void duplicate_car_name() {
        //given
        RacingGame racingGame = new RacingGame();

        //when
        Throwable throwable = catchThrowable(() -> racingGame.setLineup("car", "car"));

        //then
        assertThat(throwable).isInstanceOf(IllegalArgumentException.class);
    }
}
