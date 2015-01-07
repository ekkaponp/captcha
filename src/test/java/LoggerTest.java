import org.junit.Test;
import util.FileLogger;

import java.io.IOException;

/**
 * Created by cadet on 1/7/15 AD.
 */
public class LoggerTest {

    @Test(expected = IOException.class)
    public void loggerShouldBeWritten() throws Exception {
        FileLogger fileLogger = new FileLogger();
        fileLogger.persist("captchaService ...");
    }
}
