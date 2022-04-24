package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Lineup {

    private final List<Car> cars = new ArrayList<>();

    public Lineup(String... carNames) {
        for (String carName : carNames) {
            cars.add(new Car(carName));
        }
    }

    public int numberOfCars() {
        return cars.size();
    }
}
