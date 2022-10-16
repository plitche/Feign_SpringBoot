package Feign.com.practice;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class ProductDTO {

    private String name;
    private int price;

    public ProductDTO(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
