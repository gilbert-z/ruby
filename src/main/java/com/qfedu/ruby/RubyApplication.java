package com.qfedu.ruby;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(value="com.qfedu.ruby.dao")
@SpringBootApplication
public class RubyApplication {

    public static void main(String[] args) {
        SpringApplication.run(RubyApplication.class, args);
    }

}

