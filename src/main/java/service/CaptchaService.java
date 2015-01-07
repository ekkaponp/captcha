package service;

import model.Captcha;
import util.Logger;
import util.Randomizer;

import java.io.IOException;
import java.util.Date;

/**
 * Created by cadet on 1/6/15 AD.
 */
public class CaptchaService {

    private Randomizer randomizer;
    private Logger logger;

    public Captcha randomCaptcha() {
        int pattern = randomizer.getPattern();
        int operator = randomizer.getOperator();
        int leftOperand = randomizer.getOperand();
        int rightOperand = randomizer.getOperand();
        Captcha captcha = new Captcha(pattern,leftOperand,operator,rightOperand);

        try {
            logger.persist(getLogFormat());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return captcha;
    }

    public String getLogFormat() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(new Date());
        stringBuilder.append(",");
        stringBuilder.append("192.168.0.1");
        stringBuilder.append(",");
        stringBuilder.append("ADMIN");
        stringBuilder.append(",");
        stringBuilder.append("http://localhost:7001/");
        return stringBuilder.toString();
    }

    public void setRandomizer(Randomizer randomizer) {
        this.randomizer = randomizer;
    }

    public void setLogger(Logger logger) {
        this.logger = logger;
    }
}
