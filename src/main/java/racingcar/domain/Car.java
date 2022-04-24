package racingcar.domain;

public class Car {

    private final String name;
    private final Distance distance;

    public Car(String name) {
        validateName(name);
        this.name = name;
        this.distance = new Distance(0);
    }

    public String getName() {
        return name;
    }

    private void validateName(String name) {
        if (name.isEmpty() || name.length() > 5) {
            throw new IllegalArgumentException();
        }
    }

    public Movement move(MovingCondition condition) {
        if (condition.isMovable()) {
            distance.add();
            return Movement.FORWARD;
        }

        return Movement.STOP;
    }

    public Distance countDistance() {
        return distance;
    }
}
