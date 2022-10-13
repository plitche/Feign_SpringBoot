# Feign_SpringBoot

## Feign이란?
 - Feign Client: 스프링 환경에서 간편하게 외부 api를 호출할 수 있는 라이브러리
 - RestTemplate 보다 훨씬 더 간편하게 api를 호출 할 수 있다.


## Dependencies setting(Library import)
```text
  ext {
    set('springCloudVersion', "2020.0.2")
  }

// feign client
implementation 'org.springframework.cloud:spring-cloud-starter-openfeign'
implementation group : 'io.github.openfeign', name: 'feign-gson', version: '11.0'
```  
