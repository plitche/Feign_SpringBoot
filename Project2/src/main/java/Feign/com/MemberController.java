package Feign.com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @GetMapping("/getMemberInfo/{message}")
    public MemberDTO getMemberInfo(@PathVariable String message) {
        return new MemberDTO("plitche", "male", 31, message);
    }
}
