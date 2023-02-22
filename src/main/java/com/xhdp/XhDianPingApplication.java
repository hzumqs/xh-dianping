package com.xhdp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.xhdp.mapper")
@SpringBootApplication
public class XhDianPingApplication {

    public static void main(String[] args) {
        SpringApplication.run(XhDianPingApplication.class, args);
    }

}
