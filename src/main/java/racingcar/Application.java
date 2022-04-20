package racingcar;

import java.util.List;
import racingcar.domain.Car;
import racingcar.domain.Racing;
import racingcar.util.Validator;
import racingcar.view.View;

public class Application {

    public static void main(String[] args) {
        String carNames = inputCarNames();
        String count = inputCount();

        Racing racing = new Racing(carNames, count);

        while (racing.isRunning()) {
            List<Car> cars = racing.race();
            View.printCars(cars);
        }

        List<Car> winners = racing.getWinners();
        View.printWinners(winners);
    }

    private static String inputCarNames() {
        String carNames = View.getCarNames();
        while (!Validator.validateCarName(carNames)) {
            carNames = View.getCarNames();
        }
        return carNames;
    }

    private static String inputCount() {
        String count = View.getCount();
        while (!Validator.validateCount(count)) {
            count = View.getCount();
        }
        return count;
    }
}
