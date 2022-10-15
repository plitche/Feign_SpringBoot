package Feign.com.controller;

import Feign.com.FeignInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MainController {

    private FeignInterface feignInterface;

    @GetMapping("/getFirstResponse")
    public String getFirstResponse() {
        feignInterface.status(1);

        return "hello world";
    }

}
