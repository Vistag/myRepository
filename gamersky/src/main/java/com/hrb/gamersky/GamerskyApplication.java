package com.hrb.gamersky;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hrb.gamersky.mapper")
public class GamerskyApplication {

    public static void main(String[] args) {
        SpringApplication.run(GamerskyApplication.class, args);
    }

}
