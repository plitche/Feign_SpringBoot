package Feign.com;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/math")
public class MainController {

    final FeignInterface feignInterface;

    private int randomNumber = 0;

    @GetMapping("/random")
    public int getRandomNumber() {
        this.randomNumber = (int)(Math.random() * 9 + 1);
        System.out.println("randomNumber = " + randomNumber);
        return this.randomNumber;
    }

    @GetMapping("/random/sum/{number}")
    public int sumNumber(@PathVariable int number) {
        if (this.randomNumber == 0) {
            feignInterface.getRandomNumber();
        }

        return this.randomNumber + number;
    }

}