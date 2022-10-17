package Feign.com;

import lombok.Data;

@Data
public class MemberDTO {

    private String name;
    private String gender;
    private int age;

    public MemberDTO(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
}
