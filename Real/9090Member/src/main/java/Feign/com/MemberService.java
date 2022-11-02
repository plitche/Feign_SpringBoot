package Feign.com;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MemberService {

    private List<MemberDTO> memberDTOList = new ArrayList<>();

    public MemberService() {
        this.memberDTOList.add(new MemberDTO("kim25", "kim", 25));
        this.memberDTOList.add(new MemberDTO("lee30", "lee", 30));
        this.memberDTOList.add(new MemberDTO("kwon50", "kwon", 50));
    }

    public MemberDTO getMemberInfo(String id){
        Optional<MemberDTO> foundProduct = memberDTOList.stream()
                .filter(m -> m.getId().equals(id)).findFirst();

        return foundProduct.get();
    }

}
