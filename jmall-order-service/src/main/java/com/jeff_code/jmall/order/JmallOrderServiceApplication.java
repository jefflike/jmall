package com.jeff_code.jmall.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.jeff_code.jmall")
@MapperScan(basePackages = "com.jeff_code.jmall.order.mapper")
public class JmallOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(JmallOrderServiceApplication.class, args);
    }
}
