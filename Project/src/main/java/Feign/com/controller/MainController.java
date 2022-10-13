package Feign.com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/getFirstResponse")
    public String getFirstResponse() {
        return "hello world";
    }

}
