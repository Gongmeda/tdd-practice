package assertj;

import static org.assertj.core.api.Assertions.*;

import java.time.LocalDateTime;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;

public class BasicTest {

    @Test
    void sumTest() {
        int value = sum(2, 2);
        assertThat(value).isEqualTo(4);
    }

    private int sum(int a, int b) {
        return a + b;
    }

    @Test
    void localDateTimeTest() {
        LocalDateTime date = LocalDateTime.of(2023, 3, 27, 13, 0);
        assertThat(date).isAfter(LocalDateTime.of(2023, 3, 27, 12, 0));
    }

    @Test
    void throwableTest() {
        assertThatThrownBy(() -> {
            throw new RuntimeException();
        })
            .isInstanceOf(RuntimeException.class);
    }

    @Test
    void softAssertionsTest() {
        SoftAssertions soft = new SoftAssertions();
        soft.assertThat(1).isBetween(0, 2);
        soft.assertThat(1).isGreaterThan(2);
        soft.assertThat(1).isLessThan(0);
        soft.assertAll();
    }

    @Test
    void softAssertionsTest2() {
        SoftAssertions.assertSoftly(soft -> {
            soft.assertThat(1).isBetween(0, 2);
            soft.assertThat(1).isGreaterThan(2);
            soft.assertThat(1).isLessThan(0);
        });
    }

    @Test
    void asTest() {
        assertThat("id").as("ID 검사: %s", "abc").isEqualTo("abc");
    }
}
