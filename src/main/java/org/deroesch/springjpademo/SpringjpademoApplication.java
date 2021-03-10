package org.deroesch.springjpademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootApplication
public class SpringjpademoApplication {

    public static void main(String[] args) {
        log.info("Starting");
        SpringApplication.run(SpringjpademoApplication.class, args);
    }

}
