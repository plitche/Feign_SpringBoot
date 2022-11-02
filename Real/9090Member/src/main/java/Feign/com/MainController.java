package Feign.com;

import Feign.com.FeignInterface;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MainController {

    final MemberService memberService;

    @GetMapping("/info/{id}")
    public MemberDTO getMemberInfo(@PathVariable String id) {
        MemberDTO memberInfo = memberService.getMemberInfo(id);
        return memberInfo;
    }


}
