# Feign_SpringBoot

## Feign이란?
 - Feign 은 Netflix 에서 개발된 Http client binder  
 - Feign 을 사용하면 웹 서비스 클라이언트를 보다 쉽게 작성할 수 있다.  
 - Feign 을 사용하기 위해서는 interface 를 작성하고 annotation 을 선언 하기만 하면됩니다.  
	(마치 Spring Data JPA 에서 실제 쿼리를 작성하지 않고 Interface 만 지정하여 쿼리실행 구현체를 자동으로 만들어주는 것과 유사)  
 - Feign Client: 스프링 환경에서 간편하게 외부 api를 호출할 수 있는 라이브러리
 - RestTemplate 보다 훨씬 더 간편하게 api를 호출 할 수 있다.
 
 
 - Interface 선언을 통해 자동으로 Http Client를 생성
 - RestTemplate은 concreate 클래스라 테스트하기 어렵다
 

![image](https://user-images.githubusercontent.com/70326085/195629873-f306f05d-6169-4124-8735-6a4dab3d178b.png)

## Dependencies setting(Library import)  
```text
ext {
	set('springCloudVersion', "2021.0.3")
}  
  
dependencyManagement {
	imports {
		mavenBom "org.springframework.cloud:spring-cloud-dependencies:${springCloudVersion}"
	}
}
  
apply plugin: "io.spring.dependency-management"  
  
dependencies {
	// feign client
	// https://spring.io/projects/spring-cloud 의 Release Trains
	implementation 'org.springframework.cloud:spring-cloud-starter-openfeign'
}
```  
