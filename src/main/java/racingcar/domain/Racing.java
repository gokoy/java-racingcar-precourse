package racingcar.domain;

public class Racing {

    private final List<Car> cars;
    private int count;

    public Racing(String carNames, String count) {
        isIntegerGreaterThanZero(count);
        this.count = Integer.parseInt(count);
    }

    private void isIntegerGreaterThanZero(String count) {
        try {
            Integer.parseInt(count);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("count must be an integer greater than 0.");
        }

        if (Integer.parseInt(count) <= 0) {
            throw new IllegalArgumentException("count must be an integer greater than 0.");
        }
    }
}
