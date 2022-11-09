package com.sswu_gdsc_2022_a.withparentsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WithParentsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(WithParentsDemoApplication.class, args);
    }

}
