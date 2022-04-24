package racingcar.domain;

import java.util.ArrayList;
import java.util.List;

public class Lineup {

    private final List<Car> cars = new ArrayList<>();

    public void addCar(Car car) {
        cars.add(car);
    }

    public int numberOfCars() {
        return cars.size();
    }

    public RacingReport race(MovingConditions conditions) {
        RacingReport racingReport = new RacingReport();

        for(Car car : cars) {
            MovingCondition condition = conditions.conditionOf(car);
            Distance distance = car.move(condition);
            racingReport.write(car, distance);

        }

        return racingReport;
    }
}
