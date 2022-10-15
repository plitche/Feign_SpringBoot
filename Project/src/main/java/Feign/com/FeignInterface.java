package Feign.com;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(value="feignExample", url="localhost:9090")
public interface FeignInterface {

    @GetMapping("/status/")
    void status(@PathVariable("status") int status);

    @GetMapping(value = "/status/")
    void status3(@RequestHeader("key3") String headers, @PathVariable("status") int status);

    // 이 호출은 Header 에 값이 설정되지 않습니다.
    // @GetMapping 은 SpringMVcContract 를 사용해야하고, @Headers 는 feign Contract 를 사용해야 합니다.
    @org.springframework.web.bind.annotation.GetMapping(value = "/status/")
    @feign.Headers("key3: value3")
    void status4(@PathVariable("status") int status);
}
