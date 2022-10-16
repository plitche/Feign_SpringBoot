package Feign.com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignClientController {

    @Autowired
    FeignClientInterface feignClientInterface;

    @GetMapping("/feignProduct/{name}")
    public ProductDTO getFeignProduct(@PathVariable String name) {
        ProductDTO product = feignClientInterface.findProductByName(name);
        return product;
    }
}
