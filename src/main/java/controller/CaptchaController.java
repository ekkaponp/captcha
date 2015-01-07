package controller;

import model.Captcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import service.CaptchaService;
import util.FileLogger;
import util.Randomizer;

/**
 * Created by cadet on 1/7/15 AD.
 */
@RestController
public class CaptchaController {

    private CaptchaService captchaService;

    @RequestMapping("/captcha")
    public String getCaptcha() {
        return captchaService.randomCaptcha().toString();
    }

    @Autowired
    public void setCaptchaService(CaptchaService captchaService) {
        this.captchaService = captchaService;
    }
}
