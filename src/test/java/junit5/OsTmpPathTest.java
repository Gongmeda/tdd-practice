package junit5;

import static org.junit.jupiter.api.Assertions.*;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfSystemProperty;
import org.junit.jupiter.api.condition.EnabledOnJre;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.JRE;
import org.junit.jupiter.api.condition.OS;

public class OsTmpPathTest {

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void windowTmpPath() {
        Path tmpPath = Paths.get("c:\\Temp");
        assertTrue(Files.isDirectory(tmpPath));
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void linuxTmpPath() {
        Path tmpPath = Paths.get("/Temp");
        assertTrue(Files.isDirectory(tmpPath));
    }

    @Test
    @EnabledOnJre({JRE.JAVA_8, JRE.JAVA_9, JRE.JAVA_10, JRE.JAVA_11})
    void testOnJre() {
        assertEquals(LocalDate.of(1919, 3, 1), LocalDate.of(2019, 3, 1).minusYears(100));
    }

    @Test
    @EnabledIfSystemProperty(named = "java.vm.name", matches = ".*OpenJDK.*")
    void openJdk() {
        assertEquals(2, 1 + 1);
    }
}
