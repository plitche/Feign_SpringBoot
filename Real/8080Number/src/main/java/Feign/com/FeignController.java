package Feign.com;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/feign")
@RequiredArgsConstructor
public class FeignController {

    final FeignInterface feignInterface;

    @GetMapping("/random")
    public int getRandomNumber() {
        return feignInterface.getRandomNumber();
    }

    @GetMapping("/random/sum/{number}")
    public int sumNumber(@PathVariable int number) {
        return feignInterface.sumNumber(number);
    }
    /**
     * localhost:8080 port의 Project에서 Feign CLient Interface를
     * 통해 localhost:9090 port의 Controller에 접근했을때에 Network 통신이 몇번 발생할까?
     *    - 1번! 처음 8080의 Controller에 접근했을때의 통신만 발생한다.

     * localhost:8080에서 localhost:9090에 Controller에 접근 시 9090에서 오류가 발생하면 몇번대의 status가 return 될까?
     *   - 500번대 Server Error

     * localhost:8080에서 localhost:9090에 없는 Mapping값의 Controller로 접근 시 몇번대의 status가 return 될까?
     *   - client Error status 400번대가 아닌 500번대 Server Error 발생

     * localhost:8080에서 localhost:9090의 Controller에 호출 시 9090에만 있는 DTO 타입으로 return시 8080에서는 어떠한 타입으로 받아야 할까?
     *   - Map
    */

}
