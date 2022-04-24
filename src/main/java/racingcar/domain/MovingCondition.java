package racingcar.domain;

public class MovingCondition {
    private static final int MOVE_COND = 4;
    private final int number;

    public MovingCondition(int number) {
        assertNumber(number);
        this.number = number;
    }

    public boolean isMovable() {
        return number >= MOVE_COND;
    }

    private void assertNumber(int number) {
        if (number < 0 || number > 9) {
            throw new IllegalArgumentException();
        }
    }
}
