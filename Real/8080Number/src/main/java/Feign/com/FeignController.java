package Feign.com;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
@RequiredArgsConstructor
public class FeignController {

    final FeignInterface feignInterface;

    @GetMapping("/random")
    public int getRandomNumber() {
        return feignInterface.getRandomNumber();
    }

    @GetMapping("/random/sum/{number}")
    public int sumNumber(@PathVariable int number) {
        return feignInterface.sumNumber(number);
    }

}
