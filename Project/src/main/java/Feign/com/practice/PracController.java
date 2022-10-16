package Feign.com.practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PracController {

    @Autowired
    ProductService productService;

    @GetMapping("/product/{name}")
    public ProductDTO findProduct(@PathVariable String name) {
        return productService.getProductByName(name);
    }


}
