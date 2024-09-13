package springboot.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
    @GetMapping("/message")
    public String getMessage(Model module){
        module.addAttribute("message","Hello World1111");

        return "message";
    }

}
