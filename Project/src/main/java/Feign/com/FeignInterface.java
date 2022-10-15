package Feign.com;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value="feignExample", url="localhost:9090")
public interface FeignInterface {

    @GetMapping("/status")
    void status(@PathVariable("status") int status);

}
