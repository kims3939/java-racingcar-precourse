package racingcar.domain;

public class MovingCondition {
    private static final int MOVE_COND = 4;
    private final int number;

    public MovingCondition(int number) {
        this.number = number;
    }

    public boolean isMovable() {
        return number >= MOVE_COND;
    }
}
