package Feign.com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class FeignClientController {

    @Autowired
    FeignClientInterface feignClientInterface;

    @Autowired
    FeignMemberClientInterface feignMemberClientInterface;

    @GetMapping("/feignProduct/{name}")
    public ProductDTO getFeignProduct(@PathVariable String name) {
        ProductDTO product = feignClientInterface.findProductByName(name);
        return product;
    }

    @GetMapping("/feignMember/{message}")
    public Map<Object, String> getMemberInfo(@PathVariable String message) {
        return feignMemberClientInterface.getMemberInfo(message);
    }
}
