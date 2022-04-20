package racingcar;

import racingcar.domain.Racing;
import racingcar.view.View;

public class Application {

    public static void main(String[] args) {
        String carNames = View.getCarNames();
        String count = View.getCount();
        Racing racing = new Racing(carNames, count);

    }
}
