package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import java.util.List;
import racingcar.domain.Car;

public class View {

    private View() {
    }

    public static String getCarNames() {
        return Console.readLine().trim();
    }

    public static String getCount() {
        return Console.readLine().trim();
    }

    public static void printCars(List<Car> cars) {
        System.out.println("실행 결과");

        for (Car car : cars) {
            printCar(car);
        }
    }

    public static void printCar(Car car) {
        StringBuilder builder = new StringBuilder();
        builder.append(car.getName()).append(" : ");
        for (int i = 0; i < car.getDistance(); i++) {
            builder.append("-");
        }
        System.out.println(builder);
    }

    public static void printWinners(List<Car> winners) {
        StringBuilder builder = new StringBuilder();
        builder.append("최종 우승자는 ")
                .append(winners.get(0).getName());
        for (int i = 1; i < winners.size(); i++) {
            builder.append(",").append(winners.get(i).getName());
        }
        builder.append("입니다");
        System.out.println(builder);
    }
}
