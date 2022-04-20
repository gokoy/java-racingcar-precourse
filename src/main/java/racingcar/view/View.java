package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class View {

    private View() {
    }

    public static String getCarNames() {
        return Console.readLine().trim();
    }
}
