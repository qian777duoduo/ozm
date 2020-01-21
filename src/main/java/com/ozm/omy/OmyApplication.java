package com.ozm.omy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@MapperScan("com.ozm.omy.mapper")
public class OmyApplication {

    public static void main(String[] args) {
        SpringApplication.run(OmyApplication.class, args);
    }

}
