import org.junit.Ignore;
import service.CaptchaService;
import model.Captcha;
import org.junit.Test;
import util.FileLogger;
import util.Logger;
import util.Randomizer;

import java.io.IOException;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class CaptchaServiceTest {

    @Test
    @Ignore
    public void resultShouldBe1PlusOneWhenInputIs1111() {
        CaptchaService captchaService = new CaptchaService();

        captchaService.setRandomizer(getRandomizer());
        Captcha captcha = captchaService.randomCaptcha();

        assertEquals("1 + One", captcha.getLeft() + " " + captcha.getOperator() + " " + captcha.getRight());
    }

    @Test
    @Ignore
    public void resultShouldBe2PlusOneWhenInputIs1211() {
        CaptchaService captchaService = new CaptchaService();

        captchaService.setRandomizer(getRandomizer());
        Captcha captcha = captchaService.randomCaptcha();

        assertEquals("1 + One", captcha.getLeft() + " " + captcha.getOperator() + " " + captcha.getRight());
    }

    @Test
    public void logShouldBeWrittenWhenServiceIsRequested() throws IOException {
        CaptchaService captchaService = new CaptchaService();
        captchaService.setRandomizer(new Randomizer());

        Logger logger = mock(FileLogger.class);
        captchaService.setLogger(logger);

        Captcha captcha = captchaService.randomCaptcha();

        verify(logger).persist(anyString());
    }

    @Test
    @Ignore
    public void logShouldNotWrittenWhenServiceIsNotRequested() throws IOException {
        CaptchaService captchaService = new CaptchaService();
        captchaService.setRandomizer(new Randomizer());

        FileLogger fileLogger = mock(FileLogger.class);
        captchaService.setLogger(fileLogger);

        verify(fileLogger).persist(anyString());
    }

    public static Randomizer getRandomizer() {
        Randomizer randomizer = mock(Randomizer.class);
        when(randomizer.getPattern()).thenReturn(1);
        when(randomizer.getOperator()).thenReturn(1);
        when(randomizer.getOperand()).thenReturn(1);

        return randomizer;
    }
}
