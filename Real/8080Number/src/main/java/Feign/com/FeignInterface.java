package Feign.com;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name="number", url="localhost:9090")
public interface FeignInterface {

    @RequestMapping("/math/random")
    int getRandomNumber();

    @RequestMapping("/math/random/sum/{number}")
    int sumNumber(@PathVariable int number);

}
