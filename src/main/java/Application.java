import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import service.CaptchaService;
import util.FileLogger;
import util.Logger;
import util.Randomizer;

/**
 * Created by cadet on 1/7/15 AD.
 */

    @ComponentScan
    @EnableAutoConfiguration
    public class Application {
        @Bean
        Randomizer randomizer() {
            return new Randomizer();
        }

        @Bean
        Logger logger() {
            return new FileLogger();
        }

        @Bean
        CaptchaService captchaService() {
            CaptchaService captchaService = new CaptchaService();
            captchaService.setRandomizer(randomizer());
            captchaService.setLogger(logger());
            return captchaService;
        }



        public static void main(String[] args) {
            ApplicationContext ctx = SpringApplication.run(Application.class, args);
        }
    }

