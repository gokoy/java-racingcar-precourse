package racingcar.view;

import camp.nextstep.edu.missionutils.Console;

public class View {

    private View() {
    }

    public static String getCarNames() {
        return Console.readLine().trim();
    }

    public static String getCount() {
        return Console.readLine().trim();
    }
}
