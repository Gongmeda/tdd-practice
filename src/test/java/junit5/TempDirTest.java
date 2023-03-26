package junit5;

import java.io.File;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class TempDirTest {

    @TempDir
    File tempFolder;

    @TempDir
    static File tempStaticFolder;

    @Test
    void fileTest() {
        System.out.println(tempFolder.getAbsolutePath());
        System.out.println(tempStaticFolder.getAbsolutePath());
    }

    @Test
    void fileTest2(@TempDir File tempParamDir) {
        System.out.println(tempFolder.getAbsolutePath());
        System.out.println(tempParamDir.getAbsolutePath());
    }

    @Test
    void fileTest3() {
        System.out.println(tempFolder.getAbsolutePath());
        System.out.println(tempStaticFolder.getAbsolutePath());
    }
}
