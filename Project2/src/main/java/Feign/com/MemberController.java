package Feign.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/getMemberInfo")
    public MemberDTO getMemberInfo() {
        return new MemberDTO("plitche", "male", 31);
    }
}
