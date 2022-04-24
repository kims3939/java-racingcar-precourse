package racingcar.domain;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.catchThrowable;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    @DisplayName("자동차는 5자 이하의 이름을 가진다")
    void valid_car_name() {
        //given
        String name = "12345";

        //when
        Car car = new Car(name);

        //then
        assertThat(car.getName()).isEqualTo(name);
    }

    @Test
    @DisplayName("자동차는 6자 이상의 이름을 가질 수 없다")
    void invalid_too_long_car_name() {
        //given
        String name = "123456";

        //when
        Throwable throwable = catchThrowable(() -> new Car(name));

        //then
        assertThat(throwable).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("자동차는 빈 이름을 가질 수 없다")
    void invalid_empty_car_name() {
        //given
        String name = "";

        //when
        Throwable throwable = catchThrowable(() -> new Car(name));

        //then
        assertThat(throwable).isInstanceOf(IllegalArgumentException.class);
    }
}
