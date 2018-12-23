package com.eshop.mng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class MngApplication {

    public static void main(String[] args) {
        SpringApplication.run(MngApplication.class, args);
    }

}

