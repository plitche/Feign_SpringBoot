package Feign.com;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
public class MemberDTO {

    private String id;
    private String name;
    private int age;

    public MemberDTO(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
}
