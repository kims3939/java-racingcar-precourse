package racingcar.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RacingReport {

    private final Map<Car, Distance> report = new HashMap<>();

    public List<Car> winners() {
        Distance longest = longestDistance();
        List<Car> winners = new ArrayList<>();

        for(Car car : report.keySet()) {
            if (report.get(car).equals(longest)) {
                winners.add(car);
            }
        }

        return winners;
    }

    public void write(Car car, Distance distance) {
        report.put(car, distance);
    }

    private Distance longestDistance() {
        Distance longest = new Distance(0);
        for (Distance distance :  report.values()) {
            if (distance.longerThen(longest)) {
                longest = distance;
            }
        }

        return longest;
    }
}
