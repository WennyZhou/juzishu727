package com.juzishu727;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan(value = {"com.juzishu727.dao"})
@SpringBootApplication
@EnableTransactionManagement //事务支持
public class Zhf2Application {

    public static void main(String[] args) {
        SpringApplication.run(Zhf2Application.class, args);
    }

}
