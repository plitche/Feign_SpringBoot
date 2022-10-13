package Feign.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients // Feign Client를 사용할 것임을 알려줍니다.
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
