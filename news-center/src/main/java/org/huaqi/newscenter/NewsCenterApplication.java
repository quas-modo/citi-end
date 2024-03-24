package org.huaqi.newscenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("org.huaqi.newscenter.mapper")
public class NewsCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(NewsCenterApplication.class, args);
    }
}
