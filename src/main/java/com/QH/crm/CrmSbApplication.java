package com.QH.crm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.QH.crm.settings.mapper", "com.QH.crm.workbench.mapper"})
public class CrmSbApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmSbApplication.class, args);
    }

}
