package com.example.p_64_260806;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class AppConfig {

//    @Bean
//    public PersonService personService(){
//        System.out.println("AppConfig.personService 호출됨!");
//        return new PersonService();
//    }


    //어떤 객체는 초기화 작업을 복잡하게 해야할때도 있다.
    //이럴때 AppConfig를 통해 빈을 주입하면 좋음
    //만약 이렇게 하지않고 단순하게 빈을 등록기만 하면 되면 @Component같은 방식을 쓰자
    @Bean
    public PersonRepository personRepository() {
        return new PersonRepository(1);
    }

    @Bean
    public PersonRepository personRepositoryV2() {
        return new PersonRepository(2);
    }


    @Bean
    @Order
    public ApplicationRunner myApplicationRunner2() {
        return args -> {
            work1();
            work2();
        };
    }

    public void work1() {
        System.out.println("work1");
    }

    public void work2() {
        System.out.println("work2");
    }

    @Bean
    @Order(1)
    public ApplicationRunner myApplicationRunner1(){
        System.out.println("myApplicationRunner1");
        return new MyApplicationRunner(1);
    }
}
