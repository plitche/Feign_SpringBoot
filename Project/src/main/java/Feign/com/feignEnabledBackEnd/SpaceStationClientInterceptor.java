package Feign.com.feignEnabledBackEnd;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class SpaceStationClientInterceptor implements RequestInterceptor {

    @Override
    public void apply(RequestTemplate template) {
        template.header("myHeaderKey", "myVar1");
        log.warn("### We are using a custom INTERCEPTOR");
    }
}
