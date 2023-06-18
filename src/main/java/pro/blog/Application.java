package pro.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by naqi
 *
 * @author naqi
 * @since 2023/6/18 20:00
 */
@SpringBootApplication
@EnableWebMvc
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
