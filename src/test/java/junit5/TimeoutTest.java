package junit5;

import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class TimeoutTest {

    @Test
    @Timeout(1)
    void sleep2seconds() throws InterruptedException {
        Thread.sleep(2000);
    }

    @Test
    @Timeout(value = 500, unit = TimeUnit.MILLISECONDS)
    void sleep40Mills() throws InterruptedException {
        Thread.sleep(40);
    }
}
