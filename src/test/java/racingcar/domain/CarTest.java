package racingcar.domain;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mockStatic;

import camp.nextstep.edu.missionutils.Randoms;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.MockedStatic;

class CarTest {

    static MockedStatic<Randoms> mock;

    @BeforeAll
    static void beforeAll() {
        mock = mockStatic(Randoms.class);
    }

    @AfterAll
    static void afterAll() {
        mock.close();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 3})
    void 랜덤값_0에서_3_까지는_멈춤(int i) {
        //given
        mock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(i);
        Car car = new Car("car");

        //when
        car.move();

        //then
        Assertions.assertThat(car.getDistance()).isEqualTo(0);
    }

    @ParameterizedTest
    @ValueSource(ints = {4, 5, 6, 7, 8, 9})
    void 랜덤값_4에서_9_까지는_전진(int i) {
        //given
        mock.when(() -> Randoms.pickNumberInRange(anyInt(), anyInt())).thenReturn(i);
        Car car = new Car("car");

        //when
        car.move();

        //then
        Assertions.assertThat(car.getDistance()).isEqualTo(1);
    }

}