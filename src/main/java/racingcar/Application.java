package racingcar;

import java.util.List;
import racingcar.domain.Racing;
import racingcar.dto.CarDto;
import racingcar.view.View;

public class Application {

    public static void main(String[] args) {
        String carNames = View.getCarNames();
        String count = View.getCount();
        Racing racing = new Racing(carNames, count);

        while (racing.isRunning()) {
            List<CarDto> dtos = racing.race();
            View.printCars(dtos);
        }
    }
}
