package Feign.com.practice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    private List<ProductDTO> productList = new ArrayList<>();

    public ProductService() {
        this.productList.add(new ProductDTO("java", 10000));
        this.productList.add(new ProductDTO("vue", 20000));
        this.productList.add(new ProductDTO("react", 30000));
        this.productList.add(new ProductDTO("sql", 40000));
    }

    public ProductDTO getProductByName(String productName){
        Optional<ProductDTO> foundProduct = productList.stream()
                .filter(p -> p.getName().equals(productName)).findFirst();

        return foundProduct.get();
    }

}
