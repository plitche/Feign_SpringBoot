package Feign.com.practice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@FeignClient(value = "member", url = "localhost:9091")
public interface FeignMemberClientInterface {

    @RequestMapping("/getMemberInfo/{message}")
    Map<Object, String> getMemberInfo(@PathVariable String message);

    @RequestMapping("/getError")
    int getError();

}
