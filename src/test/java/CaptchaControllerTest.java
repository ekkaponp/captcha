import controller.CaptchaController;
import org.junit.Test;
import service.CaptchaService;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by cadet on 1/7/15 AD.
 */
public class CaptchaControllerTest {

    @Test
    public void captchaControllerIsCalled() {
        CaptchaService captchaService = mock(CaptchaService.class);
        CaptchaController captchaController = new CaptchaController();
        captchaController.setCaptchaService(captchaService);
        captchaController.getCaptcha();

        verify(captchaService).randomCaptcha();
    }
}
