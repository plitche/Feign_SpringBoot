package Feign.com;

import lombok.Data;

@Data
public class MemberDTO {

    private String name;
    private String gender;
    private int age;
    private String message;

    public MemberDTO(String name, String gender, int age, String message) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.message = message;
    }
}
