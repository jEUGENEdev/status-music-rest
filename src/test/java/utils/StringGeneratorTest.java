package utils;

import com.jeugenedev.status_music.utils.StringGenerator;
import org.junit.jupiter.api.Test;

public class StringGeneratorTest {
    @Test
    public void generatorLatinTest() {
        StringGenerator stringGenerator = new StringGenerator();
        System.out.println(stringGenerator.generateLatinString(20));
    }
}
