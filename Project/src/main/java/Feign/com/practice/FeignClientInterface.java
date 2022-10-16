package Feign.com.practice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "product", url = "localhost:9090")
public interface FeignClientInterface {

    @RequestMapping("/product/{name}")
    ProductDTO findProductByName(@PathVariable String name);

}
