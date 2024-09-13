package springboot.thymeleaf;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
            SpringApplication.run(Application.class, args);
    }

    @GetMapping("/name")
    public String hello(String name){
        String greetion = "Hello, 1111" + name;
        return greetion;
    }
    @GetMapping("/square")
    public String calculateSquare(@RequestParam double number) {
        System.out.println("接收到的浮点数参数： " + number);
        double square = number * number;
        System.out.println("平方值为： " + square);
        return "平方值为: " + square;
    }
}
