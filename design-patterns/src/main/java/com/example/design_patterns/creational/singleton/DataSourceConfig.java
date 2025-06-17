package com.example.design_patterns.creational.singleton;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;


/**
 *  Singleton은 "전역 접근"이 편리하다는 이유로 남용되는 경우가 많음
 *  그러나 Singleton은 "단 하나의 인스턴스가 기술적으로 강제되어야 하는 경우"에만 써야함
 *  의존성을 쉽게 가져다 쓰기 위해 사용해선 안됨
 *  getInstance()를 사용하는 순간, 클래스는 싱글톤 구현에 강하게 결합되며
 *  테스트 하기 어렵고, 재사용성이 낮아지고, 자유롭지 않은 구성이 됨
 *  인터페이스를 생성자나 setter로 전달받게 하자 -> ex) 스프링 DI 프레임워크
 *
 *  싱글톤은 "두번 이상 인스턴스를 만들면 시스템이 고장나는 경우"
 *  예를들어 특정 하드웨어 리소스나 소프트웨어 자원을 중복해서 호출하거나 할당하면
 *  애플리케이션이 제대로 동작하지 않는 경우에 사용
 */

@Configuration
public class DataSourceConfig {

    @Bean
    public DataSource dataSource() {
        return DataSourceBuilder.create()
                .url("DB주소")
                .username("username")
                .password("password")
                .build();
    }

}
