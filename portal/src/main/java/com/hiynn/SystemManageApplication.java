package com.hiynn;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableTransactionManagement
@ServletComponentScan
@EnableSwagger2
@MapperScan("com.hiynn.*.dao")
public class SystemManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(SystemManageApplication.class, args);
    }
	
	


}
