package top;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
 // 启用调度功能
public class Application {
    public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
    }
}
