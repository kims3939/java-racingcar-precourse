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

    public RacingReport race(MovingCondition... conditions) {
        RacingReport racingReport = new RacingReport();

        for (int i = 0; i < cars.size(); i++) {
            Car car = cars.get(i);
            Distance distance = car.move(conditions[i]);
            racingReport.write(car, distance);
        }

        return racingReport;
    }
}
