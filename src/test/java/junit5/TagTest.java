package junit5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("integration")
public class TagTest {

    @Tag("very-slow")
    @Test
    void verySlow() throws InterruptedException {
        Thread.sleep(5000);
        assertEquals(0, 0);
    }
}
