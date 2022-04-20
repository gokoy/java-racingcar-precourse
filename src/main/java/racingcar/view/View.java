package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.dto.CarDto;

public class View {

    private View() {
    }

    public static String getCarNames() {
        return Console.readLine().trim();
    }

    public static String getCount() {
        return Console.readLine().trim();
    }

    public static void printCars(List<CarDto> dtos) {
        System.out.println("실행 결과");

        for (CarDto dto : dtos) {
            printCar(dto);
        }
    }

    public static void printCar(CarDto dto) {
        StringBuilder builder = new StringBuilder();
        builder.append(dto.getName()).append(" : ");
        for (int i = 0; i < dto.getDistance(); i++) {
            builder.append("-");
        }
        System.out.println(builder);
    }
}
