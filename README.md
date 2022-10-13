# Feign_SpringBoot

## Feign이란?
 - Feign Client: 스프링 환경에서 간편하게 외부 api를 호출할 수 있는 라이브러리
 - RestTemplate 보다 훨씬 더 간편하게 api를 호출 할 수 있다.

![image](https://user-images.githubusercontent.com/70326085/195629873-f306f05d-6169-4124-8735-6a4dab3d178b.png)

## Dependencies setting(Library import)
```text
  ext {
    set('springCloudVersion', "2020.0.2")
  }

// feign client
implementation 'org.springframework.cloud:spring-cloud-starter-openfeign'
implementation group : 'io.github.openfeign', name: 'feign-gson', version: '11.0'
```  
